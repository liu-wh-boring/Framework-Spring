package chapter01.ioc.conf;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration
{
    Configuration()
    {
        System.out.println("实例化 configuration ......");
    }
    @Bean(name = {"mi"})
    public Phone phone()
    {
        return new Phone();
    }

    public static void main(String[] args) {

       ApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(Configuration.class);
       String[] names = configApplicationContext.getBeanDefinitionNames();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
