package chapter01.ioc.imports;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Dog.class,MySelector.class,MyBeanRegester.class})
public class MainTest
{
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MainTest.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(".....................");
        context.getBean("xx");
    }
}
