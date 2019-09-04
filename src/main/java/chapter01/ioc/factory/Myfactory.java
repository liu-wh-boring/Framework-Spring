package chapter01.ioc.factory;

import org.springframework.beans.factory.FactoryBean;

public class Myfactory implements FactoryBean<Red>
{

    @Override
    public Red getObject() throws Exception {
        return new Red("colour","hb");
    }

    @Override
    public Class<Red> getObjectType() {
        return Red.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public String toString()
    {
        return "如果我们就想要获取这个工厂bean，我们就可以在id的前面加上一个\"&\"符号";
    }
}
