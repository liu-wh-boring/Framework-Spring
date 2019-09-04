package chapter04.autowired;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Person
{
    @Autowired
    private Dog pet;

    @Autowired
    private Dog garder;

    @Autowired
    @Qualifier("meyisi")//指定名称
    private Dog what;

    @Autowired(required = false) //可以为空
    @Qualifier("nothing")
    private Dog nothing;

    @Autowired
    private Dog primary;

    public Person()
    {

    }

    public Person(Dog pet,Dog garder)
    {
        this.pet = pet;
        this.garder = garder;
    }
}
