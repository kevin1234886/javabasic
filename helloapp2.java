public class HelloApp {
    public static void main(String[] args) {

        StringBuilder nameBuilder = new StringBuilder();

        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Append each name followed by ", "
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove trailing ", " using substring
        String names = "";
        if (nameBuilder.length() > 0) {
            names = nameBuilder.substring(0, nameBuilder.length() - 2);
        }

        // Print the greeting
        System.out.println("Hello, " + names + "!");
    }
}
