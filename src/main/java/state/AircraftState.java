package state;

public abstract class AircraftState {

    public abstract String getState();

    public boolean takeOff (Aircraft aircraft) {
        return false;
    }

    public boolean fly (Aircraft aircraft) {
        return false;
    }

    public boolean land (Aircraft aircraft) {
        return false;
    }

    public boolean taxi (Aircraft aircraft) {
        return false;
    }

    public boolean park (Aircraft aircraft) {
        return false;
    }
}
