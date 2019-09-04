package chapter01.ioc.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MainTest
{
    @Bean(name = "zs")
    //@Scope(value = "prototype")
    @Scope("singleton")
    public Person person()
    {
        return new Person("zhangsan",16);
    }

    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainTest.class);
        Person p1 = applicationContext.getBean(Person.class);
        Person p2 = applicationContext.getBean(Person.class);
        System.out.println(p1 == p2);

    }
}
