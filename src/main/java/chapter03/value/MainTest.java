package chapter03.value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(value = "com.chapter03.value")
@PropertySource("classpath:/dog.properties")
public class MainTest
{
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainTest.class);
        System.out.println(applicationContext.getBean(DogValue.class));


        //读取配置文件里面的信息
        Environment environment = applicationContext.getEnvironment();
        String t = environment.getProperty("a");
        System.out.println(t);
    }
}
