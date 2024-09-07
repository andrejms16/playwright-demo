import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PageAssertions;
import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class AppTest {

    @Test
    public void test_Playwright(){
        Playwright playwright = Playwright.create();
            Browser browser = playwright.chromium().launch();
            Page page = browser.newPage();
            page.navigate("http://playwright.dev");
            System.out.println("Teste Andre");
            System.out.println(page.title());
            assertThat(page).hasTitle("Fast and reliable end-to-end testing for modern web apps | Playwright");
            page.close();
            browser.close();
            playwright.close();
    }
}
