package chapter01.ioc.imports;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyBeanRegester implements ImportBeanDefinitionRegistrar
{

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {

        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Cat.class);
        rootBeanDefinition.setScope("singleton");
        rootBeanDefinition.setLazyInit(true);
        beanDefinitionRegistry.registerBeanDefinition("xx",rootBeanDefinition);
    }
}
