package chapter04.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

/**
 * Spring利用依赖注入（DI）完成对IOC容器中各个组件的依赖关系赋值
 * 1）@Autowired：自动注入
 * （1）默认优先按照类型去容器中去找对应的组件：applicationContext.getBean(BookDao.class);如果找到了则进行赋值；
 * （2）如果找到了多个相同类型的组件，再将属性的名称作为组件的id去容器中查找applicationContext.getBean(“bookDao”)
 * （3）@Qualifier("bookDao")：使用 @Qualifier 指定需要装配的组件的id，而不是使用属性名
 * （4）自动装配默认一定要将属性赋值好，没有就会报错，可以使用@Autowired(required = false);来设置为非必须的
 * （5）可以利用@Primary：让Spring在进行自动装配的时候，默认使用首选的bean.也可以继续使用@Qualifier("bookDao")来明确指定需要装配的bean的名字
 */
@Configuration
@ComponentScan
public class MainTest
{
    @Bean("pet")
    public Dog dog()
    {
        return new Dog("宠物");
    }

    @Bean("garder")
    public Dog dog2()
    {
        return new Dog("警卫");
    }

    @Bean("meyisi")
    public Dog dog3()
    {
        return new Dog("meyisi");
    }

    @Bean
    @Primary //优先使用
    public Dog dog4()
    {
        return new Dog("优等生");
    }

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MainTest.class);
        System.out.println(context.getBean(Person.class));
    }
}
