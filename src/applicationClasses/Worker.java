package applicationClasses;

import java.util.ArrayList;
import java.util.List;

public class Worker {
  private String workerName;
  private double dayPayment;
  private double hourPayment;
  private final List<Workday> workDays;
  private final List<Project> projects;
  private final List<String> materials;
  private String notes;
  private double workDaysCurrentMonth;
  private double totalWorkDays;


  public Worker() {
    workDays = new ArrayList<>();
    projects = new ArrayList<>();
    materials = new ArrayList<>();
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

  public void setWorkerName(String workerName) {
    this.workerName = workerName;
  }

  public void setDayPayment(double dayPayment) {
    this.dayPayment = dayPayment;
  }

  public void setHourPayment(double hourPayment) {
    this.hourPayment = hourPayment;
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
