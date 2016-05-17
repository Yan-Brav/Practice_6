package qa.skillsup.practice6.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class W3HtmlTablePage {
    private WebDriver driver;
    String baseUrl = "http://www.w3schools.com/html/html_tables.asp";
    private By rows = By.xpath(".//table[@class='w3-table-all']/tbody/tr[position()>1]");
    private By column = By.xpath("td[2]");
    private By point = By.xpath("td[4]");


    public W3HtmlTablePage(WebDriver driver) {
        this.driver = driver;
        driver.get(baseUrl);
        PageFactory.initElements(driver, this);
    }
    private WebElement getRowByName(String name){
        List<WebElement> tableRows = driver.findElements(rows);
        WebElement requiredRow = null;
        for (WebElement row : tableRows){
            if (row.findElement(column).getText().contains(name)){
                requiredRow = row;
                break;
            }
        }
        return requiredRow;
    }

    public String getTextRowByName(String name){
        return getRowByName(name).getText();
    }
    public String getValuePointsByName(String name){
        return getRowByName(name).findElement(point).getText();
    }

}
