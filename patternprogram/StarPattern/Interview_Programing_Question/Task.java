package Interview_Programing_Question;

class Process implements Runnable {
    private int processId;

    public Process(int processId) {
        this.processId = processId;
    }

    @Override
    public void run() {
        System.out.println("Process " + processId + " is being executed by user " + Thread.currentThread().getId());
        // Simulate some processing time
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Process " + processId + " has completed.");
    }
}

public class Task {
    public static void main(String[] args) {
        int numProcesses = 10;
        int numUsers = 5;

        for (int i = 1; i <= numProcesses; i++) {
            Thread processThread = new Thread(new Process(i));
            processThread.start();
        }

        for (int i = 1; i <= numUsers; i++) {
            Thread userThread = new Thread(() -> {
                for (int j = 1; j <= numProcesses; j++) {
                    new Process(j).run();
                }
            });
            userThread.start();
        }
    }
}
