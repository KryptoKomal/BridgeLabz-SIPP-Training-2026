public class PasswordValidator {

    public static void checkPassword(String password) {
        try {
          
            if (password == null) {
                System.out.println("Invalid: Password cannot be null.");
                return;
            }
            if (password.isEmpty()) {
                System.out.println("Invalid: Password cannot be empty.");
                return;
            }

            
            if (password.length() < 8) {
                System.out.println("Invalid: Password must be at least 8 characters long.");
                return;
            }

           
            if (!Character.isUpperCase(password.charAt(0))) {
                System.out.println("Invalid: First character must be uppercase.");
                return;
            }

           
            if (!Character.isDigit(password.charAt(password.length() - 1))) {
                System.out.println("Invalid: Last character must be a digit.");
                return;
            }

            
            String specialChars = "@#$%&*";
            boolean hasSpecial = false;
            for (char c : password.toCharArray()) {
                if (specialChars.indexOf(c) != -1) {
                    hasSpecial = true;
                    break;
                }
            }

            if (!hasSpecial) {
                System.out.println("Invalid: Must contain at least one special character (@, #, $, %, &, *).");
                return;
            }

            System.out.println("Success: Password is strong and valid!");

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Test cases
        checkPassword(null);             // Handles null
        checkPassword("");               // Handles empty
        checkPassword("short1@");        // Handles length
        checkPassword("lower1@pass");    // Handles uppercase
        checkPassword("Upperpass");      // Handles digit
        checkPassword("Upperpass@");     // Handles missing digit
        checkPassword("Strong1@pass");   // Valid case
    }
}