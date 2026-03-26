public class HelloApp {
    public static void main(String[] args) {

        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Append all names with ", "
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove the last ", "
            if (nameBuilder.length() > 0) {
                nameBuilder.setLength(nameBuilder.length() - 2);
            }

            // Print final output
            System.out.println("Hello, " + nameBuilder.toString() + "!");
        }
    }
}