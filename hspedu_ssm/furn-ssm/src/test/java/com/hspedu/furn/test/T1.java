package com.hspedu.furn.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZhouYu
 * @version 1.0
 */
public class T1 {

    @Test
    public void t1(){
        //看看spring配置的Bean是否可以获取到

        //1、获取到容器
        ApplicationContext app =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取Bean
        System.out.println(app.getBean("pooledDataSource"));
        System.out.println(app.getBean("sqlSessionFactory"));
    }

}
