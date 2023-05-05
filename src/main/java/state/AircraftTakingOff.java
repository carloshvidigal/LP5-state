package state;

public class AircraftTakingOff extends AircraftState{
    private AircraftTakingOff () {};
    private static AircraftTakingOff instance = new AircraftTakingOff();
    public static AircraftTakingOff getInstance() {
        return instance;
    }

    public String getState() {
        return "Taking Off";
    }

    public boolean fly(Aircraft aircraft) {
        aircraft.setState(AircraftFlying.getInstance());
        return true;
    }
}
