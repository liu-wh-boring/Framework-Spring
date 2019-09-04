package chapter01.ioc.scan.filter;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

@Configuration
/*
    ANNOTATION, 按照注解类型 controller servers component repository
    ASSIGNABLE_TYPE, 按照指定的类型
    ASPECTJ,
    REGEX,正则表达式
    CUSTOM; 自定义类型
 */
//@ComponentScan(useDefaultFilters = false , includeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = Chair.class))
//@ComponentScan(value = "com.chapter01.ioc.scan.filter",useDefaultFilters = false ,includeFilters = @ComponentScan.Filter(type = FilterType.CUSTOM,classes = MyFilter.class))
//@ComponentScan(useDefaultFilters = false,includeFilters = @ComponentScan.Filter(type = FilterType.REGEX,value = "*C"))
public class MainTest
{
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainTest.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

}
