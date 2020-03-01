package Test;
import Main.*;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

public class Main
{
    public static void main(String args[]) {
        // Creators
        Creator c1 = new Creator("Alan", "Favre");
        Creator c2 = new Creator("Ruben", "Carvalho");
        Creator c3 = new Creator("Jeff", "Muraro");

        // Map to store creators and their tasks
        Map<Creator, List<Task>> tasks;
        tasks = new HashMap<>();

        // c1 tasks
        Task c1_1 = new Task(c1, "Faire les courses", new Date(), Status.OPEN, Resolution.DONE);
        Task c1_2 = new Task(c1, "Jouer au tennis", new Date(), Status.CANCELED, Resolution.DONE);

        // c2 tasks
        Task c2_1 = new Task(c2, "Aller voir ma grand-mère", new Date(), Status.OPEN, Resolution.DONE);
        Task c2_2 = new Task(c2, "Jouer au foot", new Date(), Status.CANCELED, Resolution.DONE);

        // c3 tasks
        Task c3_1 = new Task(c3, "Faire le ménage", new Date(), Status.OPEN, Resolution.DONE);
        Task c3_2 = new Task(c3, "Jouer au ping-pong", new Date(), Status.CANCELED, Resolution.DONE);

        // Lists of tasks
        List<Task> c1_tasks = new ArrayList<Task>();
        List<Task> c2_tasks = new ArrayList<Task>();
        List<Task> c3_tasks = new ArrayList<Task>();

        c1_tasks.add(c1_1);
        c1_tasks.add(c1_2);
        c2_tasks.add(c2_1);
        c2_tasks.add(c2_2);
        c3_tasks.add(c3_1);
        c3_tasks.add(c3_2);

        // Add creator + tasks to Map
        tasks.put(c1, c1_tasks);
        tasks.put(c2, c2_tasks);
        tasks.put(c3, c3_tasks);
    }
}
