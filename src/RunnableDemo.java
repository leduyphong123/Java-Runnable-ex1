public class RunnableDemo implements Runnable {
    private Thread t;
    private final String theardName;

    public RunnableDemo(String theardName) {
        this.theardName = theardName;
        System.out.println("Creating " + this.theardName);
    }

    @Override
    public void run() {
        System.out.println("Running " + theardName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Theard " + theardName + "," + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Theard " + theardName + " interrupted.");
        }
        System.out.println("Theard " + theardName + " exit.");

    }


    public void start() {
        System.out.println("Startting " + theardName);
        if (t == null) {
            t = new Thread(this, theardName);
            t.start();
        }
    }
}
