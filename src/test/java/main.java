import org.junit.Test;
import org.openqa.selenium.By;
import static org.junit.Assert.fail;


public class main extends baseTest {
    @Test
    public void gittiGidiyorSatinAlma() throws Exception {
        boolean logo = displayElement(By.cssSelector("[alt='GittiGidiyor']"));
        if (logo) {
            logger.info("Logo Mevcut, Ana Sayfadasiniz.");
        } else {
            logger.info("Logo Mevcut Degil , Ana Sayfada degilsiniz");
            fail();
        }
        assertName(driver.getTitle(),"GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi");
        clickElement(By.xpath("(//*[@class='gekhq4-4 egoSnI'])[1]"));
        Thread.sleep(2000);
        clickElement(By.cssSelector("[class='qjixn8-0 sc-1bydi5r-0 kNKwwK']"));
        sendElement(By.id("L-UserNameField"), "zwu70421@cuoly.com");
        Thread.sleep(2000);
        sendElement(By.id("L-PasswordField"), "TESTİNİUM1");
        clickElement(By.id("gg-login-enter"));
        Thread.sleep(500);
        boolean hesabim = displayElement(By.cssSelector("[title='Hesabım'] [class='gekhq4-4 egoSnI']"));
        if (hesabim) {
            logger.info("Hesabım mevcut, login gerçekleşti.");
        } else {
            logger.info("Hesabım mevcut değil , login gerçekleşmedi.");
            fail();
        }
        sendElement(By.cssSelector("[data-cy='header-search-input']"), "bilgisayar");
        clickElement(By.xpath("//button[@data-cy='search-find-button']"));
        Thread.sleep(2000);
        scrollElement(By.xpath("(//*[@class='pager pt30 hidden-m gg-d-24']/ul/li)[2]"));
        Thread.sleep(5000);
        clickElement(By.xpath("(//*[@class='pager pt30 hidden-m gg-d-24']/ul/li)[2]"));
        Thread.sleep(2000);
        assertName(driver.getTitle(),"Bilgisayar - GittiGidiyor - 2/100");
        clickElement(By.xpath("(//*[@class='image-container product-hslider-container'])[3]"));
        Thread.sleep(1000);
        String urunFiyati = getText(By.cssSelector("[id=sp-price-lowPrice]"));
        String urunAdi = getText(By.cssSelector("[class='h1-container']"));
        scrollElement(By.id("add-to-basket"));
        displayElement(By.id("add-to-basket"));
        clickElement(By.id("add-to-basket"));
        Thread.sleep(3000);
        clickElement(By.cssSelector("[class='dIB']"));
        Thread.sleep(3000);
        assertControl(By.cssSelector("[class='gg-d-8 detail-price']"),urunFiyati);
        assertControl(By.cssSelector("[class='title-link']"),urunAdi);
        Thread.sleep(3000);
        selectByValue(By.cssSelector("[class='amount']"),"2");
        Thread.sleep(3000);
        clickElement(By.xpath("(//*[@class='btn-delete btn-update-item'])[1]"));
        Thread.sleep(3000);
        assertControl(By.xpath("//*[@class='gg-w-22 gg-d-22 gg-t-21 gg-m-18']/h2"),"Sepetinizde ürün bulunmamaktadır.");
        }
}