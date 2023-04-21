package applicationClasses;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class ConsoleInterface {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    MainApplicationManager manager = new MainApplicationManager();

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
        case 1 -> {
          System.out.println("Enter project details to add:");

          System.out.print("Date (yyyy-MM-dd): ");
          String date = scanner.nextLine();

          System.out.print("Company Name: ");
          String companyName = scanner.nextLine();

          System.out.print("Company Manager: ");
          String companyManager = scanner.nextLine();

          System.out.print("Project Address: ");
          String projectAddress = scanner.nextLine();

          System.out.print("Workers (comma-separated): ");
          String workers = scanner.nextLine();

          System.out.print("Progress: ");
          String progress = scanner.nextLine();

          System.out.print("Materials (comma-separated): ");
          String materials = scanner.nextLine();

          System.out.print("Workers notes: ");
          String workersNotes = scanner.nextLine();

          Project project = new Project();
          project.setDate(LocalDate.parse(date));
          project.setCompanyName(companyName);
          project.setCompanyManager(companyManager);
          project.setProjectAddress(projectAddress);
          project.setWorkers(Arrays.asList(workers.split(",")));
          project.setProgress(progress);
          project.setMaterials(Arrays.asList(materials.split(",")));
          project.setWorkersNotes(workersNotes);

          manager.addProject(project);
          System.out.println("Project added!");
        }
        case 2 -> {
          System.out.println("Enter the index of thr project you want to delete:");

          int index = scanner.nextInt();
          scanner.nextLine();

          manager.removeProject(manager.getProjectList().get(index));
          System.out.println("Project removed!");
        }
        case 3 -> {
          System.out.println("Enter workday details:");

          System.out.print("Date (yyyy-MM-dd): ");
          String date = scanner.nextLine();

          System.out.print("Company Name: ");
          String companyName = scanner.nextLine();

          System.out.print("Project Address: ");
          String projectAddress = scanner.nextLine();

          System.out.print("Hours: ");
          int hours = scanner.nextInt();
          scanner.nextLine();

          System.out.print("Progress: ");
          String progress = scanner.nextLine();

          System.out.print("Materials (comma-separated): ");
          String materials = scanner.nextLine();

          System.out.print("Notes: ");
          String notes = scanner.nextLine();

          System.out.print("Payment: ");
          double payment = scanner.nextDouble();
          scanner.nextLine();

          Workday workday = new Workday();
          workday.setDate(LocalDate.parse(date));
          workday.setCompanyName(companyName);
          workday.setProjectAddress(projectAddress);
          workday.setHours(hours);
          workday.setProgress(progress);
          workday.setMaterials(Arrays.asList(materials.split(",")));
          workday.setNotes(notes);
          workday.setPayment(payment);

          manager.addWorkday(workday);
          System.out.println("Workday added!");
        }
        case 4 -> {
          System.out.println("Enter the index of thr workday tou want to delete:");

          int index = scanner.nextInt();
          scanner.nextLine();

          manager.removeWorkday(manager.getWorkdayList().get(index));
          System.out.println("Workday removed!");
        }
        case 5 -> {
          System.out.println("Enter worker details:");

          System.out.print("Worker name: ");
          String workerName = scanner.nextLine();

          System.out.print("Day Payment: ");
          double dayPayment = scanner.nextDouble();
          scanner.nextLine();

          System.out.print("Hour payment: ");
          double hourPayment = scanner.nextDouble();
          scanner.nextLine();

          System.out.print("Notes: ");
          String notes = scanner.nextLine();

          System.out.print("WorkDays in current month: ");
          double workDaysCurrentMonth = scanner.nextDouble();
          scanner.nextLine();

          System.out.println("Total work days: ");
          double totalWorkDays = scanner.nextDouble();
          scanner.nextLine();
          /*
           private List<Workday> workDays;
           private List<Project> projects;
           private List<String> materials;

           */

          Worker worker = new Worker();
          worker.setWorkerName(workerName);
          worker.setDayPayment(dayPayment);
          worker.setHourPayment(hourPayment);
          worker.setNotes(notes);
          worker.setWorkDaysCurrentMonth(workDaysCurrentMonth);
          worker.setTotalWorkDays(totalWorkDays);

          manager.addWorker(worker);
          System.out.println("Worker added!");
        }
        case 6 -> {
          System.out.println("Enter the index of the worker you want to delete:");

          int index = scanner.nextInt();
          scanner.nextLine();

          manager.removeWorker(manager.getWorkersList().get(index));
          System.out.println("Worker removed, so sad!");
        }
        case 7 -> {
          System.out.println("=== Exit program ===");
          System.exit(0);
        }
        default -> System.out.println("Wrong input, please enter correct number!");
      }
    }
  }
}
