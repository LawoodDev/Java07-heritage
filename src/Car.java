public class Car extends Vehicule{
    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public void doStuff() {
        System.out.format("Je suis %s et je fais glou glou !", this.getBrand());
    }
}
