import java.util.Scanner;

public class MainGerenciador {
    public static void main(String[] args) {
        MenuManager menuManager = new MenuManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selecione uma opção:");
            System.out.println("1: Adicionar prato");
            System.out.println("2: Listar pratos");
            System.out.println("3: Remover prato");
            System.out.println("4: Sair");

            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over

            switch (option) {
                case 1:
                    System.out.print("Nome do prato: ");
                    String dishName = scanner.nextLine();
                    Dish dish = new Dish(dishName);
                    System.out.print("Quantos ingredientes? ");
                    int numIngredients = scanner.nextInt();
                    scanner.nextLine(); // consume newline left-over
                    for (int i = 0; i < numIngredients; i++) {
                        System.out.print("Ingrediente " + (i + 1) + ": ");
                        String ingredientName = scanner.nextLine();
                        dish.addIngredient(new Ingredient(ingredientName));
                    }
                    menuManager.addDish(dish);
                    break;
                case 2:
                    System.out.println("Pratos:");
                    for (Dish d : menuManager.getDishes()) {
                        System.out.println(d);
                    }
                    break;
                case 3:
                    System.out.print("Nome do prato para remover: ");
                    String nameToRemove = scanner.nextLine();
                    menuManager.removeDishByName(nameToRemove);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opção inválida.");

            }
        }
    }
}