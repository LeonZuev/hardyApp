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
}
