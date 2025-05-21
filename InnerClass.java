class Robot {

    private int id;

    public Robot(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    class Brain {
        public void think() {
            System.out.println("Robot " + id + " is thinking!");
        }
    }

    public void start() {
        System.out.println("Robot " + id + " started");
        Brain brain = new Brain();
        brain.think();
    }
}

public class InnerClass {

    public static void main(String[] args) {
        Robot robot1 = new Robot(1);
        Robot robot2 = new Robot(2);
        Robot robot3 = new Robot(3);
        Robot robot4 = new Robot(4);
        Robot robot5 = new Robot(5);

        robot1.start();
        robot2.start();
        robot3.start();
        robot4.start();
        robot5.start();
    }
    
}
