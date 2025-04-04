package clases.coches;

public class UtilityVehicle extends Coche {

    private final boolean fourWheelDrive;

    public UtilityVehicle(String matricula, String marca, String modelo, int kilometraje, boolean fourWheelDrive) {
        super(matricula, marca, modelo, kilometraje);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getInfo() {
        if (fourWheelDrive)
            return super.getInfo()+". Tiene traccion a 4 ruedas";
        else
            return super.getInfo()+". No tiene traccion a 4 ruedas";
    }
}
