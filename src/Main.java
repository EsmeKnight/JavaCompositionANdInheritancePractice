public class Main {
    public static void main(String[] args) {
        Sofa sofa = new Sofa(new Dimensions(2, 1, 1), 2, 2);
        Table coffeeTable = new Table(new Dimensions(1, 1, 1), 4);
        TV tv = new TV("TV", new Dimensions(2,1, 1), 20.00, new Resolution(1920, 1080));

        LivingRoom livingRoom = new LivingRoom(new Dimensions(6,5,3), sofa, coffeeTable, tv);

        livingRoom.turnOnTV();
        livingRoom.turnOffTV();
        livingRoom.turnOnTV();

    }
}