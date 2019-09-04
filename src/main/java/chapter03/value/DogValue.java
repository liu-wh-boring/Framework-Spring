package chapter03.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class DogValue
{
    @Value("张三")//基本数值
    private String name;

    @Value("${dog.address}")//读取外部文件
    private String address;

    @Value("#{20-9}")//spel
    private Integer age;

    public DogValue()
    {

    }

    public DogValue(String name,String address,int age)
    {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "DogValue{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
