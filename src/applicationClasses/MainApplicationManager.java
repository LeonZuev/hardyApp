package applicationClasses;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

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

  public void saveData() {
    Path filePath = Paths.get(FILE_NAME);

    if (Files.notExists(filePath)) {
      try {
        Files.createFile(filePath);
      } catch (IOException e) {
        e.printStackTrace();
        return;
      }
    }

    try (BufferedWriter writer = Files.newBufferedWriter(filePath)) {
      for (Project project : projectList) {
        writer.write(project.toString());
        writer.newLine();
      }
      writer.write("***");
      writer.newLine();
      for (Workday workday : workdayList) {
        writer.write(workday.toString());
        writer.newLine();
      }
      writer.write("***");
      writer.newLine();
      for (Worker worker : workersList) {
        writer.write(worker.toString());
        writer.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void loadData() {
    try {
      Path filePath = Paths.get(FILE_NAME);
      if (Files.notExists(filePath)) {
        System.out.println("File 'data.txt' is not found.");
        return;
      }

      try (BufferedReader reader = Files.newBufferedReader(filePath)) {
        String line;
        while ((line = reader.readLine()) != null && !line.equals("***")) {
          // TODO project parse
        }
        while ((line = reader.readLine()) != null && !line.equals("***")) {
          // TODO workday parse
        }
        while ((line = reader.readLine()) != null && !line.equals("***")) {
          // TODO worker parse
        }
      }
    } catch (
            IOException e) {
      e.printStackTrace();
    }
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

  public void setProjectList(ArrayList<Project> projectList) {
    this.projectList = projectList;
  }

  public ArrayList<Workday> getWorkdayList() {
    return new ArrayList<>(workdayList);
  }

  public void setWorkdayList(ArrayList<Workday> workdayList) {
    this.workdayList = workdayList;
  }

  public ArrayList<Worker> getWorkersList() {
    return new ArrayList<>(workersList);
  }

  public void setWorkersList(ArrayList<Worker> workersList) {
    this.workersList = workersList;
  }
}
