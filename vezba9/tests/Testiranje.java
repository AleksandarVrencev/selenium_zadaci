import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Testiranje {

    private static String driverPath = "C:\\Users\\Aleksandar\\Desktop\\vezba9\\chromedriver.exe";
    private static WebDriver browser;

    @BeforeClass
    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        browser = new ChromeDriver();
    }

    @AfterClass
    public static void close() {
        browser.close();
    }

    @Test
    public void test1() {
        String[] smerovi = {"avt", "nrt", "epo", "asuv", "rt", "elite", "is", "nrtd"};
        boolean provera = true;
        for (String smer : smerovi) {
            browser.get("https://www.viser.edu.rs/smer/" + smer);
            int brojac = 0;
            List<WebElement> tekst = browser.findElements(new By.ByCssSelector("td.centered > b"));
            for (int i = 0; i < tekst.size(); i++) {
                try {
                    int broj = Integer.parseInt(tekst.get(i).getText());
                    brojac += broj;
                } catch (Exception e) {
                    System.out.println("Greska u parsiranju");
                }
            }

            if (brojac != 180) {
                provera = false;
                break;
            }
        }
        Assert.assertTrue(provera);
    }

    @Test
    public void test2() {
        browser.get("https://www.viser.edu.rs/stranica/sluzbe");
        List<WebElement> list = browser.findElements(new By.ByCssSelector("body > div.websiteContainer > div.contentContainer > main > div > div.grid-cell-70.grid-padding-right-1 > ul > li"));
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertEquals(6, list.size());
    }

    @Test
    public void test3() {
        browser.get("https://www.viser.edu.rs/raspored-ispita/%D0%88%D0%B0%D0%BD%D1%83%D0%B0%D1%80/2021");
        List<WebElement> listaProfesora = browser.findElements(new By.ByCssSelector(".nastavnik"));
        int broj = 0;
        for (int i = 0; i < listaProfesora.size(); i++) {
            if (listaProfesora.get(i).getText().equals("мр Јелена Митић")) {
                broj = broj + 1;
            }
        }
        Assert.assertEquals(8, broj);
    }

    @Test
    public void test4() {
        Boolean nadjen = false;
        String[] smerovi = {"avt", "nrt", "epo", "asuv", "rt", "elite", "is", "nrtd"};
        for (String smer : smerovi) {
            browser.get("https://www.viser.edu.rs/smer/" + smer);
            String tekst = browser.findElement(new By.ByCssSelector("body > div.websiteContainer > div.contentContainer > main > section:nth-child(2) > div.grid-cell-30.grid-order-1.grid-margin-bottom-1.smerInfo__osoblje > div:nth-child(2) > div:nth-child(2) > p:nth-child(1) > a")).getText();
            if (tekst.equals("мр Јелена Митић")) {
                nadjen = true;
                break;
            }
        }
        Assert.assertTrue(nadjen);
    }

    @Test
    public void test5() {
        browser.get("https://www.viser.edu.rs/adresar/");
        List<WebElement> elementi = browser.findElements(new By.ByName("Профил"));

        Boolean provera = true;
        for (int i = 0; i < elementi.size(); i++) {
            String actual = elementi.get(i).getCssValue("color");
            if (!actual.equals("rgb(255,255,255)")) {
                provera = false;
                break;
            }
        }
        Assert.assertTrue(provera);
    }

    @Test
    public void test6() {
        browser.get("https://www.viser.edu.rs/");
        WebElement slika = browser.findElement(By.cssSelector("body > div.websiteContainer > div.contentContainer > main > div:nth-child(2) > article.obavestenja__spotlight.grid-cell-30.grid-padding-right-1 > div:nth-child(8) > a > img"));
        String expected = "https://www.viser.edu.rs/images/kratki_programi.png";
        String actual = slika.getAttribute("src");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        browser.get("https://www.viser.edu.rs/stranica/studentska-sluzba");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Boolean provera = false;
        List<WebElement> elementi = browser.findElements(By.cssSelector(".grid-cell-70 > ul > li:nth-child(1)"));
        for (WebElement element : elementi) {
            String[] niz = element.getText().split(" ");
            if (niz[3].equals("13.00") && niz[5].equals("15.00,")) {
                provera = true;
                break;
            }
        }

        int[] brojevi = {4, 6};
        for (int broj : brojevi) {
            WebElement tekst = browser.findElement(By.cssSelector(".grid-cell-70 > ul:nth-child(" + broj + ") > li:nth-child(2)"));
            String[] niz = tekst.getText().split(" ");
            if (niz[1].equals("13.00") && niz[2].equals("15.00,")) {
                provera = true;
                break;
            }
        }
        Assert.assertTrue(provera);
    }

    @Test
    public void test8() {
        browser.get("https://www.viser.edu.rs/stranica/racunarske-laboratorije");
        //body > div.websiteContainer > div.contentContainer > main > div > div.grid-cell-70.grid-padding-right-1 > p:nth-child(4)
        int[] niz = {4, 8, 11, 14, 18, 21, 24};
        Boolean provera = true;
        for (int el : niz) {
            String paragraf = browser.findElement(By.cssSelector("body > div.websiteContainer > div.contentContainer > main > div > div.grid-cell-70.grid-padding-right-1 > p:nth-child(" + el + ")")).getText();
            String[] podelaPoReci = paragraf.split(" ");
            int broj = Integer.parseInt(podelaPoReci[0]);
            if (broj < 0) {
                provera = false;
                break;
            }
        }
        Assert.assertTrue(provera);
    }
}
