package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.PorschePage;
import utilities.Driver;

import java.util.List;
import java.util.Set;

public class Porsche_steps {

    PorschePage pp = new PorschePage();



    @Given("User goes to porsche application car configurator module")
    public void user_goes_to_porsche_application_car_configurator_module() {
        Driver.getDriver().get("https://www.porsche.com/usa/modelstart/");
    }

    @Given("User selects model seven zero eight")
    public void user_selects_model_seven_zero_eight() {
        pp.porsche718.click();
    }

    @Given("User remembers the price of seven zero eight Cayman Model S")
    public String user_remembers_the_price_of_seven_zero_eight_Cayman_Model_S() {
          String caymanSPrice = pp.porscheCaymanSPrice.getText().substring(8);
          return caymanSPrice;
    }

    @Given("User clicks on Click on seven zero eight Cayman S")
    public void user_clicks_on_Click_on_seven_zero_eight_Cayman_S() {
        pp.porscheCaymanS.click();
    }

    @Given("User verifies that Base price displayed on the page is same as the price from step three")
    public void user_verifies_that_Base_price_displayed_on_the_page_is_same_as_the_price_from_step_three() {
        Set<String> handles= Driver.getDriver().getWindowHandles();
        for(String s : handles){
            Driver.getDriver().switchTo().window(s);
            if(Driver.getDriver().getTitle().equals("Porsche Car Configurator")){
                break;
            }
        }

    }

    @Given("User verifies that Price for Equipment is zero")
    public void user_verifies_that_Price_for_Equipment_is_zero() {
        Assert.assertTrue(pp.priceForEquipment.getText().equals("$0"));
    }

    @Given("User verifies that total price is the sum of base price plus Delivery, Processing and Handling Fee")
    public void user_verifies_that_total_price_is_the_sum_of_base_price_plus_Delivery_Processing_and_Handling_Fee() {
        pp.verifyTotalPrice();
    }

    @Given("User selects color Miami Blue")
    public void user_selects_color_Miami_Blue() {
        pp.miamiBlueColor.click();
    }

    @Given("User verifies that Price for Equipment is Equal to Miami Blue price")
    public void user_verifies_that_Price_for_Equipment_is_Equal_to_Miami_Blue_price() {
        int color = Integer.parseInt(pp.miamiBlueColorPrice.getAttribute("data-price").substring(1).replace(",",""));
        int equipment = Integer.parseInt(pp.priceForEquipment.getText().substring(1).replace(",",""));
        Assert.assertTrue(color==equipment);
    }

    @Given("User verifies that total price is the sum of base price plus Price for Equipment plus Delivery, Processing and Handling Feee")
    public void user_verifies_that_total_price_is_the_sum_of_base_price_plus_Price_for_Equipment_plus_Delivery_Processing_and_Handling_Feee() {
        pp.verifyTotalPrice();
    }

    @Given("User selects twenty inch Carrera Sport Wheels")
    public void user_selects_twenty_inch_Carrera_Sport_Wheels() {
        pp.carreraSportWheels.click();
    }

    @Given("User verifies that Price for Equipment is the sum of Miami Blue price plus twenty inch Carrera Sport Wheels")
    public void user_verifies_that_Price_for_Equipment_is_the_sum_of_Miami_Blue_price_plus_twenty_inch_Carrera_Sport_Wheels() {
        int rimsPrice = Integer.parseInt(pp.carreraSportWheelsPrice.getAttribute("data-price").substring(1).replace(",",""));
        int equipment = Integer.parseInt(pp.priceForEquipment.getText().substring(1).replace(",",""));
        int color = Integer.parseInt(pp.miamiBlueColorPrice.getAttribute("data-price").substring(1).replace(",",""));
        Assert.assertTrue(equipment==rimsPrice+color);
    }

    @Given("User Verifies that total price is the sum of base price plus Price for Equipment plus Delivery, Processing and Handling Fee")
    public void user_Verifies_that_total_price_is_the_sum_of_base_price_plus_Price_for_Equipment_plus_Delivery_Processing_and_Handling_Fee() {
        pp.verifyTotalPrice();
    }

    @Given("User selects seats Power Sport Seats fourteen way with Memory Package")
    public void user_selects_seats_Power_Sport_Seats_fourteen_way_with_Memory_Package() {
       Actions actions = new Actions(Driver.getDriver());
       actions.moveToElement(pp.adaptiveSportSeats).perform();
       pp.seats14Way.click();
    }

    @Given("User verifies that Price for Equipment is the sum of Miami Blue price plus twenty inch Carrera Sport Wheels plus Power Sport Seats fourteen way with Memory Package")
    public void user_verifies_that_Price_for_Equipment_is_the_sum_of_Miami_Blue_price_plus_twenty_inch_Carrera_Sport_Wheels_plus_Power_Sport_Seats_fourteen_way_with_Memory_Package() {
        int seats = Integer.parseInt(pp.seats14WayPrice.getText().substring(1).replace(",",""));
        int equipment = Integer.parseInt(pp.priceForEquipment.getText().substring(1).replace(",",""));
        int rimsPrice = Integer.parseInt(pp.carreraSportWheelsPrice.getAttribute("data-price").substring(1).replace(",",""));
        int color = Integer.parseInt(pp.miamiBlueColorPrice.getAttribute("data-price").substring(1).replace(",",""));
        Assert.assertTrue(equipment==seats+rimsPrice+color);
    }

