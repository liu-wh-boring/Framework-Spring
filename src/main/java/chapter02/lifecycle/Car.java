package chapter02.lifecycle;

public class Car
{
    public Car()
    {
        System.out.println("construtor .......");
    }

    public void initMethod()
    {
        System.out.println("init method .....");
    }

    public void destroyMethod()
    {
        System.out.println("destrory method......");
    }
}
