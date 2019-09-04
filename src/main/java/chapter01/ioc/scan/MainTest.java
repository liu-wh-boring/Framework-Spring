package chapter01.ioc.scan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Configuration

//扫描当前包下面的所有目录
//@ComponentScan

//扫描指定的包
//@ComponentScan(value = {"com.chapter01.ioc.conf"})

//排除部分包
//@ComponentScan(value = "com.chapter01.ioc.scan",excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Repository.class}))

//只包含，注意需要禁用掉默认过滤规则
@ComponentScan(value = "com.chapter01.ioc.scan",useDefaultFilters = false ,includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Repository.class}))
public class MainTest
{
    public static void main(String[] args) {

        for(String name : new AnnotationConfigApplicationContext(MainTest.class).getBeanDefinitionNames())
        {
            System.out.println(name);
        }
    }
}
