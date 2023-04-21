package applicationClasses;

import java.util.ArrayList;


public class MainApplicationManager {

  private ArrayList<Project> projectList;
  private ArrayList<Workday> workdayList;
  private ArrayList<Worker> workersList;

  public MainApplicationManager() {
    initData();
  }

  public void initData() {
    projectList = new ArrayList<>();
    workdayList = new ArrayList<>();
    workersList = new ArrayList<>();
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
