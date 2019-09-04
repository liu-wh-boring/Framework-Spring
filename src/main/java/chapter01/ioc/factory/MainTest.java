package chapter01.ioc.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainTest
{
    @Bean
    public Myfactory myfactory()
    {
        return new Myfactory();
    }

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MainTest.class);

        //获取工厂方式产生的类
        Red red = (Red) context.getBean("myfactory");
        System.out.println(red);

        //如果我们就想要获取这个工厂bean，我们就可以在id的前面加上一个"&"符号
        Object factory = context.getBean("&myfactory");
        System.out.println(factory);
    }
}
