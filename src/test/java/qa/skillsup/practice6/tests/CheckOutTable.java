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
    @Test
    public void checkOutPointsByName(){
        page = new W3HtmlTablePage(driver);
        String name = "John";
        System.out.println(page.getValuePointsByName(name));
    }
    //It is negative test.
    @Test(expected = java.lang.NullPointerException.class)
    public void checkOutRowByIncorrectlyName(){
        page = new W3HtmlTablePage(driver);
        String name = "Vasiya Pupkin";
        System.out.println(page.getTextRowByName(name));
    }
}
