public class HeavyTruck implements Truck {
    @Override
    public void nameOf_truck() {
        System.out.println("you have chosen Tung truck");
    }

    @Override
    public void  sizOf_truck() {
        System.out.println("Allowed weight is above than 9 T");
    }
}
