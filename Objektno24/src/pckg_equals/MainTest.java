package pckg_equals;

public class MainTest {
    public static void main(String[] args) {
        User u1 = new User("Name1");
        User u2 = u1;//new User("Name1");

        System.out.println(u1);
        System.out.println(u2);
        u1.showHashCodeHex();
        u2.showHashCodeHex();

        System.out.println("----------------------------");
        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
    }
}
