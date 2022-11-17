public class TV extends Appliance{
    private Resolution resolution;

    public TV(String name, Dimensions dimensions, double power, Resolution resolution) {
        super(name, dimensions, power, false);
        this.resolution = resolution;
    }

    @Override
    public void pressPowerButton(String appliance) {
        super.pressPowerButton(appliance);
    }
}
