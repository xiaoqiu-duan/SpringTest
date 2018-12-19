package com.xq;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //1.创建spring的ioc容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
        //2.从ioc容器中获取bean实例
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWord");
        helloWorld.hello();
    }
}
