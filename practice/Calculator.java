//a functional interface is an interface with exactly one abstract method
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
    //can only have one abstract method, but can have many other methods
    default void greet() {
        System.out.println("Hello");
    }

    static void info() {
        System.out.println("Information");
    }
}