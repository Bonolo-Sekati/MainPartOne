package com.mycompany.mainpartone;
 private static int readPositiveInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int value = Integer.parseInt(scanner.nextLine().trim());
                if (value > 0) {
                    return value;
                }
            } catch (NumberFormatException ignored) {
// fall through to the error message
            }
            System.out.println("Please enter a whole number greater than 0.");
        }
    }
}