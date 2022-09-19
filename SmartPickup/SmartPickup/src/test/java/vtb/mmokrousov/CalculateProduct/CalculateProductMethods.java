package vtb.mmokrousov.CalculateProduct;

import mmokrousov.Comparator.CalculateProductComparator;
import mmokrousov.Comparator.IComparator;
import mmokrousov.Model.AccountNoUnc.Response.AccountsNoUncResponse;
import mmokrousov.Model.CalculateProduct.CalculateProductTestCase;
import mmokrousov.Model.CalculateProduct.Response.CalculateProductResponse;
import mmokrousov.Model.DepositNoUnc.Response.DepositNoUncResponse;
import mmokrousov.Processor.Replace.ReplaceCalculateProduct;
import org.testng.annotations.Test;

import static mmokrousov.ApiHelper.Post.*;
import static mmokrousov.ApiHelper.Post.requestAPI200;
import static mmokrousov.ApiHelper.Constants.*;
import static mmokrousov.ApiHelper.URL.*;
import static mmokrousov.ApiHelper.URL.DepositNoUnc;
import static mmokrousov.Processor.Deserialization.DeserializationBase.*;
import static mmokrousov.Processor.Serialization.JsonGenerator.ObjectToJsonString;

public class CalculateProductMethods {
    public IComparator comparator = new CalculateProductComparator();
    private final Class<CalculateProductTestCase> clazz = CalculateProductTestCase.class;
    private final Class<CalculateProductResponse> clazzLow = CalculateProductResponse.class;
    private final Class<AccountsNoUncResponse> clazzAccountsNoUnc = AccountsNoUncResponse.class;
    private final Class<DepositNoUncResponse> clazzDepositsNoUnc = DepositNoUncResponse.class;


    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK1() {

        ReplaceCalculateProduct replaceCalculateProduct = new ReplaceCalculateProduct();

        //Десериализация запроса
        CalculateProductTestCase calculateProductTestCase = JsonToObject("src/test/resources/CalculateProduct/Business/TK1", clazz);


        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateProductTestCase.getRequest()),
                CalculateProduct,
                header_1421(),
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        CalculateProductResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, replaceCalculateProduct.replaceCalculateProduct(calculateProductTestCase.getResponse(), calculateProductTestCase.getRequest(), testCase, accountsNoUncResponse, depositNoUncResponse));
    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK2() {

        ReplaceCalculateProduct replaceCalculateProduct = new ReplaceCalculateProduct();

        //Десериализация запроса
        CalculateProductTestCase calculateProductTestCase = JsonToObject("src/test/resources/CalculateProduct/Business/TK2", clazz);


        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateProductTestCase.getRequest()),
                CalculateProduct,
                header_1421(),
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        CalculateProductResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, replaceCalculateProduct.replaceCalculateProduct(calculateProductTestCase.getResponse(), calculateProductTestCase.getRequest(), testCase, accountsNoUncResponse, depositNoUncResponse));
    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK3() {

        ReplaceCalculateProduct replaceCalculateProduct = new ReplaceCalculateProduct();

        //Десериализация запроса
        CalculateProductTestCase calculateProductTestCase = JsonToObject("src/test/resources/CalculateProduct/Business/TK3", clazz);


        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateProductTestCase.getRequest()),
                CalculateProduct,
                header_1421(),
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        CalculateProductResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, replaceCalculateProduct.replaceCalculateProduct(calculateProductTestCase.getResponse(), calculateProductTestCase.getRequest(), testCase, accountsNoUncResponse, depositNoUncResponse));
    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK4() {

        ReplaceCalculateProduct replaceCalculateProduct = new ReplaceCalculateProduct();

        //Десериализация запроса
        CalculateProductTestCase calculateProductTestCase = JsonToObject("src/test/resources/CalculateProduct/Business/TK4", clazz);


        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateProductTestCase.getRequest()),
                CalculateProduct,
                header_1421(),
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        CalculateProductResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, replaceCalculateProduct.replaceCalculateProduct(calculateProductTestCase.getResponse(), calculateProductTestCase.getRequest(), testCase, accountsNoUncResponse, depositNoUncResponse));
    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK5() {

        ReplaceCalculateProduct replaceCalculateProduct = new ReplaceCalculateProduct();

        //Десериализация запроса
        CalculateProductTestCase calculateProductTestCase = JsonToObject("src/test/resources/CalculateProduct/Business/TK5", clazz);


        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateProductTestCase.getRequest()),
                CalculateProduct,
                header_1421(),
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        CalculateProductResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, replaceCalculateProduct.replaceCalculateProduct(calculateProductTestCase.getResponse(), calculateProductTestCase.getRequest(), testCase, accountsNoUncResponse, depositNoUncResponse));
    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK6() {

        ReplaceCalculateProduct replaceCalculateProduct = new ReplaceCalculateProduct();

        //Десериализация запроса
        CalculateProductTestCase calculateProductTestCase = JsonToObject("src/test/resources/CalculateProduct/Business/TK6", clazz);


        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateProductTestCase.getRequest()),
                CalculateProduct,
                header_1421(),
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        CalculateProductResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, replaceCalculateProduct.replaceCalculateProduct(calculateProductTestCase.getResponse(), calculateProductTestCase.getRequest(), testCase, accountsNoUncResponse, depositNoUncResponse));
    }


    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK7() {

        ReplaceCalculateProduct replaceCalculateProduct = new ReplaceCalculateProduct();

        //Десериализация запроса
        CalculateProductTestCase calculateProductTestCase = JsonToObject("src/test/resources/CalculateProduct/Business/TK7", clazz);


        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateProductTestCase.getRequest()),
                CalculateProduct,
                header_1421(),
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        CalculateProductResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, replaceCalculateProduct.replaceCalculateProduct(calculateProductTestCase.getResponse(), calculateProductTestCase.getRequest(), testCase, accountsNoUncResponse, depositNoUncResponse));
    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK8() {

        //Десериализация запроса
        CalculateProductTestCase calculateProductTestCase = JsonToObject("src/test/resources/CalculateProduct/Business/TK8", clazz);


        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateProductTestCase.getRequest()),
                CalculateProduct,
                header_1421(),
                OK);


        //Десериализация ответа и сообщения из файла
        CalculateProductResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, calculateProductTestCase.getResponse());
    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK9() {

        ReplaceCalculateProduct replaceCalculateProduct = new ReplaceCalculateProduct();

        //Десериализация запроса
        CalculateProductTestCase calculateProductTestCase = JsonToObject("src/test/resources/CalculateProduct/Business/TK9", clazz);


        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateProductTestCase.getRequest()),
                CalculateProduct,
                header_1421(),
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        CalculateProductResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, replaceCalculateProduct.replaceCalculateProduct(calculateProductTestCase.getResponse(), calculateProductTestCase.getRequest(), testCase, accountsNoUncResponse, depositNoUncResponse));
    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK10() {

        ReplaceCalculateProduct replaceCalculateProduct = new ReplaceCalculateProduct();

        //Десериализация запроса
        CalculateProductTestCase calculateProductTestCase = JsonToObject("src/test/resources/CalculateProduct/Business/TK10", clazz);


        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateProductTestCase.getRequest()),
                CalculateProduct,
                header_1421(),
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        CalculateProductResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, replaceCalculateProduct.replaceCalculateProduct(calculateProductTestCase.getResponse(), calculateProductTestCase.getRequest(), testCase, accountsNoUncResponse, depositNoUncResponse));
    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK11() {

        ReplaceCalculateProduct replaceCalculateProduct = new ReplaceCalculateProduct();

        //Десериализация запроса
        CalculateProductTestCase calculateProductTestCase = JsonToObject("src/test/resources/CalculateProduct/Business/TK11", clazz);


        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateProductTestCase.getRequest()),
                CalculateProduct,
                header_1421(),
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        CalculateProductResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, replaceCalculateProduct.replaceCalculateProduct(calculateProductTestCase.getResponse(), calculateProductTestCase.getRequest(), testCase, accountsNoUncResponse, depositNoUncResponse));
    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK12() {

        ReplaceCalculateProduct replaceCalculateProduct = new ReplaceCalculateProduct();

        //Десериализация запроса
        CalculateProductTestCase calculateProductTestCase = JsonToObject("src/test/resources/CalculateProduct/Business/TK12", clazz);


        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateProductTestCase.getRequest()),
                CalculateProduct,
                header_1421(),
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        CalculateProductResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, replaceCalculateProduct.replaceCalculateProduct(calculateProductTestCase.getResponse(), calculateProductTestCase.getRequest(), testCase, accountsNoUncResponse, depositNoUncResponse));
    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK13() {
        //Десериализация запроса
        CalculateProductTestCase calculateProductTestCase = JsonToObject("src/test/resources/CalculateProduct/Business/TK13", clazz);


        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateProductTestCase.getRequest()),
                CalculateProduct,
                header_1421(),
                OK);

        //Десериализация ответа и сообщения из файла
        CalculateProductResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, calculateProductTestCase.getResponse());
    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK14() {
        //Десериализация запроса
        CalculateProductTestCase calculateProductTestCase = JsonToObject("src/test/resources/CalculateProduct/Business/TK14", clazz);


        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateProductTestCase.getRequest()),
                CalculateProduct,
                header_1421(),
                UNPROCESSABLE_ENTITY);

        //Десериализация ответа и сообщения из файла
        CalculateProductResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, calculateProductTestCase.getResponse());
    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK15() {
        //Десериализация запроса
        CalculateProductTestCase calculateProductTestCase = JsonToObject("src/test/resources/CalculateProduct/Business/TK15", clazz);


        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateProductTestCase.getRequest()),
                CalculateProduct,
                header_1421(),
                OK);

        //Десериализация ответа и сообщения из файла
        CalculateProductResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, calculateProductTestCase.getResponse());
    }

    /*Продумать логику с ошибкой массива
    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK16() {
        //Десериализация запроса
        CalculateProductTestCase calculateProductTestCase = JsonToObject("src/test/resources/CalculateProduct/Business/TK16", clazz);


        //Получение ответа от микросервиса
        String response = requestAPI200(ObjectToJsonString(calculateProductTestCase.getRequest()), CalculateProduct, header_1421(requestAPI200Epa(Epa)));

        //Десериализация ответа и сообщения из файла
        CalculateProductResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        CalculateProductTestCase testCase1 = JsonToObjectResponseFile("src/test/resources/CalculateProduct/Business/TK16", clazz); //Десериализация эталонного ответа
        comparator.compare(testCase, testCase1.getResponse());
    }*/

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK17() {
        //Десериализация запроса
        CalculateProductTestCase calculateProductTestCase = JsonToObject("src/test/resources/CalculateProduct/Business/TK17", clazz);


        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateProductTestCase.getRequest()),
                CalculateProduct,
                header_1421(),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CalculateProductResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, calculateProductTestCase.getResponse());
    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK18() {

        ReplaceCalculateProduct replaceCalculateProduct = new ReplaceCalculateProduct();

        //Десериализация запроса
        CalculateProductTestCase calculateProductTestCase = JsonToObject("src/test/resources/CalculateProduct/Business/TK18", clazz);


        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateProductTestCase.getRequest()),
                CalculateProduct,
                header_1421(),
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        CalculateProductResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, replaceCalculateProduct.replaceCalculateProduct(calculateProductTestCase.getResponse(), calculateProductTestCase.getRequest(), testCase, accountsNoUncResponse, depositNoUncResponse));
    }
}
