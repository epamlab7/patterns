public class BridgePatternDemo {

    public static void main(String[] args) {
        startBridgePattern();
    }

    public static void startBridgePattern(){
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
        System.out.println("You are testing bridge pattern: abstraction is decoupled from interface");
        redCircle.draw();
        greenCircle.draw();
    }
}