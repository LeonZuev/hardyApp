package applicationClasses;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
  private String workerName;
  private double dayPayment;
  private double hourPayment;
  private List<Workday> workDays;
  private List<Project> projects;
  private List<String> materials;
  private String notes;
  private double workDaysCurrentMonth;
  private double totalWorkDays;

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
    Calendar calendar = Calendar.getInstance();
    if (calendar.get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH)) {
      this.workDaysCurrentMonth += 1;
    }
  }

  public void removeWorkday(Workday workday) {
    this.workDays.remove(workday);
    Calendar calendar = Calendar.getInstance();
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

  public List<Workday> getWorkdaysForMonth(int month) {
    List<Workday> workdaysForMonth = new ArrayList<>();
    Calendar calendar = Calendar.getInstance();
    for (Workday workday : workDays) {
      calendar.setTime(workday.getDate());
      if (calendar.get(Calendar.MONTH) == month) {
        workdaysForMonth.add(workday);
      }
    }
    return workdaysForMonth;
  }

  public List<Workday> getWorkdaysForProject(Project project) {
    List<Workday> workdaysForProject = new ArrayList<>();
    for (Workday workday : workDays) {
      if (workday.getProjectAddress().equals(project.getProjectAddress())) {
        workdaysForProject.add(workday);
      }
    }
    return workdaysForProject;
  }
}

