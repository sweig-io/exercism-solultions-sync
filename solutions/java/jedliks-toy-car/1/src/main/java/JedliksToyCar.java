public class JedliksToyCar {
    private int distanceDriven;
    private int batteryLevel;

    public JedliksToyCar() {
        this.distanceDriven = 0;
        this.batteryLevel = 100;
    }
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if (this.batteryLevel == 0) {
            return "Battery empty";
        }
        return "Battery at " + this.batteryLevel + "%";
    }

    public void drive() {
        if (this.batteryLevel == 0) {
            System.out.println("Battery empty");
        } else {
            this.distanceDriven += 20;
            this.batteryLevel -= 1;
        }
    }
}
