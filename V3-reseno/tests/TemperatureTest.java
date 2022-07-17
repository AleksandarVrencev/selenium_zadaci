import org.junit.Test;
import rs.edu.viser.testrianjesoftvera.Temperature;

import static org.junit.Assert.assertEquals;

public class TemperatureTest {
    private final double delta = 1e-9;

    @Test
    public void fromCelsiusToCelsius(){
        Temperature temp = Temperature.fromCelsius(1);
        double actual = temp.toCelsius();
        double expected = 1;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromCelsiusToFahrenheit(){
        Temperature temp = Temperature.fromCelsius(1);
        double actual = temp.toFahrenheit();
        double expected = 33.8;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromCelsiusToKelvin(){
        Temperature temp = Temperature.fromCelsius(1);
        double actual = temp.toKelvin();
        double expected = 274.15;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromFahrenheitToCelsius(){
        Temperature temp = Temperature.fromFahrenheit(1);
        double actual = temp.toCelsius();
        double expected = -17.2222222;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromFahrenheitToFahreheit(){
        Temperature temp = Temperature.fromFahrenheit(1);
        double actual = temp.toFahrenheit();
        double expected = 1;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromFahrenheitToKelvin(){
        Temperature temp = Temperature.fromFahrenheit(1);
        double actual = temp.toKelvin();
        double expected = 255.927778;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromKelvinToCelsius(){
        Temperature temp = Temperature.fromKelvin(1);
        double actual = temp.toCelsius();
        double expected = -272.15;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromKelvinToFahreheit(){
        Temperature temp = Temperature.fromKelvin(1);
        double actual = temp.toFahrenheit();
        double expected = -457.87;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromKelvinToKelvin(){
        Temperature temp = Temperature.fromKelvin(1);
        double actual = temp.toKelvin();
        double expected = 1;
        assertEquals(expected, actual, delta);
    }
}
