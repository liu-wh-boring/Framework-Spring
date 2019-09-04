package chapter04.autowired.method;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@AllArgsConstructor
public class Fish
{
   // @Value("我是一条鱼")
    private String fish;
}
