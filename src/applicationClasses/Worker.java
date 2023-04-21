package applicationClasses;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class Worker {
  private List<UUID> projectIds;
  private String workerName;
  private double dayPayment;
  private double hourPayment;
  private List<Workday> workDays;
  private List<Project> projects;
  private List<String> materials;
  private String notes;
  private double workDaysCurrentMonth;
  private double totalWorkDays;


  public Worker() {
    projectIds = new ArrayList<>();
    workDays = new ArrayList<>();
    projects = new ArrayList<>();
    materials = new ArrayList<>();
  }

  public List<UUID> getProjectIds() {
    return projectIds;
  }

  public String getWorkerName() {
    return workerName;
  }

  public double getDayPayment() {
    return dayPayment;
  }

  public double getHourPayment() {
    return hourPayment;
  }

  public List<Workday> getWorkDays() {
    return workDays;
  }

  public List<Project> getProjects() {
    return projects;
  }

  public List<String> getMaterials() {
    return materials;
  }

  public String getNotes() {
    return notes;
  }

  public double getWorkDaysCurrentMonth() {
    return workDaysCurrentMonth;
  }

  public double getTotalWorkDays() {
    return totalWorkDays;
  }
  public void setProjectIds(List<UUID> projectIds) {
    this.projectIds = projectIds;
  }

  public void setWorkerName(String workerName) {
    this.workerName = workerName;
  }

  public void setDayPayment(double dayPayment) {
    this.dayPayment = dayPayment;
  }

  public void setHourPayment(double hourPayment) {
    this.hourPayment = hourPayment;
  }

  public void setWorkDays(List<Workday> workDays) {
    this.workDays = workDays;
  }

  public void setProjects(List<Project> projects) {
    this.projects = projects;
  }

  public void setMaterials(List<String> materials) {
    this.materials = materials;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public void setWorkDaysCurrentMonth(double workDaysCurrentMonth) {
    this.workDaysCurrentMonth = workDaysCurrentMonth;
  }

  public void setTotalWorkDays(double totalWorkDays) {
    this.totalWorkDays = totalWorkDays;
  }

  public void addWorkday(Workday workday) {
    this.workDays.add(workday);
    this.totalWorkDays +=1;
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(Date.from(workday.getDate().atStartOfDay(ZoneId.systemDefault()).toInstant()));
    if (calendar.get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH)) {
      this.workDaysCurrentMonth += 1;
    }
  }

  public void removeWorkday(Workday workday) {
    this.workDays.remove(workday);
    this.totalWorkDays -= 1;
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(Date.from(workday.getDate().atStartOfDay(ZoneId.systemDefault()).toInstant()));
    if (calendar.get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH)) {
      this.workDaysCurrentMonth -= 1;
    }
  }

  public void addProject(Project project) {
    this.projects.add(project);
  }

  public void removeProject(Project project) {
    this.projects.remove(project);
  }

  public void addMaterial(String material) {
    this.materials.add(material);
  }

  public void removeMaterial(String material) {
    this.materials.remove(material);
  }

  public void editNotes(String notes) {
    this.notes = notes;
  }

  /**
   * @param month the month to search for Workday objects
   * @return a list of Workday objects occurred in the specified month
   */
  public List<Workday> getWorkdaysForMonth(int month) {
    List<Workday> workdaysForMonth = new ArrayList<>();
    Calendar calendar = Calendar.getInstance();
    for (Workday workday : workDays) {
      LocalDate workdayDate = workday.getDate();
      Calendar workdayCalendar = Calendar.getInstance();
      workdayCalendar.setTime(Date.from(workdayDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
      if (workdayCalendar.get(Calendar.MONTH) == month) {
        workdaysForMonth.add(workday);
      }
    }
    return workdaysForMonth;
  }

  /**
   * @param project The Project object to search for associated Workday objects
   * @return A list of Workday objects associated with the specified Project object
   */
  public List<Workday> getWorkdaysForProject(Project project) {
    List<Workday> workdaysForProject = new ArrayList<>();
    for (Workday workday : workDays) {
      if (workday.getProjectAddress().equals(project.getProjectAddress())) {
        workdaysForProject.add(workday);
      }
    }
    return workdaysForProject;
  }

  public double calculateSalary() {
    return workDaysCurrentMonth * dayPayment;
  }

  @Override
  public String toString() {
    return String.format("%s;%.2f;%.2f;%s;%s;%s;%s;%.2f;%.2f;",
            getWorkerName(),
            getDayPayment(),
            getHourPayment(),
            getWorkDays(),
            getProjects().toString().replaceAll("[\\[\\]]", ""),
            getMaterials().toString().replaceAll("[\\[\\]]", ""),
    getNotes(),
    getWorkDaysCurrentMonth(),
    getTotalWorkDays());
  }
}
