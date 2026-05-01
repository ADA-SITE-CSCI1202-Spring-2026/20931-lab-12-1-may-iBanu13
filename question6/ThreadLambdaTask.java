package question6;

public class ThreadLambdaTask {
    public static void main(String[] args) {
// ===== TODO 1 =====
// Create a thread using lambda.
        Thread t = new Thread(() -> {
            for(int i=1; i<5; i++){
                System.out.println(i);
            }
        });
// ===== TODO 2 =====
// Start the thread.
        t.start();
        System.out.println("Main method finished.");
    }
}
