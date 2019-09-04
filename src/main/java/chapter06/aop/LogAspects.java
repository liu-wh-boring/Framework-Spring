package chapter06.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
/**
 * Aspect 切面。声明类似于 Java 中的类声明，在 Aspect 中会包含着一些 Pointcut 以及相应的 Advice。
 */
public class LogAspects
{
    //抽取公共的切入点表达式
    //本类引用：pointCut()
    //其他的切面类要引用
    @Pointcut("execution(public int com.chapter06.aop.MathCalculator.*(..))")
    public void pointCut() {

    }

    //@Before在目标方法之前切入：切入点表达式（指定在哪个方法切入）
    @Before("pointCut()")
    public void logStart() {
        System.out.println("除法运行...参数列表是：{}");
    }

    @After("pointCut()")
    public void logEnd() {
        System.out.println("除法结束...");
    }

    @AfterReturning("pointCut()")
    public void logReturn() {
        System.out.println("除法正常返回...运行结果为：{}");
    }
    @AfterThrowing("pointCut()")
    public void logException() {
        System.out.println("除法异常...异常信息为：{}");
    }
}
