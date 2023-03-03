package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WeFunderPage extends CommonPage {
@FindBy(xpath= "(//div[@class='osano-cm-dialog__buttons osano-cm-buttons']/button)[2]")
    public WebElement cookies;

@FindBy(xpath = "//h1[@class='text-base md:text-lg  text-coolgray-800 uppercase tracking-wider pr-1 sm:pr-0']")
    public WebElement SentenceOfInvest;
@FindBy(id = "overview-tab")
    public WebElement Overview;

@FindBy(xpath = "//h3[@class='h4 mb-8'][2]")
public WebElement Pitch;


}
