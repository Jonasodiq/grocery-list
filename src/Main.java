// 11 sep 2024 Jonas N Övning-9-2 ArrayList: Lägg till produkt i listan & replace

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange produkterna i listan (max 10), skriv \"done\" för att avsluta:");

        while (true) {
            String product = scanner.nextLine().trim();
            // Compare case-independently
            if (product.equalsIgnoreCase("done")) {
                break;
            }
            if (product.isEmpty()) {
                System.out.println("Produkten kan inte vara tom. Försök igen.");
                continue;
            }
            if (groceryList.contains(product)) {
                System.out.println("Produkten finns redan i listan. Ange en annan.");
                continue;
            }
            // If the list is full (10 products), ask the user to replace an item
            if (groceryList.size() == 10) {
                System.out.println("Listan är full. Vill du ersätta en produkt? (y/n)");
                String replace = scanner.nextLine().trim().toLowerCase();

                if (replace.equals("y")) {
                    // Display the list and ask the user to select a product to replace
                    System.out.println("Vilken produkt vill du ersätta? Ange numret:");
                    for (int i = 0; i < groceryList.size(); i++) {
                        System.out.println((i + 1) + ": " + groceryList.get(i));
                    }
                    // Check that the input is a valid number within the range
                    int indexToReplace;
                    while (true) {
                        if (scanner.hasNextInt()) {
                            indexToReplace = scanner.nextInt();
                            scanner.nextLine(); // Clear the rest of the line
                            if (indexToReplace > 0 && indexToReplace <= groceryList.size()) {
                                break;
                            }
                        } else {
                            scanner.next(); // Ignore invalid input
                        }
                        System.out.println("Ogiltig nummer. Ange ett nummer mellan 1 och " + groceryList.size() + ":");
                    }

                    // Replace the selected product
                    groceryList.set(indexToReplace - 1, product);
                    System.out.println("Produkten har ersatts.");
                } else {
                    System.out.println("Ingen produkt ersattes.");
                }
            } else {
                // If there is room, add the product
                groceryList.add(product);
            }
        }

        // Print the shopping list with numbers
        System.out.println("\nInköpslista:");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ": " + groceryList.get(i));
        }

        // Print the total number of products
        System.out.println("Total antal produkter: " + groceryList.size());

        scanner.close();
    }
}
