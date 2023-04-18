package applicationClasses;

import java.util.List;

public class Worker {
  private String workerName;
  private double dayPayment;
  private double hourPayment;
  private List<Workday> workDays;
  private List<Project> projects;
  private List<String> materials;
  private String notes;
  private double workDaysCurrentMount;

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

  public double getWorkDaysCurrentMount() {
    return workDaysCurrentMount;
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

  public void setWorkDaysCurrentMount(double workDaysCurrentMount) {
    this.workDaysCurrentMount = workDaysCurrentMount;
  }

}
