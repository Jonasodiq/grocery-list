# Grocery List Manager

This Java program allows users to create and manage a grocery list with a maximum of 10 items. It includes features for adding, replacing, and preventing duplicates in the list, making it a simple but effective tool for organizing grocery shopping.

## Features

- **Add Products:** Users can add up to 10 products to their grocery list.
- **Prevent Duplicates:** The program checks for duplicates and prompts the user to enter a unique product.
- **Replace Products:** Once the list reaches 10 products, users can choose to replace an existing product.
- **Input Validation:** Ensures that user input is valid, preventing empty entries or invalid selections.
- **List Display:** The final grocery list is displayed with product numbers and the total number of items.

## How to Use

1. **Run the Program:** Compile and execute the `Main.java` file in a Java environment.
2. **Add Products:**
    - The program will prompt you to enter products one by one.
    - Type the product name and press enter.
    - Type `"done"` to finish adding products.
3. **Handling a Full List:**
    - When 10 products are added, you will be asked if you want to replace a product.
    - If you choose "yes", select the product to replace by entering its number.
4. **Final List:** After you finish entering products, the complete list will be displayed with product numbers.

## Example
```
Ange produkterna i listan (max 10), skriv "done" för att avsluta:

mjölk
Produkten finns redan i listan. Ange en annan.
bröd 
ägg 
done

Inköpslista:
1: bröd
2: ägg
3: mjölk 
Total antal produkter: 3
```

## Installation

1. **Clone or Download:** Get the project files from the repository.
2. **Compile:** Use any Java IDE or the command line to compile the `Main.java` file.
3. **Run:** Execute the compiled Java class.
