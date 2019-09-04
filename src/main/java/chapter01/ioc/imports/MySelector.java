package chapter01.ioc.imports;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;

public class MySelector implements ImportSelector
{
    /**
     * 返回值不能是空
     * @param annotationMetadata
     * @return 返回需要的组件的全类名的数组
     */
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata)
    {
        Set<String> annotationTypes = annotationMetadata.getAnnotationTypes();
        System.out.println("======="+annotationTypes);
        return new String[]{"com.chapter01.ioc.conf.Phone"};
    }
}
