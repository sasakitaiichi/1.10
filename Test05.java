package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test05 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("reflection.User");

        System.out.println(c1.getName());//获得包名和类名
        System.out.println(c1.getSimpleName());//只获得包名

        System.out.println("=================================");

        //Field[] fields=c1.getFields();//获取public属性
        Field[] fields = c1.getDeclaredFields();//获得全部属性
        for (Field item : fields) {
            System.out.println(item);
        }

        //获得指定属性
        //Field name=c1.getField("name");
        Field name = c1.getDeclaredField("name");
        System.out.println(name);

        //获取类的方法
        Method[] methods = c1.getMethods();
        for (Method item : methods) {
            System.out.println(item);
        }

        Method[] methods1 = c1.getDeclaredMethods();
        for (Method item : methods1) {
            System.out.println(item);
        }

        Method getName = c1.getMethod("getName", null);
        System.out.println(getName);

        Method setName = c1.getMethod("setName", String.class);
        System.out.println(setName);

        //获取构造器
        Constructor[] constructors = c1.getConstructors();
        for (Constructor item : constructors) {
            System.out.println(item);

//        Constructor[] constructors1=c1.getDeclaredConstructors();
            //       for (Constructor item:constructors1) {
            //          System.out.println(item);

            //获取指定的构造器
            Constructor declaredConstructor = c1
                    .getDeclaredConstructor(String.class, String.class, int.class);
            System.out.println(declaredConstructor);
        }
    }
}

