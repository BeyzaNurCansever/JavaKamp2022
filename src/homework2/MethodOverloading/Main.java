package homework2.MethodOverloading;

public class Main {
    public static void main(String[] args) {
        BasicArithmeticOperations basicArithmeticOperations = new BasicArithmeticOperations();
        System.out.println(basicArithmeticOperations.addition(7, 3));
        System.out.println(basicArithmeticOperations.addition(7, 3, 5));

    }
}