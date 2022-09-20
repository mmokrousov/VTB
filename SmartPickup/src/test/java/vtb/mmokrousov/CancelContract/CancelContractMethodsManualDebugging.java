package vtb.mmokrousov.CancelContract;

import mmokrousov.Comparator.CancelContractComparator;
import mmokrousov.Comparator.IComparator;
import mmokrousov.Model.CancelContract.CancelContractTestCase;
import mmokrousov.Model.CancelContract.Response.CancelContractResponse;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.UUID;

import static mmokrousov.ApiHelper.Constants.*;
import static mmokrousov.ApiHelper.Post.header_1420;
import static mmokrousov.ApiHelper.Post.requestAPI;
import static mmokrousov.ApiHelper.URL.*;
import static mmokrousov.Processor.Deserialization.DeserializationBase.JsonToObject;
import static mmokrousov.Processor.Deserialization.DeserializationBase.JsonToObjectResponse;

public class CancelContractMethodsManualDebugging {
    private IComparator comparator = new CancelContractComparator();
    private final Class<CancelContractTestCase> clazz = CancelContractTestCase.class;
    private final Class<CancelContractResponse> clazzLow = CancelContractResponse.class;

    //Разобраться, почему клиент не совпадает по сессии
    @Test
    public void CancelContractTK1() {

        HashMap<String, String> header = new HashMap<>();
        //header.put("Authorization", Authorization);
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", "c738c0bb-43bb-4b3a-bbc7-f1b5f0c92c81");
        header.put("x-epa-channel", x_epa_channel);
        //Десериализация запроса
        CancelContractTestCase cancelContractTestCase = JsonToObject("src/test/resources/CancelContract/TK1", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(CancelContract,
                header,
                ITERNAL_SERVER_ERROR,
                cancelContractTestCase.getRequest().getContractNumber());

        //Десериализация ответа и сообщения из файла
        CancelContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, cancelContractTestCase.getResponse());
    }

    @Test
    public void CancelContractTK2() {

        //Десериализация запроса
        CancelContractTestCase cancelContractTestCase = JsonToObject("src/test/resources/CancelContract/TK2", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(CancelContract,
                header_1420(),
                ITERNAL_SERVER_ERROR,
                cancelContractTestCase.getRequest().getContractNumber());

        //Десериализация ответа и сообщения из файла
        CancelContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, cancelContractTestCase.getResponse());
    }

    @Test
    public void CancelContractTK3() {
        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", "414a04bd-effd-4747-a3f2-26c9c4b0a989");
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CancelContractTestCase cancelContractTestCase = JsonToObject("src/test/resources/CancelContract/TK3", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(CancelContract,
                header,
                ITERNAL_SERVER_ERROR,
                cancelContractTestCase.getRequest().getContractNumber());

        //Десериализация ответа и сообщения из файла
        CancelContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, cancelContractTestCase.getResponse());
    }

    @Test
    public void CancelContractTK4() {

        //Десериализация запроса
        CancelContractTestCase cancelContractTestCase = JsonToObject("src/test/resources/CancelContract/TK4", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(CancelContract,
                header_1420(),
                BAD_REQUEST,
                cancelContractTestCase.getRequest().getContractNumber());

        //Десериализация ответа и сообщения из файла
        CancelContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, cancelContractTestCase.getResponse());
    }

    @Test
    public void CancelContractTK5() {

        //Десериализация запроса
        CancelContractTestCase cancelContractTestCase = JsonToObject("src/test/resources/CancelContract/TK5", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(CancelContract,
                header_1420(),
                BAD_REQUEST,
                cancelContractTestCase.getRequest().getContractNumber());

        //Десериализация ответа и сообщения из файла
        CancelContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, cancelContractTestCase.getResponse());
    }

    @Test
    public void CancelContractTK6() {
        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CancelContractTestCase cancelContractTestCase = JsonToObject("src/test/resources/CancelContract/TK6", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(CancelContract,
                header,
                BAD_REQUEST,
                cancelContractTestCase.getRequest().getContractNumber());

        //Десериализация ответа и сообщения из файла
        CancelContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, cancelContractTestCase.getResponse());
    }

