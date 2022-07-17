import org.junit.Test;
import rs.edu.viser.testrianjesoftvera.Angle;

import static org.junit.Assert.assertEquals;

public class AngleTest {
    private final double delta = 1e-6;

    @Test
    public void fromDegreesToDegrees(){
        Angle angle = Angle.fromDegrees(1);
        double actual = angle.toDegrees();
        double expected = 1;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromDegreesToGradients(){
        Angle angle = Angle.fromDegrees(1);
        double actual = angle.toGradients();
        double expected = 1.1111;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromDegreesToMinutesOfArk(){
        Angle angle = Angle.fromDegrees(1);
        double actual = angle.toMinutesOfArk();
        double expected = 60;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromDegreesToRadians(){
        Angle angle = Angle.fromDegrees(1);
        double actual = angle.toRadians();
        double expected = 0.0174532925;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromDegreesToSecondsOfArk(){
        Angle angle = Angle.fromDegrees(1);
        double actual = angle.toSecondsOfArk();
        double expected = 3600;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromGradientsToDegrees(){
        Angle angle = Angle.fromGradients(1);
        double actual = angle.toDegrees();
        double expected = 0.9;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromGradientsToGradients(){
        Angle angle = Angle.fromGradients(1);
        double actual = angle.toGradients();
        double expected = 1;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromGradientsToMinutesOfArk(){
        Angle angle = Angle.fromGradients(1);
        double actual = angle.toMinutesOfArk();
        double expected = 54;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromGradientsToRadians(){
        Angle angle = Angle.fromGradients(1);
        double actual = angle.toRadians();
        double expected = 0.015708;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromGradientsToSecondsOfArk(){
        Angle angle = Angle.fromGradients(1);
        double actual = angle.toSecondsOfArk();
        double expected = 3.240;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromMinutesOfArcToDegrees(){
        Angle angle = Angle.fromMinutesOfArk(1);
        double actual = angle.toDegrees();
        double expected = 0.016667;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromMinutesOfArcToGradients(){
        Angle angle = Angle.fromMinutesOfArk(1);
        double actual = angle.toGradients();
        double expected = 0.018519;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromMinutesOfArcToMinutesOfArk(){
        Angle angle = Angle.fromMinutesOfArk(1);
        double actual = angle.toMinutesOfArk();
        double expected = 1;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromMinutesOfArcToRadians(){
        Angle angle = Angle.fromMinutesOfArk(1);
        double actual = angle.toRadians();
        double expected = 0.000291;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromMinutesOfArcToSecondsOfArk(){
        Angle angle = Angle.fromMinutesOfArk(1);
        double actual = angle.toSecondsOfArk();
        double expected = 60;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromRadiansToDegrees(){
        Angle angle = Angle.fromRadians(1);
        double actual = angle.toDegrees();
        double expected = 57.29578;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromRadiansToGradients(){
        Angle angle = Angle.fromRadians(1);
        double actual = angle.toGradients();
        double expected = 63.661977;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromRadiansToMinutesOfArk(){
        Angle angle = Angle.fromRadians(1);
        double actual = angle.toMinutesOfArk();
        double expected = 3437.746771;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromRadiansToRadians(){
        Angle angle = Angle.fromRadians(1);
        double actual = angle.toRadians();
        double expected = 1;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromRadiansToSecondsOfArk(){
        Angle angle = Angle.fromRadians(1);
        double actual = angle.toSecondsOfArk();
        double expected =  206264.806247;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromSecondsOfArcToDegrees(){
        Angle angle = Angle.fromSecondsOfArk(1);
        double actual = angle.toDegrees();
        double expected = 0.000278;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromSecondsOfArcToGradients(){
        Angle angle = Angle.fromSecondsOfArk(1);
        double actual = angle.toGradients();
        double expected = 0.000309;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromSecondsOfArcToMinutesOfArk(){
        Angle angle = Angle.fromSecondsOfArk(1);
        double actual = angle.toMinutesOfArk();
        double expected = 0.016667;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromSecondsOfArcToRadians(){
        Angle angle = Angle.fromSecondsOfArk(1);
        double actual = angle.toRadians();
        double expected = 4.8481E-6;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void fromSecondsOfArcToSecondsOfArk(){
        Angle angle = Angle.fromSecondsOfArk(1);
        double actual = angle.toSecondsOfArk();
        double expected =  1;
        assertEquals(expected, actual, delta);
    }
}
