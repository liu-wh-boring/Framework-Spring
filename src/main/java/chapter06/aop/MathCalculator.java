package chapter06.aop;

import org.springframework.stereotype.Component;

@Component
public class MathCalculator
{
    //除法
    public int div(int i, int j) {
        System.out.println("MathCalculator...div...");
        return i / j;
    }
}
