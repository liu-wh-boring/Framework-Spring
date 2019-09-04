package chapter01.ioc.scan;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Repository;

@Configuration
/**
 * CompentScan是可以重复设置的
 * 但是也可以采用这种方式ComponentScans
 */
@ComponentScans(value = @ComponentScan(value = "com.chapter01.ioc.scan",useDefaultFilters = false,includeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION,classes = Repository.class)))
public class MainTest2
{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(MainTest2.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names)
        {
            System.out.println(name);
        }
    }
}
