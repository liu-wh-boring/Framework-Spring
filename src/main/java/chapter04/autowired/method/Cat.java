package chapter04.autowired.method;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@ToString
@Component
public class Cat
{
    private Mouse mouse;

    private Fish fish;

    Cat(Fish fish,Mouse mouse)
    {
        this.fish = fish;
        this.mouse = mouse;
    }


    private String set( @Autowired Fish fish1, @Autowired Mouse mouse)
    {
        this.fish = fish;
        this.mouse = mouse;
        return "------";
    }
}
