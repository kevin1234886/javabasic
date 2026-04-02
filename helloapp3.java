public class HelloApp {
    public static void main(String[] args) {

        String greeting;

        // Check if no arguments are provided
        if (args.length == 0) {
            greeting = "Hello, World!";
        } else {
            // Use String.join to concatenate names
            String names = String.join(", ", args);
            greeting = "Hello, " + names + "!";
        }

        // Print the greeting
        System.out.println(greeting);
    }
}
