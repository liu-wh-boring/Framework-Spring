package chapter02.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car2 extends Car implements InitializingBean,DisposableBean
{

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean init ......");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy ......");
    }
}
