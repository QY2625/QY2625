package com.hspedu.reflection.class_;

import com.hspedu.Car;

import java.lang.reflect.Field;

/**
 * @author Zhou Yu
 * @version 1.0
 * 演示Class类的常用方法
 */
public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        String classAllPath = "com.hspedu.Car";
        //1.获取到Car类 对应的 Class对象
        //<?> 表示不确定的Java类型
        Class<?> cls = Class.forName(classAllPath);
        //2.输出cls
        System.out.println(cls);//显示cls对象，是哪个类的Class对象 com.hspedu.Car
        System.out.println(cls.getClass());//输出cls运行类型 class java.lang.Class
        //3.得到包名
        System.out.println(cls.getPackage().getName());//包名
        //4.得到全类名
        System.out.println(cls.getName());
        //5.通过cls创建对象实例
        Car car = (Car) cls.newInstance();
        System.out.println(car);//car.toString
        //6.通过反射获取属性 brand
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));//宝马
        //7. 通过反射给属性赋值
        brand.set(car,"奔驰");
        System.out.println(brand.get(car));//奔驰
        //8. 得到所有的属性(字段)
        System.out.println("=======所有的字段属性========");
        Field[] fields = cls.getFields();
        for (Field f : fields) {
            System.out.println(f.getName());//名称
        }
    }
}
