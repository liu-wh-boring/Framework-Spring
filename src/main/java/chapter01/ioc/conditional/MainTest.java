package chapter01.ioc.conditional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

public class MainTest
{

    @Bean
    @Conditional(DogCondition.class)
    public Dog dog()
    {
        return new Dog();
    }

    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainTest.class);
        for(String name:context.getBeanDefinitionNames())
        {
            System.out.println(name);
        }
    }
}
