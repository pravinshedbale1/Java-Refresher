public class NonStaticDemo {

    int nonStaticVar = 10;

    {
        System.out.println("Non Static Block");
        System.out.println(nonStaticVar);
    }

    NonStaticDemo() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        NonStaticDemo demo = new NonStaticDemo();
        NonStaticDemo demo2s = new NonStaticDemo();
        // demo.nonStaticBlock();
        System.out.println("Main Method");
    }
}
