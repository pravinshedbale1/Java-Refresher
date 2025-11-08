public class StaticDemo {
    static int a = 10;
    static {
        System.out.println("called static block");
        staticMethod();
    }

    static void staticMethod() {
        System.out.println("called static method");
    }

    StaticDemo() {
        System.out.println("called constructor");
    }

    public static void main(String[] args) {
        System.out.println("called main method");
        staticMethod();
        StaticDemo demo = new StaticDemo();

    }
}
