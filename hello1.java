public class HelloApp {
    public static void main(String[] args) {

        String names;

        if (args.length > 0) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                sb.append(args[i]);

                // Add comma only if not last element
                if (i < args.length - 1) {
                    sb.append(", ");
                }
            }

            names = sb.toString();
        } else {
            names = "World";
        }

        System.out.println("Hello, " + names + "!");
    }
}