    @Given("User Verifies that total price is the sum of base price plus Price for Equipment plus Delivery,Processing and Handling Fe")
    public void user_Verifies_that_total_price_is_the_sum_of_base_price_plus_Price_for_Equipment_plus_Delivery_Processing_and_Handling_Fe() {
        pp.verifyTotalPrice();
    }

    @Given("User clicks on Interior Carbon Fiber")
    public void user_clicks_on_Interior_Carbon_Fiber() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(pp.deliveryExperience).perform();
        pp.carbonFiberInteriorSelector.click();
    }

    @Given("User selects Interior Trim in Carbon Fiber i.c.w. Standard Interior")
    public void user_selects_Interior_Trim_in_Carbon_Fiber_i_c_w_Standard_Interior() {
        pp.interiorTrimInCarbonFiber.click();
    }

    @Given("User verifies that Price for Equipment is the sum of Miami Blue price plus twenty Carrera Sport Wheels plus Power Sport Seats fourteen way with Memory Package plus Interior Trim inCarbon Fiber i.c.w.Standard Interior")
    public void user_verifies_that_Price_for_Equipment_is_the_sum_of_Miami_Blue_price_plus_twenty_Carrera_Sport_Wheels_plus_Power_Sport_Seats_fourteen_way_with_Memory_Package_plus_Interior_Trim_inCarbon_Fiber_i_c_w_Standard_Interior() {
        int carbonInterior = Integer.parseInt(pp.interiorTrimInCarbonFiberPrice.getText().substring(1).replace(",",""));
        int seats = Integer.parseInt(pp.seats14WayPrice.getText().substring(1).replace(",",""));
        int equipment = Integer.parseInt(pp.priceForEquipment.getText().substring(1).replace(",",""));
        int rimsPrice = Integer.parseInt(pp.carreraSportWheelsPrice.getAttribute("data-price").substring(1).replace(",",""));
        int color = Integer.parseInt(pp.miamiBlueColorPrice.getAttribute("data-price").substring(1).replace(",",""));
        Assert.assertTrue(equipment==carbonInterior+seats+rimsPrice+color);
    }

    @Given("User verifies that total price is the sum of base price plus Price for Equipment plus Delivery,Processing and Handling Fee")
    public void user_verifies_that_total_price_is_the_sum_of_base_price_plus_Price_for_Equipment_plus_Delivery_Processing_and_Handling_Fee() {
        pp.verifyTotalPrice();
    }

    @Given("User clicks on Performance")
    public void user_clicks_on_Performance() {
        pp.performance.click();
    }

    @Given("User selects seven speed Porsche Doppelkupplung PDK")
    public void user_selects_seven_speed_Porsche_Doppelkupplung_PDK() {
        pp.doppelkupplungPDK.click();
    }

    @Given("User selects Porsche Ceramic Composite Brakes PCCB")
    public void user_selects_Porsche_Ceramic_Composite_Brakes_PCCB() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(pp.lightsAndVision).perform();
        pp.ceramicCompositeBrakes.click();

    }

    @Given("User Verify that Price for Equipment is the sum of Miami Blue price plus twenty inch Carrera SportWheelsplus Power Sport Seats fourteen way with Memory Package  plus Interior Trim in Carbon Fiber i.c.w.Standard Interior plus seven speed Porsche Doppelkupplung PDK plus Porsche Ceramic CompositeBrakes PCCB")
    public void user_Verify_that_Price_for_Equipment_is_the_sum_of_Miami_Blue_price_plus_twenty_inch_Carrera_SportWheelsplus_Power_Sport_Seats_fourteen_way_with_Memory_Package_plus_Interior_Trim_in_Carbon_Fiber_i_c_w_Standard_Interior_plus_seven_speed_Porsche_Doppelkupplung_PDK_plus_Porsche_Ceramic_CompositeBrakes_PCCB() {
        int carbonInterior = Integer.parseInt(pp.interiorTrimInCarbonFiberPrice.getText().substring(1).replace(",",""));
        int seats = Integer.parseInt(pp.seats14WayPrice.getText().substring(1).replace(",",""));
        int equipment = Integer.parseInt(pp.priceForEquipment.getText().substring(1).replace(",",""));
        int rimsPrice = Integer.parseInt(pp.carreraSportWheelsPrice.getAttribute("data-price").substring(1).replace(",",""));
        int color = Integer.parseInt(pp.miamiBlueColorPrice.getAttribute("data-price").substring(1).replace(",",""));
        int transmission = Integer.parseInt(pp.doppelkupplungPDKPrice.getText().substring(1).replace(",",""));
        int ceramicBrakes = Integer.parseInt(pp.getCeramicCompositeBrakesPrice.getText().substring(1).replace(",",""));
        Assert.assertTrue(equipment==carbonInterior+seats+rimsPrice+color+transmission+ceramicBrakes);

    }

    @Given("User Verify that total price is the sum of base price plus Price for Equipment plus Delivery, Processingand Handling Fee")
    public void user_Verify_that_total_price_is_the_sum_of_base_price_plus_Price_for_Equipment_plus_Delivery_Processingand_Handling_Fee() {
        pp.verifyTotalPrice();
    }


}
