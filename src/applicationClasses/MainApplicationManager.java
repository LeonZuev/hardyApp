package applicationClasses;

import java.util.ArrayList;

public class MainApplicationManager {

    private ArrayList<Project> projectList;
    private ArrayList<Workday> workdayList;

    private ArrayList<Worker> workersList;


    private void initData() {
        projectList = new ArrayList<>();
        workdayList = new ArrayList<>();
        workersList = new ArrayList<>();
    }

    public void saveData() {
        //TODO сообразить куда и как сохранять изменения в projectList и workdayList
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
        return projectList;
    }

    public void setProjectList(ArrayList<Project> projectList) {
        this.projectList = projectList;
    }

    public ArrayList<Workday> getWorkdayList() {
        return workdayList;
    }

    public void setWorkdayList(ArrayList<Workday> workdayList) {
        this.workdayList = workdayList;
    }

    public ArrayList<Worker> getWorkersList() {
        return workersList;
    }

    public void setWorkersList(ArrayList<Worker> workersList) {
        this.workersList = workersList;
    }
}
