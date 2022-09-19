package vtb.mmokrousov.GetDepositsAndSavingsAccounts;

import mmokrousov.Comparator.GetDepositsAndSavingsAccountsComparator;
import mmokrousov.Comparator.IComparator;
import mmokrousov.Model.AccountNoUnc.Response.AccountsNoUncResponse;
import mmokrousov.Model.DepositNoUnc.Response.DepositNoUncResponse;
import mmokrousov.Model.GetDepositsAndSavingsAccounts.GetDepositsAndSavingsAccountsTestCase;
import mmokrousov.Model.GetDepositsAndSavingsAccounts.Response.GetDepositsAndSavingsAccountsResponse;
import mmokrousov.Processor.Replace.ReplaceDepositAccount;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.UUID;

import static mmokrousov.ApiHelper.Constants.*;
import static mmokrousov.ApiHelper.Post.*;
import static mmokrousov.ApiHelper.URL.*;
import static mmokrousov.Processor.Deserialization.DeserializationBase.*;
import static mmokrousov.Processor.Serialization.JsonGenerator.ObjectToJsonString;

public class GetDepositsAndSavingsAccountsMethods {
    public IComparator comparator = new GetDepositsAndSavingsAccountsComparator();
    private final Class<GetDepositsAndSavingsAccountsTestCase> clazz = GetDepositsAndSavingsAccountsTestCase.class;
    private final Class<GetDepositsAndSavingsAccountsResponse> clazzLow = GetDepositsAndSavingsAccountsResponse.class;
    private final Class<AccountsNoUncResponse> clazzAccountsNoUnc = AccountsNoUncResponse.class;
    private final Class<DepositNoUncResponse> clazzDepositsNoUnc = DepositNoUncResponse.class;




