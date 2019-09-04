package chapter02.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Car3 extends Car2
{
    @PostConstruct
    public void postConstruct()
    {
        System.out.println("@PostConstruct .....");
    }

    @PreDestroy
    public void preDestroy()
    {
        System.out.println("@PreDestroy......");
    }
}
