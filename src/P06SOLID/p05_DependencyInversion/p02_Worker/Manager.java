package P06SOLID.p05_DependencyInversion.p02_Worker;

public class Manager {
Worker worker;
    public Manager(Worker worker) {
        this.worker = worker;
        worker.work();
    }
}
