public class HelloApp {
    public static void main(String[] args) {

        StringBuilder names = new StringBuilder();

        // Check if no arguments are provided
        if (args.length == 0) {
            names.append("World");
        } else {
            // Enhanced for loop to iterate through arguments
            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", ");
                }
                names.append(name);
            }
        }

        // Print the greeting
        System.out.println("Hello, " + names + "!");
    }
}
