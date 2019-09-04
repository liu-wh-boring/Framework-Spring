package chapter01.ioc.lazy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
public class MainTest
{
    @Bean
    @Lazy(value = true) //true表示懒加载模式
    public Person person()
    {
        System.out.println("初始化了。。。。。。");
        return new Person();
    }

    @Bean
    @Scope("prototype") //scope = prototype 都是懒加载模式
    @Lazy(false) //设置成false无效
    public Person person2()
    {
        System.out.println("初始化了2。。。。。。。。。");
        return new Person();
    }

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MainTest.class);
    }

}
