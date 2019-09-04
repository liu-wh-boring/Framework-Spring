package chapter04.autowired.method;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Mouse
{
    @Value("我是一只小老鼠")
    private String name;
}
