package sangauto.testcases;

import sangauto.Base.BaseTest;
import org.testng.annotations.Test;

public class LoginHRMTest extends BaseTest {


    @Test
    public void testLoginHRM() {
        getLoginHRMPage().login();
    }


}
