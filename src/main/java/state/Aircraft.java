package state;

public class Aircraft {

    private String codigo;
    private AircraftState state;

    public Aircraft() {
        this.state = AircraftParked.getInstance();
    }

    public void setState(AircraftState state) {
        this.state = state;
    }

    public boolean takeOff() {
        return state.takeOff(this);
    }

    public boolean fly() {
        return state.fly(this);
    }

    public boolean land() {
        return state.land(this);
    }

    public boolean taxi() {
        return state.taxi(this);
    }

    public boolean park() {
        return state.park(this);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getStateName() {
        return state.getState();
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public AircraftState getState() {
        return state;
    }
}
