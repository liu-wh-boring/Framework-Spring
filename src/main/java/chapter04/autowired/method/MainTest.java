package chapter04.autowired.method;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

/**
 *
 */
@Configuration
@ComponentScan
public class MainTest
{
    @Bean("fish1")
    public Fish fish1()
    {
        return new Fish("1号鱼");
    }

    @Bean
    @Primary
    public Fish fish2()
    {
        return new Fish("2号鱼");
    }

    /**
     *
     *
     * @Autowired标注在@Bean方法上：参数通过类型获取，如果同类型过多，可以通过参数名名称获取。其中primary和require都可以使用，qualify无法使用。@可以省略
     *@Autowired标注在普通方法上，Spring容器在创建当前对象的时候，就会调用当前方法完成赋值；方法使用的参数，自定义类型的值从IOC容器里面进行获取,测试下来貌似只能使用类型进行匹配
     */
//    @Bean
//    @Autowired(required = false)
//    public Cat cat(Fish fish1,Mouse mouse)
//    {
//        return new Cat(mouse,fish1);
//    }

    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainTest.class);
        System.out.println(context.getBean(Cat.class));
    }
}
