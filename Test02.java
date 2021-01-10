package annotation;

public class Test02 {
    public static void main(String[] args) {
     testDeprecated();
    }
    //不方便程序员使用 有更好的方法
    @Deprecated
    public static void testDeprecated() {
    }
    @SuppressWarnings({"unused","test"})
    public static void unusedMethod(){
    }
}
