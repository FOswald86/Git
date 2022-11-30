public class Main {
    public static void main(String[] args) {

        printHelloWorld();
        printHelloWorld("test");
        printHelloWorld("another test", 10);
    }

    private static void printHelloWorld() {
        System.out.println("Hello world!");
    }

    private static void printHelloWorld(String output) {
            System.out.println(output);
    }

    private static void printHelloWorld(String output, int counter) {
        for (int i = 0; i < counter; i++) {
            System.out.println(output);
        }
    }
}