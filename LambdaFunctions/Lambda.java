package LambdaFunctions;

interface PrintInterface {
    void print();
}

interface MathInterface {
    void operate(int a, int b);
}

public class Lambda {

    public void printFunction(PrintInterface printInterface) {
        printInterface.print();
    }

    public void mathFunction(MathInterface mathInterface) {
        mathInterface.operate(5, 4);
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();

        lambda.printFunction(() -> System.out.println("Hello"));

        lambda.mathFunction((int a, int b) -> {
            int add = a + b;
            int sub = a - b;
            int mul = a * b;
            int div = a / b;
            System.out.println("Addition: " + add);
            System.out.println("Subtract: " + sub);
            System.out.println("Multiply: " + mul);
            System.out.println("Divisin: " + div);
        });
    }

}