    @Test
    public void GetDepositsAndSavingsAccountsPostHeaderTK1() {

        HashMap<String, String> header = new HashMap<>();
        header.put("X-Initiator-Service", "Minerva");
        header.put("X-Mdm-Id", "1085515039");
        header.put("X-UNC", "11966058");
        header.put("X-User-Session-ID", UUID.randomUUID().toString());
        header.put("X-Message-ID", UUID.randomUUID().toString());
        //header.put("Authorization", requestAPI200Epa(Epa));
        //Десериализация запроса
        GetDepositsAndSavingsAccountsTestCase getDepositsAndSavingsAccountsTestCase = JsonToObject("src/test/resources/getDepositsAndSavingsAccounts/RequiredHeader/TK1", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(getDepositsAndSavingsAccountsTestCase.getRequest()),
                Get_Deposits_And_Savings_Accounts,
                header,
                BAD_REQUEST);


        //Десериализация ответа и сообщения из файла
        GetDepositsAndSavingsAccountsResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, getDepositsAndSavingsAccountsTestCase.getResponse());
    }

    @Test
    public void GetDepositsAndSavingsAccountsPostHeaderTK2() {

        HashMap<String, String> header = new HashMap<>();
        header.put("X-Initiator-Host", "vtb.ru");
        header.put("X-Mdm-Id", "1085515039");
        header.put("X-UNC", "11966058");
        header.put("X-User-Session-ID", UUID.randomUUID().toString());
        header.put("X-Message-ID", UUID.randomUUID().toString());
        //header.put("Authorization", requestAPI200Epa(Epa));
        //Десериализация запроса
        GetDepositsAndSavingsAccountsTestCase getDepositsAndSavingsAccountsTestCase = JsonToObject("src/test/resources/getDepositsAndSavingsAccounts/RequiredHeader/TK2", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(getDepositsAndSavingsAccountsTestCase.getRequest()),
                Get_Deposits_And_Savings_Accounts,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        GetDepositsAndSavingsAccountsResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, getDepositsAndSavingsAccountsTestCase.getResponse());

    }

    @Test
    public void GetDepositsAndSavingsAccountsPostHeaderTK3() {
        ReplaceDepositAccount replaceDepositAccount = new ReplaceDepositAccount();

        HashMap<String, String> header = new HashMap<>();
        header.put("X-Initiator-Host", "vtb.ru");
        header.put("X-Initiator-Service", "Minerva");
        header.put("X-UNC", "11966058");
        header.put("X-User-Session-ID", UUID.randomUUID().toString());
        header.put("X-Message-ID", UUID.randomUUID().toString());
        //header.put("Authorization", requestAPI200Epa(Epa));
        //Десериализация запроса
        GetDepositsAndSavingsAccountsTestCase getDepositsAndSavingsAccountsTestCase = JsonToObject("src/test/resources/getDepositsAndSavingsAccounts/RequiredHeader/TK3", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(getDepositsAndSavingsAccountsTestCase.getRequest()),
                Get_Deposits_And_Savings_Accounts,
                header,
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        GetDepositsAndSavingsAccountsResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, replaceDepositAccount.replaceEtalon(getDepositsAndSavingsAccountsTestCase.getResponse(), testCase, getDepositsAndSavingsAccountsTestCase.getRequest(), accountsNoUncResponse, depositNoUncResponse));
    }

    @Test
    public void GetDepositsAndSavingsAccountsPostHeaderTK4() {
        ReplaceDepositAccount replaceDepositAccount = new ReplaceDepositAccount();

        HashMap<String, String> header = new HashMap<>();
        header.put("X-Initiator-Host", "vtb.ru");
        header.put("X-Initiator-Service", "Minerva");
        header.put("X-Mdm-Id", "1085515039");
        header.put("X-User-Session-ID", UUID.randomUUID().toString());
        header.put("X-Message-ID", UUID.randomUUID().toString());
        //header.put("Authorization", requestAPI200Epa(Epa));
        //Десериализация запроса
        GetDepositsAndSavingsAccountsTestCase getDepositsAndSavingsAccountsTestCase = JsonToObject("src/test/resources/getDepositsAndSavingsAccounts/RequiredHeader/TK4", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(getDepositsAndSavingsAccountsTestCase.getRequest()),
                Get_Deposits_And_Savings_Accounts,
                header,
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        GetDepositsAndSavingsAccountsResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, replaceDepositAccount.replaceEtalon(getDepositsAndSavingsAccountsTestCase.getResponse(), testCase, getDepositsAndSavingsAccountsTestCase.getRequest(), accountsNoUncResponse, depositNoUncResponse));
    }

    @Test
    public void GetDepositsAndSavingsAccountsPostHeaderTK5() {

        HashMap<String, String> header = new HashMap<>();
        header.put("X-Initiator-Host", "vtb.ru");
        header.put("X-Initiator-Service", "Minerva");
        header.put("X-Mdm-Id", "1085515039");
        header.put("X-UNC", "11966058");
        header.put("X-User-Session-ID", UUID.randomUUID().toString());
        //header.put("Authorization", requestAPI200Epa(Epa));
        //Десериализация запроса
        GetDepositsAndSavingsAccountsTestCase getDepositsAndSavingsAccountsTestCase = JsonToObject("src/test/resources/getDepositsAndSavingsAccounts/RequiredHeader/TK5", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(getDepositsAndSavingsAccountsTestCase.getRequest()),
                Get_Deposits_And_Savings_Accounts,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        GetDepositsAndSavingsAccountsResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, getDepositsAndSavingsAccountsTestCase.getResponse());
    }

    @Test
    public void GetDepositsAndSavingsAccountsPostHeaderTK6() {

        HashMap<String, String> header = new HashMap<>();
        header.put("X-Initiator-Host", "vtb.ru");
        header.put("X-Initiator-Service", "Minerva");
        header.put("X-Mdm-Id", "1085515039");
        header.put("X-UNC", "11966058");
        header.put("X-Message-ID", UUID.randomUUID().toString());
        //header.put("Authorization", requestAPI200Epa(Epa));
        //Десериализация запроса
        GetDepositsAndSavingsAccountsTestCase getDepositsAndSavingsAccountsTestCase = JsonToObject("src/test/resources/getDepositsAndSavingsAccounts/RequiredHeader/TK6", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(getDepositsAndSavingsAccountsTestCase.getRequest()),
                Get_Deposits_And_Savings_Accounts,
                header,
                OK);

        //Десериализация ответа и сообщения из файла
        GetDepositsAndSavingsAccountsResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, getDepositsAndSavingsAccountsTestCase.getResponse());

    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK1() {

        ReplaceDepositAccount replaceDepositAccount = new ReplaceDepositAccount();

        //Десериализация запроса
        GetDepositsAndSavingsAccountsTestCase getDepositsAndSavingsAccountsTestCase = JsonToObject("src/test/resources/getDepositsAndSavingsAccounts/Business/TK1", clazz);


        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(getDepositsAndSavingsAccountsTestCase.getRequest()),
                Get_Deposits_And_Savings_Accounts,
                header_1421(),
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        GetDepositsAndSavingsAccountsResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, replaceDepositAccount.replaceEtalon(getDepositsAndSavingsAccountsTestCase.getResponse(), testCase, getDepositsAndSavingsAccountsTestCase.getRequest(), accountsNoUncResponse, depositNoUncResponse));
    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK2() {
        ReplaceDepositAccount replaceDepositAccount = new ReplaceDepositAccount();

        //Десериализация запроса
        GetDepositsAndSavingsAccountsTestCase getDepositsAndSavingsAccountsTestCase = JsonToObject("src/test/resources/getDepositsAndSavingsAccounts/Business/TK2", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(getDepositsAndSavingsAccountsTestCase.getRequest()),
                Get_Deposits_And_Savings_Accounts,
                header_1421(),
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        GetDepositsAndSavingsAccountsResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, replaceDepositAccount.replaceEtalon(getDepositsAndSavingsAccountsTestCase.getResponse(), testCase, getDepositsAndSavingsAccountsTestCase.getRequest(), accountsNoUncResponse, depositNoUncResponse));
    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK3() {
        ReplaceDepositAccount replaceDepositAccount = new ReplaceDepositAccount();
        //Десериализация запроса
        GetDepositsAndSavingsAccountsTestCase getDepositsAndSavingsAccountsTestCase = JsonToObject("src/test/resources/getDepositsAndSavingsAccounts/Business/TK3", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(getDepositsAndSavingsAccountsTestCase.getRequest()),
                Get_Deposits_And_Savings_Accounts,
                header_1421(),
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        GetDepositsAndSavingsAccountsResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, replaceDepositAccount.replaceEtalon(getDepositsAndSavingsAccountsTestCase.getResponse(), testCase, getDepositsAndSavingsAccountsTestCase.getRequest(), accountsNoUncResponse, depositNoUncResponse));

    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK4() {
        ReplaceDepositAccount replaceDepositAccount = new ReplaceDepositAccount();
        //Десериализация запроса
        GetDepositsAndSavingsAccountsTestCase getDepositsAndSavingsAccountsTestCase = JsonToObject("src/test/resources/getDepositsAndSavingsAccounts/Business/TK4", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(getDepositsAndSavingsAccountsTestCase.getRequest()),
                Get_Deposits_And_Savings_Accounts,
                header_1421(),
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        GetDepositsAndSavingsAccountsResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, replaceDepositAccount.replaceEtalon(getDepositsAndSavingsAccountsTestCase.getResponse(), testCase, getDepositsAndSavingsAccountsTestCase.getRequest(), accountsNoUncResponse, depositNoUncResponse));

    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK5() {
        ReplaceDepositAccount replaceDepositAccount = new ReplaceDepositAccount();
        //Десериализация запроса
        GetDepositsAndSavingsAccountsTestCase getDepositsAndSavingsAccountsTestCase = JsonToObject("src/test/resources/getDepositsAndSavingsAccounts/Business/TK5", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(getDepositsAndSavingsAccountsTestCase.getRequest()),
                Get_Deposits_And_Savings_Accounts,
                header_1421(),
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        GetDepositsAndSavingsAccountsResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, replaceDepositAccount.replaceEtalon(getDepositsAndSavingsAccountsTestCase.getResponse(), testCase, getDepositsAndSavingsAccountsTestCase.getRequest(), accountsNoUncResponse, depositNoUncResponse));

    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK6() {
        ReplaceDepositAccount replaceDepositAccount = new ReplaceDepositAccount();
        //Десериализация запроса
        GetDepositsAndSavingsAccountsTestCase getDepositsAndSavingsAccountsTestCase = JsonToObject("src/test/resources/getDepositsAndSavingsAccounts/Business/TK6", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(getDepositsAndSavingsAccountsTestCase.getRequest()),
                Get_Deposits_And_Savings_Accounts,
                header_1421(),
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        GetDepositsAndSavingsAccountsResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, replaceDepositAccount.replaceEtalon(getDepositsAndSavingsAccountsTestCase.getResponse(), testCase, getDepositsAndSavingsAccountsTestCase.getRequest(), accountsNoUncResponse, depositNoUncResponse));

    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK7() {
        ReplaceDepositAccount replaceDepositAccount = new ReplaceDepositAccount();
        //Десериализация запроса
        GetDepositsAndSavingsAccountsTestCase getDepositsAndSavingsAccountsTestCase = JsonToObject("src/test/resources/getDepositsAndSavingsAccounts/Business/TK7", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(getDepositsAndSavingsAccountsTestCase.getRequest()),
                Get_Deposits_And_Savings_Accounts,
                header_1421(),
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        GetDepositsAndSavingsAccountsResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, replaceDepositAccount.replaceEtalon(getDepositsAndSavingsAccountsTestCase.getResponse(), testCase, getDepositsAndSavingsAccountsTestCase.getRequest(), accountsNoUncResponse, depositNoUncResponse));

    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK8() {
        ReplaceDepositAccount replaceDepositAccount = new ReplaceDepositAccount();
        //Десериализация запроса
        GetDepositsAndSavingsAccountsTestCase getDepositsAndSavingsAccountsTestCase = JsonToObject("src/test/resources/getDepositsAndSavingsAccounts/Business/TK8", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(getDepositsAndSavingsAccountsTestCase.getRequest()),
                Get_Deposits_And_Savings_Accounts,
                header_1421(),
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        GetDepositsAndSavingsAccountsResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, replaceDepositAccount.replaceEtalon(getDepositsAndSavingsAccountsTestCase.getResponse(), testCase, getDepositsAndSavingsAccountsTestCase.getRequest(), accountsNoUncResponse, depositNoUncResponse));

    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK9() {
        ReplaceDepositAccount replaceDepositAccount = new ReplaceDepositAccount();
        //Десериализация запроса
        GetDepositsAndSavingsAccountsTestCase getDepositsAndSavingsAccountsTestCase = JsonToObject("src/test/resources/getDepositsAndSavingsAccounts/Business/TK9", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(getDepositsAndSavingsAccountsTestCase.getRequest()),
                Get_Deposits_And_Savings_Accounts,
                header_1421(),
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        GetDepositsAndSavingsAccountsResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, replaceDepositAccount.replaceEtalon(getDepositsAndSavingsAccountsTestCase.getResponse(), testCase, getDepositsAndSavingsAccountsTestCase.getRequest(), accountsNoUncResponse, depositNoUncResponse));

    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK10() {

        //Десериализация запроса
        GetDepositsAndSavingsAccountsTestCase getDepositsAndSavingsAccountsTestCase = JsonToObject("src/test/resources/getDepositsAndSavingsAccounts/Business/TK10", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(getDepositsAndSavingsAccountsTestCase.getRequest()),
                Get_Deposits_And_Savings_Accounts,
                header_1421(),
                OK);

        //Десериализация ответа и сообщения из файла
        GetDepositsAndSavingsAccountsResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, getDepositsAndSavingsAccountsTestCase.getResponse());

    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK11() {
        //Десериализация запроса
        GetDepositsAndSavingsAccountsTestCase getDepositsAndSavingsAccountsTestCase = JsonToObject("src/test/resources/getDepositsAndSavingsAccounts/Business/TK11", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(getDepositsAndSavingsAccountsTestCase.getRequest()),
                Get_Deposits_And_Savings_Accounts,
                header_1421(),
                BAD_REQUEST);
        response = "{\"errors\":" + response + "}";
        //Десериализация ответа и сообщения из файла
        GetDepositsAndSavingsAccountsResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа

        comparator.compare(testCase, getDepositsAndSavingsAccountsTestCase.getResponse());

    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK12() {
        //Десериализация запроса
        GetDepositsAndSavingsAccountsTestCase getDepositsAndSavingsAccountsTestCase = JsonToObject("src/test/resources/getDepositsAndSavingsAccounts/Business/TK12", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(getDepositsAndSavingsAccountsTestCase.getRequest()),
                Get_Deposits_And_Savings_Accounts,
                header_1421(),
                UNPROCESSABLE_ENTITY);

        //Десериализация ответа и сообщения из файла
        GetDepositsAndSavingsAccountsResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа

        comparator.compare(testCase, getDepositsAndSavingsAccountsTestCase.getResponse());

    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK13() {
        //Десериализация запроса
        GetDepositsAndSavingsAccountsTestCase getDepositsAndSavingsAccountsTestCase = JsonToObject("src/test/resources/getDepositsAndSavingsAccounts/Business/TK13", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(getDepositsAndSavingsAccountsTestCase.getRequest()),
                Get_Deposits_And_Savings_Accounts,
                header_1421(),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        GetDepositsAndSavingsAccountsResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа

        comparator.compare(testCase, getDepositsAndSavingsAccountsTestCase.getResponse());

    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK14() {
        ReplaceDepositAccount replaceDepositAccount = new ReplaceDepositAccount();
        //Десериализация запроса
        GetDepositsAndSavingsAccountsTestCase getDepositsAndSavingsAccountsTestCase = JsonToObject("src/test/resources/getDepositsAndSavingsAccounts/Business/TK14", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(getDepositsAndSavingsAccountsTestCase.getRequest()),
                Get_Deposits_And_Savings_Accounts,
                header_1421(),
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        GetDepositsAndSavingsAccountsResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа

        comparator.compare(testCase, replaceDepositAccount.replaceEtalon(getDepositsAndSavingsAccountsTestCase.getResponse(), testCase, getDepositsAndSavingsAccountsTestCase.getRequest(), accountsNoUncResponse, depositNoUncResponse));

    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK15() {
        ReplaceDepositAccount replaceDepositAccount = new ReplaceDepositAccount();
        //Десериализация запроса
        GetDepositsAndSavingsAccountsTestCase getDepositsAndSavingsAccountsTestCase = JsonToObject("src/test/resources/getDepositsAndSavingsAccounts/Business/TK15", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(getDepositsAndSavingsAccountsTestCase.getRequest()),
                Get_Deposits_And_Savings_Accounts,
                header_1421(),
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        GetDepositsAndSavingsAccountsResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа

        comparator.compare(testCase, replaceDepositAccount.replaceEtalon(getDepositsAndSavingsAccountsTestCase.getResponse(), testCase, getDepositsAndSavingsAccountsTestCase.getRequest(), accountsNoUncResponse, depositNoUncResponse));

    }

    @Test
    public void GetDepositsAndSavingsAccountsPostBusinessTK16() {
        ReplaceDepositAccount replaceDepositAccount = new ReplaceDepositAccount();
        //Десериализация запроса
        GetDepositsAndSavingsAccountsTestCase getDepositsAndSavingsAccountsTestCase = JsonToObject("src/test/resources/getDepositsAndSavingsAccounts/Business/TK16", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(getDepositsAndSavingsAccountsTestCase.getRequest()),
                Get_Deposits_And_Savings_Accounts,
                header_1421(),
                OK);

        String responseAccountNoUnc = requestAPI200(AccountNoUnc);
        String responseDepositNoUnc = requestAPI200(DepositNoUnc);

        //Десериализация ответа и сообщения из файла
        DepositNoUncResponse depositNoUncResponse = JsonToObjectResponse(responseDepositNoUnc, clazzDepositsNoUnc);
        AccountsNoUncResponse accountsNoUncResponse = JsonToObjectResponse(responseAccountNoUnc, clazzAccountsNoUnc);
        GetDepositsAndSavingsAccountsResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа

        comparator.compare(testCase, replaceDepositAccount.replaceEtalon(getDepositsAndSavingsAccountsTestCase.getResponse(), testCase, getDepositsAndSavingsAccountsTestCase.getRequest(), accountsNoUncResponse, depositNoUncResponse));

    }
}
