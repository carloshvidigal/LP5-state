package state;

public class AircraftLanding extends AircraftState{

    private AircraftLanding() {};
    private static AircraftLanding instance = new AircraftLanding();
    public static AircraftLanding getInstance() {
        return instance;
    }

    public String getState() {
        return "Landing";
    }

    public boolean taxi(Aircraft aircraft) {
        aircraft.setState(AircraftTaxiing.getInstance());
        return true;
    }
}
