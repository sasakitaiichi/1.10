package annotation;

import jdk.jfr.DataAmount;

import java.lang.annotation.*;

@myAnnotation
public class Test03 {
    public void testAnnotation() {

    }
}
@Target(value = {ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface myAnnotation {

}
