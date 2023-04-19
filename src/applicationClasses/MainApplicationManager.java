package applicationClasses;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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
          String[] parts = line.split(";", -1);
          Date date = new SimpleDateFormat("yyyy-MM-dd").parse(parts[0]);
          String companyName = parts[1];
          String companyManager = parts[2];
          String projectAddress = parts[3];
          List<String> workers = Arrays.asList(parts[4].split(","));
          String progress = parts[5];
          List<String> materials = Arrays.asList(parts[6].split(","));
          String workersNotes = parts[7];

          Project project = new Project();
          project.setDate(date);
          project.setCompanyName(companyName);
          project.setCompanyManager(companyManager);
          project.setProjectAddress(projectAddress);
          project.setWorkers(workers);
          project.setProgress(progress);
          project.setMaterials(materials);
          project.setWorkersNotes(workersNotes);

          projectList.add(project);
        }

        while ((line = reader.readLine()) != null && !line.equals("***")) {
         String[] parts = line.split(";", -1);
         Date date = new SimpleDateFormat("yyy-MM-dd").parse(parts[0]);
         String companyName = parts[1];
         String projectAddress = parts[2];
         int hours = Integer.parseInt(parts[3]);
         String progress = parts[4];
         List<String> materials = Arrays.asList(parts[5].split(","));
         String notes = parts[6];
         double payment = Double.parseDouble(parts[7]);

         Workday workday = new Workday();
         workday.setDate(date);
         workday.setCompanyName(companyName);
         workday.setProjectAddress(projectAddress);
         workday.setHours(hours);
         workday.setProgress(progress);
         workday.setMaterials(materials);
         workday.setNotes(notes);
         workday.setPayment(payment);

         workdayList.add(workday);

        }
        while ((line = reader.readLine()) != null && !line.equals("***")) {
          String[] parts = line.split(";", -1);
          String workerName = parts[0];
          double dayPayment = Double.parseDouble(parts[1]);
          double hourPayment = Double.parseDouble(parts[2]);
          List<Project> projects = new ArrayList<>(); // TODO связать с существующим проектом
          List<String> material = Arrays.asList(parts[4].split(","));
          String notes = parts[5];
          double workDaysCurrentMonth = Double.parseDouble(parts[6]);
          double totalWorkdays = Double.parseDouble(parts[7]);

          Worker worker = new Worker();
          worker.setWorkerName(workerName);
                  worker.setDayPayment(dayPayment);
                  worker.setHourPayment(hourPayment);
                  worker.setProjects(projects);
                  worker.setMaterials(material);
                  worker.setNotes(notes);
                  worker.setWorkDaysCurrentMonth(workDaysCurrentMonth);
                  worker.setTotalWorkDays(totalWorkdays);

                  workersList.add(worker);
        }
      } catch (ParseException e) {
        throw new RuntimeException(e);
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
