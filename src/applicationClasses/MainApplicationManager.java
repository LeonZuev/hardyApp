package applicationClasses;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainApplicationManager {

  private ArrayList<Project> projectList;
  private ArrayList<Workday> workdayList;
  private ArrayList<Worker> workersList;
  private static final String FILE_NAME = "res/data.txt";

  public MainApplicationManager() {
    initData();
  }

  public void initData() {
    projectList = new ArrayList<>();
    workdayList = new ArrayList<>();
    workersList = new ArrayList<>();
  }
  private static Workday parseWorkday(String workdayData) {
    String[] parts = workdayData.split(",", -1);
    LocalDate currentDate = LocalDate.parse(parts[0]);
    String companyName = parts[1];
    String projectAddress = parts[2];
    int hours = Integer.parseInt(parts[3]);
    String progress = parts[4];
    List<String> materials = Arrays.asList(parts[5].split(";"));
    String notes = parts[6];
    double payment = Double.parseDouble(parts[7]);

    Workday workday = new Workday();
    workday.setDate(currentDate);
    workday.setCompanyName(companyName);
    workday.setProjectAddress(projectAddress);
    workday.setHours(hours);
    workday.setProgress(progress);
    workday.setMaterials(materials);
    workday.setNotes(notes);
    workday.setPayment(payment);

    return workday;
  }

  private static Project parseProject(String projectData) {
    String[] parts = projectData.split(",", -1);
    LocalDate currentDate = LocalDate.parse(parts[0]);
    String companyName = parts[1];
    String companyManager = parts[2];
    String projectAddress = parts[3];
    List<String> workers = Arrays.asList(parts[4].split(";"));
    String progress = parts[5];
    List<String> materials = Arrays.asList(parts[6].split(";"));
    String workersNotes = parts[7];


    Project project = new Project();
    project.setDate(currentDate);
    project.setCompanyName(companyName);
    project.setCompanyManager(companyManager);
    project.setProjectAddress(projectAddress);
    project.setWorkers(workers);
    project.setProgress(progress);
    project.setMaterials(materials);
    project.setWorkersNotes(workersNotes);

    return project;
  }

  public void addProject(Project project) {
    projectList.add(project);
  }

  public void removeProject(Project project) {
    projectList.remove(project);
  }

  public void addWorkday(Workday workday) {
    workdayList.add(workday);
  }

  public void removeWorkday(Workday workday) {
    workdayList.remove(workday);
  }

  public void addWorker(Worker worker) {
    workersList.add(worker);
  }

  public void removeWorker(Worker worker) {
    workersList.remove(worker);
  }

  public ArrayList<Project> getProjectList() {
    return new ArrayList<>(projectList);
  }

  public ArrayList<Workday> getWorkdayList() {
    return new ArrayList<>(workdayList);
  }

  public ArrayList<Worker> getWorkersList() {
    return new ArrayList<>(workersList);
  }

  public void printProjects() {
    System.out.println("=== Projects ===");
    for (int i = 0; i < projectList.size(); ++i) {
      System.out.printf("[%d] %s%n", i, projectList.get(i).toString());
    }
  }

  public void printWorkers() {
    System.out.println("=== Workers ===");
    for (int i = 0; i < workersList.size(); ++i) {
      System.out.printf("[%d] %s%n", i, workersList.get(i).toString());
    }
  }

}
