public class HelloApp {
    public static void main(String[] args) {

        // Check for no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Join names with ", " delimiter
            String names = String.join(", ", args);

            // Print final greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}
