import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== TODO LIST ===");
        System.out.println("1. Ajouter une tâche");
        System.out.println("0. Quitter");
        System.out.print("Choisissez une option: ");
        int choice = scanner.nextInt();
        System.out.println("Vous avez choisi l'option: " + choice);
        scanner.close();
    }
}
