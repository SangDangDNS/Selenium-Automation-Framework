package sangauto.dataprovider;

import sangauto.supports.ExcelSupports;
import sangauto.supports.Supports;
import org.testng.annotations.DataProvider;

public class DataProviderManager {
    @DataProvider(name = "data_provider_login", parallel = true)
    public Object[][] dataLoginHRM() {
        return new Object[][]{{"frances.burns", "frances.burns"}, {"joe.larson", "joe.larson"}};
    }

    @DataProvider(name = "data_provider_login_from_excel", parallel = true)
    public Object[][] dataLoginHRMFromExcel() {

        ExcelSupports excelHelpers = new ExcelSupports();

        Object[][] data = excelHelpers.getExcelData(Supports.getCurrentDir() + "datatest/Login.xlsx", "Sheet1");

        return data;
    }

    @DataProvider(name = "data_provider_login_from_excel_by_row", parallel = true)
    public Object[][] dataLoginHRMFromExcelByRow() {

        ExcelSupports excelHelpers = new ExcelSupports();

        Object[][] data = excelHelpers.getExcelDataHashTable(Supports.getCurrentDir() + "datatest/Login.xlsx", "Sheet1", 1, 2);

        return data;
    }
}
