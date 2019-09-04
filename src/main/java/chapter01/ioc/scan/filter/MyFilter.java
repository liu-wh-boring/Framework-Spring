package chapter01.ioc.scan.filter;

import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class MyFilter implements TypeFilter
{

    /**
     *
     * @param metadataReader 读取到的当前扫描的类的信息
     * @param metadataReaderFactory 可以获取其他任何类的信息
     * @return
     * @throws IOException
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException
    {
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        return classMetadata.isFinal();
    }
}
