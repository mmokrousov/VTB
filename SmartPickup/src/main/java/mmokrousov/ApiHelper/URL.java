package mmokrousov.ApiHelper;

public class URL {
    public final static String Get_Deposits_And_Savings_Accounts;
    public final static String CalculateProduct;
    public final static String Calculate;
    public final static String CreateContract;
    public final static String CancelContract;
    public final static String GetDocument;
    public final static String CheckBlacklist;
    public final static String CheckAccess;
    public final static String AccountNoUnc;
    public final static String DepositNoUnc;

    static {
        String circuit = "ST";
        switch (circuit){
            case "ST":
                Get_Deposits_And_Savings_Accounts = "https://savings-metal.ds1-genr01-savc-savings-st.apps.ds1-genr01.corp.dev.vtb/v1/getDepositsAndSavingsAccounts";
                CalculateProduct = "https://savings-metal.ds1-genr01-savc-savings-st.apps.ds1-genr01.corp.dev.vtb/v1/calculateProduct";
                Calculate = "https://savings-metal.ds1-genr01-savc-savings-st.apps.ds1-genr01.corp.dev.vtb/ui/v1/calculate";
                CreateContract = "https://savings-metal.ds1-genr01-savc-savings-st.apps.ds1-genr01.corp.dev.vtb/ui/v1/createContract";
                CancelContract = "https://savings-metal.ds1-genr01-savc-savings-st.apps.ds1-genr01.corp.dev.vtb/ui/v1/cancelContract?contractNumber=";
                GetDocument = "https://savings-metal.ds1-genr01-savc-savings-st.apps.ds1-genr01.corp.dev.vtb/ft/rb/savc/savings-metal/ui/v1/getDocument";
                CheckBlacklist = "https://savings-metal.ds1-genr01-savc-savings-st.apps.ds1-genr01.corp.dev.vtb/ui/v1/checkBlacklist";
                CheckAccess = "https://savings-metal.ds1-genr01-savc-savings-st.apps.ds1-genr01.corp.dev.vtb/ui/v1/checkAccess";
                AccountNoUnc = "https://savings-product-market.ss1-genr01-savc-savings-k3.apps.ss1-genr01.test.vtb.ru/api/v1/product/accountNoUnc";
                DepositNoUnc = "https://savings-product-market.ss1-genr01-savc-savings-k3.apps.ss1-genr01.test.vtb.ru/api/v1/product/depositNoUnc";
                break;
            case "DEV":
                Get_Deposits_And_Savings_Accounts = "https://k4-epaa-app401lv.vtb24.ru/api/rb/fins/finstrategy-configurator/v1/getDepositsAndSavingsAccounts";
                CalculateProduct = "https://k4-epaa-app401lv.vtb24.ru/api/rb/fins/finstrategy-configurator/v1/calculateProduct";
                Calculate = "";
                CreateContract = "";
                CancelContract = "";
                GetDocument = "";
                CheckBlacklist = "";
                CheckAccess = "";
                AccountNoUnc = "https://savings-product-market.rs1-genr01-savc-savings-k4.apps.rs1-genr01.test.vtb.ru/api/v1/product/accountNoUnc";
                DepositNoUnc = "https://savings-product-market.rs1-genr01-savc-savings-k4.apps.rs1-genr01.test.vtb.ru/api/v1/product/depositNoUnc";
                break;
            default:
                Get_Deposits_And_Savings_Accounts = "https://savings-metal.ds1-genr01-savc-savings-st.apps.ds1-genr01.corp.dev.vtb/v1/getDepositsAndSavingsAccounts";
                CalculateProduct = "https://savings-metal.ds1-genr01-savc-savings-st.apps.ds1-genr01.corp.dev.vtb/v1/calculateProduct";
                Calculate = "https://savings-metal.ds1-genr01-savc-savings-st.apps.ds1-genr01.corp.dev.vtb/ui/v1/calculate";
                CreateContract = "https://savings-metal.ds1-genr01-savc-savings-st.apps.ds1-genr01.corp.dev.vtb/ui/v1/createContract";
                CancelContract = "https://savings-metal.ds1-genr01-savc-savings-st.apps.ds1-genr01.corp.dev.vtb/ui/v1/cancelContract?contractNumber=";
                GetDocument = "https://savings-metal.ds1-genr01-savc-savings-st.apps.ds1-genr01.corp.dev.vtb/ft/rb/savc/savings-metal/ui/v1/getDocument";
                CheckBlacklist = "https://savings-metal.ds1-genr01-savc-savings-st.apps.ds1-genr01.corp.dev.vtb/ui/v1/checkBlacklist";
                CheckAccess = "https://savings-metal.ds1-genr01-savc-savings-st.apps.ds1-genr01.corp.dev.vtb/ui/v1/checkAccess";
                AccountNoUnc = "https://savings-product-market.ss1-genr01-savc-savings-k3.apps.ss1-genr01.test.vtb.ru/api/v1/product/accountNoUnc";
                DepositNoUnc = "https://savings-product-market.ss1-genr01-savc-savings-k3.apps.ss1-genr01.test.vtb.ru/api/v1/product/depositNoUnc";
        }
    }
}
