import java.util.Date;

public class Task171018 {
    public static void main(String[] args) {
        func2();
    }

    public static void func1() {
        Date date = new Date();
        System.out.println("The elapsed time since Jan 1 1970 is " + date.getTime() + " milliseconds");
        System.out.println(date.toString());
    }

    public static void func2() {
        TestStatic ts1 = new TestStatic();
        TestStatic ts2 = new TestStatic();
    }
}

class TestStatic {
    static int staticvar = 0;

    TestStatic() {
        ++staticvar;
        System.out.println("This is the " + staticvar + " object");
    }
}