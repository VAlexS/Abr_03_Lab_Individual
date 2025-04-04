package clases.coches;

public class Truck extends Coche{

    private final double towingCapacity;

    public Truck(String matricula, String marca, String modelo, int kilometraje, double towingCapacity) {
        super(matricula, marca, modelo, kilometraje);
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+". Con una capacidad de "+towingCapacity;
    }
}
