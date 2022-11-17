public class Appliance {
    private String name;
    private Dimensions dimensions;
    private double power;
    private boolean on;

    public Appliance(String name, Dimensions dimensions, double power, boolean on) {
        this.name = name;
        this.dimensions = dimensions;
        this.power = power;
        this.on = on;
    }

    public void pressPowerButton(String appliance){
        on = !on;
        String str;
        str = (on  ? "on" : "off");
        System.out.println("Power button pressed. " + appliance + " is " + str);
    }

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
