package Assignment1.BuilderPattern;
public class Main {
    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                .setNumRooms(3)
                .setNumFloors(2)
                .setHasPool(true)
                .setHasGarage(false)
                .build();

        System.out.println(house);
    }
}
