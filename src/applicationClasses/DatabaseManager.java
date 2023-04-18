package applicationClasses;

import java.sql.Connection;
import java.util.ArrayList;

public class DatabaseManager {
  private Connection connection;

  public void initDatabase() {
    // TODO таблицы?
  }

  public void addProject(Project project) {
    // TODO
    System.out.println("Проект добавлен базу данных");
  }

  public void updateProject(Project project) {
    // TODO
    System.out.println("Проект обновлён в базе данных");
  }

  public void deleteProject(Project project) {
    // TODO
    System.out.println("Проект удалён из базы данных");
  }

  public ArrayList<Project> getProjects() {
    // TODO
    System.out.println("Все проекты из базы данных");
    return null;
  }

  public void addWorkday(Workday workday) {
    // TODO
    System.out.println("Рабочий день добавлен в базу данных");
  }

  public void updateWorkday(Workday workday) {
    // TODO
    System.out.println("Рабочий день обновлён в базе данных");
  }

  public void deleteWorkday(Workday workday) {
    // TODO
    System.out.println("Рабочий день удалён из базы данных");
  }

  public ArrayList<Workday> getWorkdays(Project project) {
    // TODO
    System.out.println("Список рабочих дней проекта " + project + ":");
    return null;
  }
  public void addWorker(Worker worker) {
    // TODO
    System.out.println("Рабочий добавлен в базу данных");
  }

  public void updateWorker(Worker Worker) {
    // TODO
    System.out.println("Рабочий обновлён в базе данных");
  }

  public void deleteWorker(Worker Worker) {
    // TODO
    System.out.println("Рабочий удалён из базы данных");
  }

  public ArrayList<Worker> getWorkers(Project project) {
    // TODO
    System.out.println("Список рабочих проекта " + project + " :");
    return null;
  }

  public Connection getConnection() {
    return connection;
  }

  public void setConnection(Connection connection) {
    this.connection = connection;
  }
}
