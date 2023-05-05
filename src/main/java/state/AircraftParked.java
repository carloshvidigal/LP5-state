package state;

public class AircraftParked extends AircraftState{

    private AircraftParked() {};
    private static AircraftParked instance = new AircraftParked();
    public static AircraftParked getInstance() {
        return instance;
    }

    public String getState() {
        return "Parked";
    }

    public boolean taxi(Aircraft aircraft) {
        aircraft.setState(AircraftTaxiing.getInstance());
        return true;
    }
}
