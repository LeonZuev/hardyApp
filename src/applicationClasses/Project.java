package applicationClasses;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Project {

  private LocalDate date;
  private String companyName;
  private String companyManager;
  private String projectAddress;
  private List<String> workers;
  private String progress;
  private List<String> materials;
  private String workersNotes;

  public LocalDate getDate() {
    return date;
  }

  public String getCompanyName() {
    return companyName;
  }

  public String getCompanyManager() {
    return companyManager;
  }


  public String getProjectAddress() {
    return projectAddress;
  }


  public List<String> getWorkers() {
    return workers;
  }

  public String getProgress() {
    return progress;
  }

  public List<String> getMaterials() {
    return materials;
  }

  public String getWorkersNotes() {
    return workersNotes;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public void setCompanyManager(String companyManager) {
    this.companyManager = companyManager;
  }

  public void setProjectAddress(String projectAddress) {
    this.projectAddress = projectAddress;
  }

  public void setWorkers(List<String> workers) {
    this.workers = workers;
  }

  public void setProgress(String progress) {
    this.progress = progress;
  }

  public void setMaterials(List<String> materials) {
    this.materials = materials;
  }

  public void setWorkersNotes(String workersNotes) {
    this.workersNotes = workersNotes;
  }

  @Override
  public String toString() {
    return String.format("%s;%s;%s;%s;%s;%s;%s;%s",
            getDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")),
            getCompanyName(),
            getCompanyManager(),
            getProjectAddress(),
            getWorkers().toString().replaceAll("[\\[\\]]", ""),
            getProgress(),
            getMaterials().toString().replaceAll("[\\[\\]]", ""),
            getWorkersNotes());
  }
}
