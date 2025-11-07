import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Todo> todoList = new ArrayList<>();
    private static int nextId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {
            afficherMenu();
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    ajouterTache(scanner);
                    break;
                case 0:
                    continuer = false;
                    System.out.println("Au revoir!");
                    break;
                default:
                    System.out.println("Option invalide, veuillez réessayer.");
            }
        }
        scanner.close();
  
    }
    private static void afficherMenu() {
    System.out.println("=== TODO LIST ===");
    System.out.println("1. Ajouter une tâche");
    System.out.println("0. Quitter");
    System.out.print("Choisissez une option: ");
    }

    private static void ajouterTache(Scanner scanner) {
        System.out.print("Entrez le titre de la tâche: ");
        String title = scanner.nextLine();
        Todo newTodo = new Todo(nextId++, title);
        todoList.add(newTodo);
        System.out.println("Tâche ajoutée: " + newTodo);
    }
}