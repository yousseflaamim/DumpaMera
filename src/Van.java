public class Van implements Truck {
    @Override
    public void nameOf_truck() {
        System.out.println("you have chosen Van");
    }

    @Override
    public void sizOf_truck() {
        System.out.println("Allowed weight is less than 240 t");
    }
}
