package state;

public class AircraftFlying extends AircraftState{

    private AircraftFlying() {};
    private static AircraftFlying instance = new AircraftFlying();
    public static AircraftFlying getInstance() {
        return instance;
    }

    public String getState() {
        return "Flying";
    }

    public boolean land(Aircraft aircraft) {
        aircraft.setState(AircraftLanding.getInstance());
        return true;
    }



}
