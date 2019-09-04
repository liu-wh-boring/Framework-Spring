package chapter06.aop;

import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class MainTest
{

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainTest.class);
        //1.不要自己创建对象
        //MathCalculator mathCalculator = new MathCalculator();
        //mathCalculator.div(1, 1);
        //我们要中容器中获取组件
        MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);
        mathCalculator.div(1, 1);

    }

}
