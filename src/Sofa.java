public class Sofa extends Furniture{
    private int cushions;
    private int seats;

    public Sofa(Dimensions dimensions, int cushions, int seats) {
        super(dimensions);
        this.cushions = cushions;
        this.seats = seats;
    }

}
