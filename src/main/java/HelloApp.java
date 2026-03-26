public class HelloApp {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            for (String name : args) {   // enhanced for loop
                System.out.println("Hello, " + name + "!");
            }
        }
    }
}