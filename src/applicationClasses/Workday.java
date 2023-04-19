package applicationClasses;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Workday {
  private Date date;
  private String companyName;
  private String projectAddress;
  private int hours;
  private String progress;
  private List<String> materials;
  private String notes;
  private double payment;

  public Date getDate() {
    return date;
  }

  public String getCompanyName() {
    return companyName;
  }

  public String getProjectAddress() {
    return projectAddress;
  }

  public int getHours() {
    return hours;
  }

  public String getProgress() {
    return progress;
  }

  public List<String> getMaterials() {
    return materials;
  }

  public String getNotes() {
    return notes;
  }

  public double getPayment() {
    return payment;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public void setProjectAddress(String projectAddress) {
    this.projectAddress = projectAddress;
  }

  public void setHours(int hours) {
    this.hours = hours;
  }

  public void setProgress(String progress) {
    this.progress = progress;
  }

  public void setMaterials(List<String> materials) {
    this.materials = materials;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public void setPayment(double payment) {
    this.payment = payment;
  }

  @Override
  public String toString() {
    return String.format("%s;%s;%s;%d;%s;%s;%s;%.2f",
    new SimpleDateFormat("yyy-MM-dd").format(getDate()),
    getCompanyName(),
    getProjectAddress(),
    getHours(),
    getProgress(),
    getMaterials().toString().replaceAll("[\\[\\]]", ""),
    getNotes(),
    getPayment());
  }

























}
