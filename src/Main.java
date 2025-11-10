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
                case 2:
                    listerTaches();
                    break;
                case 3:
                    marquerCommeComplete(scanner);
                    break;
                case 4:
                    supprimerTache(scanner);
                    break;
                case 5:
                    modifierTache(scanner);
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
    System.out.println("2. Lister les tâches");
    System.out.println("3. Marquer une tâche comme complétée");
    System.out.println("4. Supprimer une tâche");
    System.out.println("5. Modifier une tâche");
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

    private static void listerTaches() {
        if (todoList.isEmpty()) {
            System.out.println("Aucune tâche dans la liste.");
            return;
        }
        System.out.println("=== Liste des tâches ===");
        System.out.println("--- En cours ---");

        for (Todo todo : todoList) {
            if (!todo.isCompleted()) {
                System.out.println(todo);
                }
            }
        System.out.println("\n--- Terminées ---");
        for (Todo todo : todoList) {
            if (todo.isCompleted()) {
                System.out.println(todo);
            }
        }
    }

    private static void marquerCommeComplete(Scanner scanner) {
        if (todoList.isEmpty()) {
            System.out.println("Aucune tâche dans la liste.");
            return;
        }

        listerTaches();

        System.out.print("Entrez l'ID de la tâche à marquer comme complétée: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Todo foundTodo = trouverTacheParId(id);

        if (foundTodo == null) {
            System.out.println("Tâche avec l'ID " + id + " non trouvée.");
            return;
        }
        
        if (foundTodo.isCompleted()) {
            System.out.println("La tâche est déjà marquée comme complétée.");
        } else {
            foundTodo.setCompleted(true);
            System.out.println("Tâche marquée comme complétée: " + foundTodo);
        }
    }

    private static void supprimerTache(Scanner scanner) {
        if (todoList.isEmpty()) {
            System.out.println("Aucune tâche dans la liste.");
            return;
        }

        listerTaches();

        System.out.print("Entrez l'ID de la tâche à supprimer: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Todo foundTodo = trouverTacheParId(id);

        if (foundTodo == null) {
            System.out.println("Tâche avec l'ID " + id + " non trouvée.");
            return;
        }

        System.out.println("Êtes-vous sûr de vouloir supprimer la tâche: " + foundTodo + " ? (o/n): ");
        String confirmation = scanner.nextLine();
        if (!confirmation.equalsIgnoreCase("o")) {
            System.out.println("Suppression annulée.");
            return;
        }

        todoList.remove(foundTodo);
        System.out.println("Tâche supprimée: " + foundTodo);
    }

    private static Todo trouverTacheParId(int id) {
        for (Todo todo : todoList) {
            if (todo.getId() == id) {
                return todo;
            }
        }
        return null;
    }

    private static void modifierTache(Scanner scanner) {
        if (todoList.isEmpty()) {
            System.out.println("Aucune tâche dans la liste.");
            return;
        }

        listerTaches();

        System.out.print("Entrez l'ID de la tâche à modifier: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Todo foundTodo = trouverTacheParId(id);

        if (foundTodo == null) {
            System.out.println("Tâche avec l'ID " + id + " non trouvée.");
            return;
        }

        System.out.print("Entrez le nouveau titre pour la tâche (actuel: " + foundTodo.getTitle() + "): ");
        String newTitle = scanner.nextLine();
        foundTodo.setTitle(newTitle);
        System.out.println("Tâche modifiée: " + foundTodo);
    }
}