    @Test
    public void CancelContractTK7() {
        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CancelContractTestCase cancelContractTestCase = JsonToObject("src/test/resources/CancelContract/TK7", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(CancelContract,
                header,
                BAD_REQUEST,
                cancelContractTestCase.getRequest().getContractNumber());

        //Десериализация ответа и сообщения из файла
        CancelContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, cancelContractTestCase.getResponse());
    }

    @Test
    public void CancelContractTK8() {
        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CancelContractTestCase cancelContractTestCase = JsonToObject("src/test/resources/CancelContract/TK8", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(CancelContract,
                header,
                BAD_REQUEST,
                cancelContractTestCase.getRequest().getContractNumber());

        //Десериализация ответа и сообщения из файла
        CancelContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, cancelContractTestCase.getResponse());
    }

    @Test
    public void CancelContractTK9() {
        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CancelContractTestCase cancelContractTestCase = JsonToObject("src/test/resources/CancelContract/TK9", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(CancelContract,
                header,
                BAD_REQUEST,
                cancelContractTestCase.getRequest().getContractNumber());

        //Десериализация ответа и сообщения из файла
        CancelContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, cancelContractTestCase.getResponse());
    }

    @Test
    public void CancelContractTK10() {
        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CancelContractTestCase cancelContractTestCase = JsonToObject("src/test/resources/CancelContract/TK10", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(CancelContract,
                header,
                BAD_REQUEST,
                cancelContractTestCase.getRequest().getContractNumber());

        //Десериализация ответа и сообщения из файла
        CancelContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, cancelContractTestCase.getResponse());
    }

    @Test
    public void CancelContractTK11() {
        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);

        //Десериализация запроса
        CancelContractTestCase cancelContractTestCase = JsonToObject("src/test/resources/CancelContract/TK11", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(CancelContract,
                header,
                BAD_REQUEST,
                cancelContractTestCase.getRequest().getContractNumber());

        //Десериализация ответа и сообщения из файла
        CancelContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, cancelContractTestCase.getResponse());
    }

    @Test
    public void CancelContractTK12() {
        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", symbolIs256);
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);

        //Десериализация запроса
        CancelContractTestCase cancelContractTestCase = JsonToObject("src/test/resources/CancelContract/TK12", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(CancelContract,
                header,
                BAD_REQUEST,
                cancelContractTestCase.getRequest().getContractNumber());

        //Десериализация ответа и сообщения из файла
        CancelContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, cancelContractTestCase.getResponse());
    }

    @Test
    public void CancelContractTK13() {
        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", symbolIs256);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);

        //Десериализация запроса
        CancelContractTestCase cancelContractTestCase = JsonToObject("src/test/resources/CancelContract/TK13", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(CancelContract,
                header,
                BAD_REQUEST,
                cancelContractTestCase.getRequest().getContractNumber());

        //Десериализация ответа и сообщения из файла
        CancelContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, cancelContractTestCase.getResponse());
    }

    @Test
    public void CancelContractTK14() {
        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", symbolIs256);
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);

        //Десериализация запроса
        CancelContractTestCase cancelContractTestCase = JsonToObject("src/test/resources/CancelContract/TK14", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(CancelContract,
                header,
                BAD_REQUEST,
                cancelContractTestCase.getRequest().getContractNumber());

        //Десериализация ответа и сообщения из файла
        CancelContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, cancelContractTestCase.getResponse());
    }

    @Test
    public void CancelContractTK15() {
        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", symbolIs256);
        header.put("x-session-id", x_session_id);

        //Десериализация запроса
        CancelContractTestCase cancelContractTestCase = JsonToObject("src/test/resources/CancelContract/TK15", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(CancelContract,
                header,
                BAD_REQUEST,
                cancelContractTestCase.getRequest().getContractNumber());

        //Десериализация ответа и сообщения из файла
        CancelContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, cancelContractTestCase.getResponse());
    }

    @Test
    public void CancelContractTK16() {
        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", symbolIs51);

        //Десериализация запроса
        CancelContractTestCase cancelContractTestCase = JsonToObject("src/test/resources/CancelContract/TK16", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(CancelContract,
                header,
                BAD_REQUEST,
                cancelContractTestCase.getRequest().getContractNumber());

        //Десериализация ответа и сообщения из файла
        CancelContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, cancelContractTestCase.getResponse());
    }
}
