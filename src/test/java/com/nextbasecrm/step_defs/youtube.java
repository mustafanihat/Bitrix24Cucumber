package com.nextbasecrm.step_defs;

import com.nextbasecrm.pages.YoutubePage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class youtube {
    YoutubePage youtubePage = new YoutubePage();

    @Given("as a user I open the youtube")
    public void as_a_user_I_open_the_youtube() {
        Driver.get().get(ConfigurationReader.get("youtubeUrl"));
        youtubePage.dismissButton.click();
        Driver.get().switchTo().frame(0);
//        WebElement iframe = Driver.get().findElement(By.xpath("(//iframe)[1]"));
//        Driver.get().switchTo().frame(iframe);
        youtubePage.agreeButton.click();
        Driver.get().switchTo().defaultContent();
    }

    @When("I search {string}")
    public void i_search(String string) {
        youtubePage.writeTextToTheSearchBox(string);
        youtubePage.searchBox.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(3);
    }

    @Then("I should be able to see the {string} channel on page")
    public void i_should_be_able_to_see_the_channel_on_page(String string) {
        youtubePage.clickYoutubeChannel(string);
    }
}
