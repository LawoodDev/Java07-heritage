public class Boat extends Vehicule {
    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public void doStuff() {
        System.out.format("Je suis %s et je fais vroum vroum !", this.getBrand());
    }
}
