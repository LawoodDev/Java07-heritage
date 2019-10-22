public class Hangar {
    public static void main(String[] args){
        Vehicule[] vehiclesList = new Vehicule[]{
                new Boat("Alpha", 100),
                new Car("Beta", 4004),
                new Boat("Charlie", 1040),
                new Boat("Gamma", 1050),
                new Car("Buga", 670),
                new Car("Varo", 978),
        };
        for(Vehicule vehicule :vehiclesList){
            vehicule.doStuff();
            System.out.println();
        }
    }
}
