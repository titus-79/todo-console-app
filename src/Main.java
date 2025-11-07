import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {
            afficherMenu();
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("Fonctionnalité à venir...");
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
}