class Machine {

    public void start() {
        System.out.println("Starting!");
    }

    public void stop() {
        System.out.println("Stopping");
    }

}

public class AnonymousClass {
    public static void main(String[] args) {
        Machine machine = new Machine() {

            @Override
            public void start() {
                System.out.println("I am starting!");
            }
        };
        machine.start();
        machine.stop();
    }
}
