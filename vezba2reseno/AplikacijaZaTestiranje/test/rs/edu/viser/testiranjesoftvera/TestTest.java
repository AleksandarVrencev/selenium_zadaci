package rs.edu.viser.testiranjesoftvera;

import junit.framework.TestCase;

public class TestTest extends TestCase {

    public void testGetProcenatTacnihOdgovora() {
        Test t = new Test("TSOFT", "04.02.2022.", 15, 10);
        double actual = t.getProcenatTacnihOdgovora();
        double expected = 100 * (double)t.getBrojTacnihOdgovora() / t.getBrojPitanja();
        assertEquals(expected, actual, 0.01);
    }

    public void testGetBrojPoena() {
        Test t = new Test("TSOFT", "04.02.2022.", 15, 10);
        int maksimum = 100;
        double actual = t.getBrojPoena(maksimum);
        // samo ako smo pre toga proverili metodu getProcenatTacnihOdgovora()
        double expected = 0.01 * t.getProcenatTacnihOdgovora() * maksimum;
        // ili ako nismo, onda moramo ovako
        // double expected = (double)t.getBrojTacnihOdgovora() / t.getBrojPitanja(); * maksimum;
        assertEquals(expected, actual, 0.01);
    }

    public void testTestToString() {
        Test t = new Test("TSOFT", "04.02.2022.", 15, 10);
        int maksimum = 100;
        String actual = t.toString();
        // samo ako smo pre toga proverili metodu getProcenatTacnihOdgovora()
        String expected = t.getImePredmeta() + ";" + t.getDatumIso() + ";" + t.getBrojTacnihOdgovora()
                + ";" + t.getBrojPitanja() + ";"
                + String.format("%.2f", 100 * (double)t.getBrojTacnihOdgovora() / t.getBrojPitanja());
        // ili ako nismo, onda moramo ovako
        // String expected = t.getImePredmeta() + ";" + t.getDatumIso() + ";" + t.getBrojTacnihOdgovora()
        //                + ";" + t.getBrojPitanja() + ";" + t.getProcenatTacnihOdgovora();
        assertEquals(expected, actual);
    }
}