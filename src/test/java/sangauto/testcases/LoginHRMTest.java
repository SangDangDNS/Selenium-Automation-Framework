package sangauto.testcases;

import org.testng.annotations.Test;
import sangauto.pages.CommonPage;

public class LoginHRMTest extends CommonPage {


    @Test
    public void testLoginHRM() {
        getLoginHRMPage().login();
    }


}
