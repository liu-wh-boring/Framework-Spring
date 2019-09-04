package chapter05.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:/zzy.properties")
@PropertySource("classpath:/gxt.properties")
public class MainTest
{
    @Autowired
    private Person person;

    @Bean
    @Profile("zzy")
    public Person zzy(@Value("${z.name}")String name,@Value("${z.age}")int age)
    {
        return new Person(name,age);
    }

    @Bean
    @Profile("gxt")
    public Person gxt(@Value("${g.name}")String name,@Value("${g.age}")int age)
    {
        return new Person(name,age);
    }

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.getEnvironment().setActiveProfiles("zzy");

        applicationContext.register(MainTest.class);
        applicationContext.refresh();


        System.out.println(applicationContext.getBean(MainTest.class).person);
        //System.out.println(applicationContext.getBean("gxt"));
    }

}
