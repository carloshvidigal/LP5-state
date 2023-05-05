import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import state.*;

import static org.junit.jupiter.api.Assertions.*;

public class AircraftTest {

    Aircraft aircraft;

    @BeforeEach
    public void setUp() {
        aircraft = new Aircraft();
    }

    //Park

    @Test
    public void shouldNotParkParkedAircraft() {
        aircraft.setState(AircraftParked.getInstance());
        assertFalse(aircraft.park());
    }

    @Test
    public void shouldNotParkLandingAircraft() {
        aircraft.setState(AircraftLanding.getInstance());
        assertFalse(aircraft.park());
    }

    @Test
    public void shouldNotParkFlyingAircraft() {
        aircraft.setState(AircraftFlying.getInstance());
        assertFalse(aircraft.park());
    }

    @Test
    public void shouldNotParkTakingOffAircraft() {
        aircraft.setState(AircraftTakingOff.getInstance());
        assertFalse(aircraft.park());
    }

    @Test
    public void shouldParkTaxiingAircraft() {
        aircraft.setState(AircraftTaxiing.getInstance());
        assertTrue(aircraft.park());
        assertEquals(AircraftParked.getInstance(), aircraft.getState());
    }

    //Fly

    @Test
    public void shouldNotFlyParkedAircraft() {
        aircraft.setState(AircraftParked.getInstance());
        assertFalse(aircraft.fly());
    }

    @Test
    public void shouldNotFlyLandingAircraft() {
        aircraft.setState(AircraftLanding.getInstance());
        assertFalse(aircraft.fly());
    }

    @Test
    public void shouldNotFlyFlyingAircraft() {
        aircraft.setState(AircraftFlying.getInstance());
        assertFalse(aircraft.fly());
    }

    @Test
    public void shouldFlyTakingOffAircraft() {
        aircraft.setState(AircraftTakingOff.getInstance());
        assertTrue(aircraft.fly());
        assertEquals(AircraftFlying.getInstance(), aircraft.getState());
    }

    @Test
    public void shouldNotFlyTaxiingAircraft() {
        aircraft.setState(AircraftTaxiing.getInstance());
        assertFalse(aircraft.fly());
    }

    //TakeOff

    @Test
    public void shouldNotTakeOffParkedAircraft() {
        aircraft.setState(AircraftParked.getInstance());
        assertFalse(aircraft.takeOff());
    }

    @Test
    public void shouldNotTakeOffLandingAircraft() {
        aircraft.setState(AircraftLanding.getInstance());
        assertFalse(aircraft.takeOff());
    }

    @Test
    public void shouldNotTakeOffFlyingAircraft() {
        aircraft.setState(AircraftFlying.getInstance());
        assertFalse(aircraft.takeOff());
    }

    @Test
    public void shouldNotTakeOffTakingOffAircraft() {
        aircraft.setState(AircraftTakingOff.getInstance());
        assertFalse(aircraft.takeOff());
    }

    @Test
    public void shouldTakeOffTaxiingAircraft() {
        aircraft.setState(AircraftTaxiing.getInstance());
        assertTrue(aircraft.takeOff());
        assertEquals(AircraftTakingOff.getInstance(), aircraft.getState());
    }


    //Land

    @Test
    public void shouldNotLandParkedAircraft() {
        aircraft.setState(AircraftParked.getInstance());
        assertFalse(aircraft.land());
    }

    @Test
    public void shouldNotLandLandingAircraft() {
        aircraft.setState(AircraftLanding.getInstance());
        assertFalse(aircraft.land());
    }

    @Test
    public void shouldLandFlyingAircraft() {
        aircraft.setState(AircraftFlying.getInstance());
        assertTrue(aircraft.land());
        assertEquals(AircraftLanding.getInstance(), aircraft.getState());
    }

    @Test
    public void shouldNotLandTakingOffAircraft() {
        aircraft.setState(AircraftTakingOff.getInstance());
        assertFalse(aircraft.land());
    }

    @Test
    public void shouldNotLandTaxiingAircraft() {
        aircraft.setState(AircraftTaxiing.getInstance());
        assertFalse(aircraft.land());

    }

    //Taxi

    @Test
    public void shouldTaxiParkedAircraft() {
        aircraft.setState(AircraftParked.getInstance());
        assertTrue(aircraft.taxi());
        assertEquals(AircraftTaxiing.getInstance(), aircraft.getState());
    }

    @Test
    public void shouldTaxiLandingAircraft() {
        aircraft.setState(AircraftLanding.getInstance());
        assertTrue(aircraft.taxi());
        assertEquals(AircraftTaxiing.getInstance(), aircraft.getState());
    }

    @Test
    public void shouldNotTaxiFlyingAircraft() {
        aircraft.setState(AircraftFlying.getInstance());
        assertFalse(aircraft.taxi());
    }

    @Test
    public void shouldNotTaxiTakingOffAircraft() {
        aircraft.setState(AircraftTakingOff.getInstance());
        assertFalse(aircraft.taxi());
    }

    @Test
    public void shouldNotTaxiTaxiingAircraft() {
        aircraft.setState(AircraftTaxiing.getInstance());
        assertFalse(aircraft.taxi());

    }

}