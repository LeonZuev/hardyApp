package applicationClasses;

import java.util.Scanner;

public class ConsoleInterface {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println();
      System.out.println("     == HarDy Console ==");
      System.out.println("=== Construction Trekker ===");
      System.out.println();
      System.out.println("Choose an action:");
      System.out.println("[1] add Project [1]");
      System.out.println("[2] delete Project [2]");
      System.out.println("[3] add Workday [3]");
      System.out.println("[4] delete Workday [4]");
      System.out.println("[5] add Worker [5]");
      System.out.println("[6] delete Worker [6]");
      System.out.println("[7] EXIT [7]");
      System.out.println("Your input:");

      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1 ->
          // TODO
                System.out.println("add Project");
        case 2 ->
          // TODO
                System.out.println("delete Project");
        case 3 ->
          // TODO
                System.out.println("add Workday");
        case 4 ->
          // TODO
                System.out.println("delete Workday");
        case 5 ->
          // TODO
                System.out.println("add Worker");
        case 6 ->
          // TODO
                System.out.println("delete Worker");
        case 7 -> {
          System.out.println("=== Exit program ===");
          System.exit(0);
        }
        default -> System.out.println("Wrong input, please enter correct number!");
      }
    }
  }
}
