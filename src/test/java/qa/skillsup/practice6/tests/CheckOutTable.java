package qa.skillsup.practice6.tests;

import org.junit.Test;
import qa.skillsup.practice6.pages.W3HtmlTablePage;

public class CheckOutTable extends BaseTest {
    private W3HtmlTablePage page;

    @Test
    public void checkOutRowByName(){
        page = new W3HtmlTablePage(driver);
        String name = "John";
        System.out.println(page.getTextRowByName(name));
    }
}
