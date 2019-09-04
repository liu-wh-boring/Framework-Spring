package chapter07.jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import javafx.scene.chart.PieChart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@PropertySource("classpath:/db.properties")
@ComponentScan
@EnableTransactionManagement
public class MainTest
{
    @Bean
    @Lazy
    @Scope("singleton")
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("yourpassword");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/xg");
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() throws PropertyVetoException {
        ////Spring会的@Configuration类会做特殊的处理：给容器中添加组件，多次调用都是从容器中找组件
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public PlatformTransactionManager transactionManager() throws PropertyVetoException {
        return new DataSourceTransactionManager(dataSource());
    }

    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainTest.class);
        Action action = applicationContext.getBean(Action.class);
        System.out.println(action.insert("update document_person set name=? where id = ? ","tt",1));

    }

}
