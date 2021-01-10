package reflection;

public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c1 = Class.forName("reflection.User");

        System.out.println(c1);

//        User user1 = new User();

//        User user2 = (User) c1.newInstance();

//        boolean t = user2 instanceof User;
//        System.out.println(t);
    }
}

