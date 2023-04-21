package applicationClasses;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainApplicationManagerTests {
  private MainApplicationManager manager;

  @BeforeEach
  void setUp() {
    manager = new MainApplicationManager();
  }

  @Test
  void testAddAndRemoveProject() {
    int initialSize = manager.getProjectList().size();

    Project project = new Project();
    project.setDate(LocalDate.now());
    project.setCompanyName("Company Name");
    project.setCompanyManager("Company manager");
    project.setProjectAddress("Project 111 address");
    project.setWorkers(List.of("Worker worker", "Worker master"));
    project.setProgress("In progress");
    project.setMaterials(List.of("Material 1", "Material 2"));
    project.setWorkersNotes("Worker's notes");

    manager.addProject(project);
    assertEquals(initialSize + 1, manager.getProjectList().size());

    manager.removeProject(project);
    assertEquals(initialSize, manager.getProjectList().size());
  }

  @Test
  void testAddAndRemoveWorkday() {
    int initialSize = manager.getWorkdayList().size();

    Workday workday = new Workday();
    workday.setDate(LocalDate.now());
    workday.setCompanyName("Company Name");
    workday.setProjectAddress("Project 111 address");
    workday.setHours(8);
    workday.setProgress("In progress");
    workday.setMaterials(List.of("Material 1", "Material 2"));
    workday.setNotes("Daily notes");
    workday.setPayment(100.0);

    manager.addWorkday(workday);
    assertEquals(initialSize + 1, manager.getWorkdayList().size());

    manager.removeWorkday(workday);
    assertEquals(initialSize, manager.getWorkdayList().size());
  }

  @Test
  void testAddAndRemoveWorker() {
    int initialSize = manager.getWorkersList().size();

    Worker worker = new Worker();
    worker.setWorkerName("Worker Name");
    worker.setDayPayment(100.0);
    worker.setHourPayment(12.5);
    worker.setNotes("Notes");
    worker.setWorkDaysCurrentMonth(10.5);
    worker.setTotalWorkDays(50.0);

    manager.addWorker(worker);
    assertEquals(initialSize + 1, manager.getWorkersList().size());

    manager.removeWorker(worker);
    assertEquals(initialSize, manager.getWorkersList().size());
  }






}
