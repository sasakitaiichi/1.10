package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Test04 {
    @myAnnotation2(name="Andrew",age=30,schools = "Qinghua")
    public void testAnnotatioon2(){

    }
}
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
@interface myAnnotation2{
    String name() default " ";
    int age() default 0;

    String[] schools() default {"Harward","Qinghua"};
}
