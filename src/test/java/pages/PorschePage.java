package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PorschePage {

    WebDriver driver;
    public PorschePage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[.='718']")
    public WebElement porsche718;

    @FindBy(xpath = "//img[@title = 'Porsche 718 Cayman S']/../following-sibling::div/div[2]")
    public WebElement porscheCaymanSPrice;

    @FindBy(xpath = "//img[@title = 'Porsche 718 Cayman S']/../following-sibling::div/div[2]")
    public WebElement porscheCaymanS;

    @FindBy(xpath = "(//section[@id='s_price']//div[@class='ccaPrice'])[2]")
    public WebElement priceForEquipment;

    @FindBy(xpath = "//section[@id='s_price']//div[@class='ccaPrice']")
    public WebElement basePrice;

    @FindBy(xpath = "(//section[@id='s_price']//div[@class='ccaPrice'])[3]")
    public WebElement deliveryProccessingHandling;

    @FindBy(xpath = "(//section[@id='s_price']//div[@class='ccaPrice'])[4]")
    public WebElement totalPrice;

    @FindBy(xpath = "//span[@style='background-color: rgb(0, 120, 138);']")
    public WebElement miamiBlueColor;

    @FindBy(xpath = "//li[@id='s_exterieur_x_FJ5']")
    public WebElement miamiBlueColorPrice;

    @FindBy(xpath = "//li[@id='s_exterieur_x_MXRD']/span")
    public WebElement carreraSportWheels;

    @FindBy(id = "s_exterieur_x_MXRD")
    public WebElement carreraSportWheelsPrice;

    @FindBy(xpath = "//span[@id='s_interieur_x_PP06']")
    public WebElement seats14Way;

    @FindBy(id = "s_interieur_x_PP07")
    public WebElement adaptiveSportSeats;

    @FindBy(xpath = "//div[@id='s_interieur_x_73_x_PP06_x_shorttext']/../div[@class='pBox']")
    public WebElement seats14WayPrice;

    @FindBy(id = "IWA_subHdl")
    public WebElement deliveryExperience;

    @FindBy(id = "IIC_subHdl")
    public WebElement carbonFiberInteriorSelector;

    @FindBy(id = "vs_table_IIC_x_PEKH_x_c01_PEKH")
    public WebElement interiorTrimInCarbonFiber;

    @FindBy(xpath = "//div[@id='vs_table_IIC_x_PEKH_x_c04_PEKH_x_shorttext']/following-sibling::div")
    public WebElement interiorTrimInCarbonFiberPrice;

    @FindBy(id = "IMG_subHdl")
    public WebElement performance;

    @FindBy(id = "ILS_subHdl")
    public WebElement lightsAndVision;

    @FindBy(id = "vs_table_IMG_x_M250_x_c11_M250")
    public WebElement doppelkupplungPDK;

    @FindBy(xpath = "//div[@id = 'vs_table_IMG_x_M250_x_c14_M250_x_shorttext']/../div[@class='pBox']")
    public WebElement doppelkupplungPDKPrice;

    @FindBy(id = "vs_table_IMG_x_M450_x_c81_M450")
    public WebElement ceramicCompositeBrakes;

    @FindBy(xpath = "//div[@id = 'vs_table_IMG_x_M450_x_c84_M450_x_shorttext']/../div[@class='pBox']" )
    public WebElement getCeramicCompositeBrakesPrice;

    public  void verifyTotalPrice(){
        int basePrice = Integer.parseInt(this.basePrice.getText().substring(1).replace(",",""));
        int deliveryProcHand = Integer.parseInt(this.deliveryProccessingHandling.getText().substring(1).replace(",",""));
        int total = Integer.parseInt(this.totalPrice.getText().substring(1).replace(",",""));
        int equipment = Integer.parseInt(this.priceForEquipment.getText().substring(1).replace(",",""));
        Assert.assertTrue(total==basePrice+deliveryProcHand+equipment);
    }




}
