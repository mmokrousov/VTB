package vtb.mmokrousov.CancelContract;

import mmokrousov.Comparator.CancelContractComparator;
import mmokrousov.Comparator.IComparator;
import mmokrousov.Model.CancelContract.CancelContractTestCase;
import mmokrousov.Model.CancelContract.Response.CancelContractResponse;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.UUID;

import static mmokrousov.ApiHelper.Constants.*;
import static mmokrousov.ApiHelper.Constants.BAD_REQUEST;
import static mmokrousov.ApiHelper.Post.*;
import static mmokrousov.ApiHelper.URL.CancelContract;
import static mmokrousov.Processor.Deserialization.DeserializationBase.JsonToObject;
import static mmokrousov.Processor.Deserialization.DeserializationBase.JsonToObjectResponse;

public class CancelContractMethods {
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

    @DataProvider(name = "ValidHeader")
    public static Object[][] CancelContractValidHeader() {
        return new Object[][] {
                {"src/test/resources/CancelContract/TK6", "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CancelContract/TK7", "x-epa-jti", x_epa_jti, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CancelContract/TK8", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CancelContract/TK9", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi" , x_epa_ctxi, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CancelContract/TK10", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi" , x_epa_ctxi, "x-epa-ip", x_epa_ip, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CancelContract/TK11", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi" , x_epa_ctxi, "x-epa-ip", x_epa_ip, "x-session-id", x_session_id}};
    }

    @Test(dataProvider = "ValidHeader")
    public void CancelContractTK6(String filePath, String header1, String value1,
                             String header2, String value2,
                             String header3, String value3,
                             String header4, String value4,
                             String header5, String value5) {

        //Десериализация запроса
        CancelContractTestCase cancelContractTestCase = JsonToObject(filePath, clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(CancelContract,
                header_1420_validation(header1, value1,
                        header2, value2,
                        header3, value3,
                        header4, value4,
                        header5, value5),
                BAD_REQUEST,
                cancelContractTestCase.getRequest().getContractNumber());

        //Десериализация ответа и сообщения из файла
        CancelContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, cancelContractTestCase.getResponse());
    }

    @DataProvider(name = "ValidHeader_2")
    public static Object[][] CancelContractValidHeader_2() {
        return new Object[][] {
                {"src/test/resources/CancelContract/TK12", "x-epa-jti", symbolIs256, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CancelContract/TK13", "x-epa-jti", x_epa_jti, "x-epa-sub", symbolIs256, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CancelContract/TK14", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", symbolIs256, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CancelContract/TK15", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , symbolIs256, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CancelContract/TK16", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", symbolIs51, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CancelContract/TK16_1", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "X-User-Session-ID", symbolIs51, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CancelContract/TK17", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", symbolIs256}};
    }

    @Test(dataProvider = "ValidHeader_2")
    public void CancelContractTK7(String filePath, String header1, String value1,
                                  String header2, String value2,
                                  String header3, String value3,
                                  String header4, String value4,
                                  String header5, String value5,
                                  String header6, String value6) {

        //Десериализация запроса
        CancelContractTestCase cancelContractTestCase = JsonToObject(filePath, clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(CancelContract,
                header_1420_validation_value(header1, value1,
                        header2, value2,
                        header3, value3,
                        header4, value4,
                        header5, value5,
                        header6, value6),
                BAD_REQUEST,
                cancelContractTestCase.getRequest().getContractNumber());

        //Десериализация ответа и сообщения из файла
        CancelContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, cancelContractTestCase.getResponse());
    }
}
