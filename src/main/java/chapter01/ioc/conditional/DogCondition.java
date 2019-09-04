package chapter01.ioc.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class DogCondition implements Condition
{
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata)
    {
        Map map = annotatedTypeMetadata.getAnnotationAttributes("value");
        System.out.println("=="+map);
        return false;
    }
}
