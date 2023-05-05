package state;

public class AircraftTaxiing extends AircraftState {

    private AircraftTaxiing() {};
    private static AircraftTaxiing instance = new AircraftTaxiing();
    public static AircraftTaxiing getInstance() {
        return instance;
    }

    public String getState() {
        return "Taxiing";
    }

    public boolean park(Aircraft aircraft) {
        aircraft.setState(AircraftParked.getInstance());
        return true;
    }

    public boolean takeOff(Aircraft aircraft) {
        aircraft.setState(AircraftTakingOff.getInstance());
        return true;
    }

}
