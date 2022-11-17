public class LivingRoom {
    private Dimensions dimensions;
    private Sofa sofa;
    private Table table;
    private TV tv;

    public LivingRoom(Dimensions dimensions, Sofa sofa, Table table, TV tv) {
        this.dimensions = dimensions;
        this.sofa = sofa;
        this.table = table;
        this.tv = tv;
    }

    public void turnOnTV(){
        if(tv.isOn()){
            System.out.println("TV is already on");
        } else {
            tv.pressPowerButton(tv.getName());
        }
    }
    public void turnOffTV(){
        if(!tv.isOn()){
            System.out.println("TV is already off");
        } else {
            tv.pressPowerButton(tv.getName());
        }
    }
}
