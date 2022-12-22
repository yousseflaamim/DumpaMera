public class SmallTruck implements Truck {
    int weight =9000;

    public int getWeight() {
        this.weight =9000;
        return weight;
    }

    @Override
    public void nameOf_truck() {
        System.out.println("you have chosen Small-truck");
    }

    @Override
    public void  sizOf_truck() {
        System.out.println("Allowed weight is less than 9 T");

    }
}
