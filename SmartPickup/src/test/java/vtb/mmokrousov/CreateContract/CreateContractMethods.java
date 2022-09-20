package vtb.mmokrousov.CreateContract;

import mmokrousov.ApiHelper.URL;
import mmokrousov.Comparator.CreateContractComparator;
import mmokrousov.Comparator.IComparator;
import mmokrousov.Model.CreateContract.CreateContractTestCase;
import mmokrousov.Model.CreateContract.Response.CreateContractResponse;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.UUID;

import static mmokrousov.ApiHelper.Constants.*;
import static mmokrousov.ApiHelper.Post.*;
import static mmokrousov.Processor.Deserialization.DeserializationBase.JsonToObject;
import static mmokrousov.Processor.Deserialization.DeserializationBase.JsonToObjectResponse;
import static mmokrousov.Processor.Serialization.JsonGenerator.ObjectToJsonString;

public class CreateContractMethods {
    private IComparator comparator = new CreateContractComparator();
    private final Class<CreateContractTestCase> clazz = CreateContractTestCase.class;
    private final Class<CreateContractResponse> clazzLow = CreateContractResponse.class;


    //Клиент 20209815
    @Test
    public void CreateContractTK1() {

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK1", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(createContractTestCase.getRequest()),
                URL.CreateContract,
                header_1420(),
                OK);

        //Десериализация ответа и сообщения из файла
        CreateContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, createContractTestCase.getResponse());
    }

    @Test
    public void CreateContractTK2() {

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK2", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(createContractTestCase.getRequest()),
                URL.CreateContract,
                header_1420(),
                OK);

        //Десериализация ответа и сообщения из файла
        CreateContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, createContractTestCase.getResponse());
    }

    @Test
    public void CreateContractTK3() {

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK3", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(createContractTestCase.getRequest()),
                URL.CreateContract,
                header_1420(),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CreateContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, createContractTestCase.getResponse());
    }

    @Test
    public void CreateContractTK4() {

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK4", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(createContractTestCase.getRequest()),
                URL.CreateContract,
                header_1420(),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CreateContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, createContractTestCase.getResponse());
    }

    @Test
    public void CreateContractTK5() {

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK5", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(createContractTestCase.getRequest()),
                URL.CreateContract,
                header_1420(),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CreateContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, createContractTestCase.getResponse());
    }

    @Test
    public void CreateContractTK6() {

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK6", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(createContractTestCase.getRequest()),
                URL.CreateContract,
                header_1420(),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CreateContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, createContractTestCase.getResponse());
    }

    @Test
    public void CreateContractTK7() {

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK7", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(createContractTestCase.getRequest()),
                URL.CreateContract,
                header_1420(),
                OK);

        //Десериализация ответа и сообщения из файла
        CreateContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, createContractTestCase.getResponse());
    }

    @Test
    public void CreateContractTK8() {

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK8", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(createContractTestCase.getRequest()),
                URL.CreateContract,
                header_1420(),
                OK);

        //Десериализация ответа и сообщения из файла
        CreateContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, createContractTestCase.getResponse());
    }

    @Test
    public void CreateContractTK9() {

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK9", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(createContractTestCase.getRequest()),
                URL.CreateContract,
                header_1420(),
                OK);

        //Десериализация ответа и сообщения из файла
        CreateContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, createContractTestCase.getResponse());
    }

    @Test
    public void CreateContractTK10() {

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK10", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(createContractTestCase.getRequest()),
                URL.CreateContract,
                header_1420(),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CreateContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, createContractTestCase.getResponse());
    }

    @Test
    public void CreateContractTK11() {

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK11", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(createContractTestCase.getRequest()),
                URL.CreateContract,
                header_1420(),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CreateContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, createContractTestCase.getResponse());
    }

    @Test
    public void CreateContractTK12() {

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK12", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(createContractTestCase.getRequest()),
                URL.CreateContract,
                header_1420(),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CreateContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, createContractTestCase.getResponse());
    }

    @Test
    public void CreateContractTK13() {

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK13", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(createContractTestCase.getRequest()),
                URL.CreateContract,
                header_1420(),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CreateContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, createContractTestCase.getResponse());
    }

    @DataProvider(name = "ValidHeader")
    public static Object[][] CreateContractValidHeader() {
        return new Object[][] {
                {"src/test/resources/CreateContract/TK14", "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CreateContract/TK15", "x-epa-jti", x_epa_jti, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CreateContract/TK16", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CreateContract/TK17", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi" , x_epa_ctxi, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CreateContract/TK18", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi" , x_epa_ctxi, "x-epa-ip", x_epa_ip, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CreateContract/TK19", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi" , x_epa_ctxi, "x-epa-ip", x_epa_ip, "x-session-id", x_session_id}};
    }

    @Test(dataProvider = "ValidHeader")
    public void CreateContractTK14(String filePath,
                                  String header1, String value1,
                                  String header2, String value2,
                                  String header3, String value3,
                                  String header4, String value4,
                                  String header5, String value5) {

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject(filePath, clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(createContractTestCase.getRequest()),
                URL.CreateContract,
                header_1420_validation(header1, value1,
                        header2, value2,
                        header3, value3,
                        header4, value4,
                        header5, value5),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CreateContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, createContractTestCase.getResponse());
    }

    @DataProvider(name = "ValidHeader_2")
    public static Object[][] CreateContractValidHeader_2() {
        return new Object[][] {
                {"src/test/resources/CreateContract/TK20", "x-epa-jti", symbolIs256, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CreateContract/TK21", "x-epa-jti", x_epa_jti, "x-epa-sub", symbolIs256, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CreateContract/TK22", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", symbolIs256, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CreateContract/TK23", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , symbolIs256, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CreateContract/TK24", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", symbolIs51, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CreateContract/TK24_1", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "X-User-Session-ID", symbolIs51, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CreateContract/TK25", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", symbolIs256}};
    }

    @Test(dataProvider = "ValidHeader_2")
    public void CreateContractTK15(String filePath,
                                   String header1, String value1,
                                   String header2, String value2,
                                   String header3, String value3,
                                   String header4, String value4,
                                   String header5, String value5,
                                   String header6, String value6) {

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject(filePath, clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(createContractTestCase.getRequest()),
                URL.CreateContract,
                header_1420_validation_value(header1, value1,
                        header2, value2,
                        header3, value3,
                        header4, value4,
                        header5, value5,
                        header6, value6),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CreateContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, createContractTestCase.getResponse());
    }

    @Test
    public void CreateContractTK20() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", symbolIs256);
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK20", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(createContractTestCase.getRequest()),
                URL.CreateContract,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CreateContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, createContractTestCase.getResponse());
    }

    @Test
    public void CreateContractTK21() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", symbolIs256);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK21", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(createContractTestCase.getRequest()),
                URL.CreateContract,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CreateContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, createContractTestCase.getResponse());
    }

    @Test
    public void CreateContractTK22() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", symbolIs256);
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK22", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(createContractTestCase.getRequest()),
                URL.CreateContract,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CreateContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, createContractTestCase.getResponse());
    }

    @Test
    public void CreateContractTK23() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", symbolIs256);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK23", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(createContractTestCase.getRequest()),
                URL.CreateContract,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CreateContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, createContractTestCase.getResponse());
    }

    @Test
    public void CreateContractTK24() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", symbolIs256);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK24", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(createContractTestCase.getRequest()),
                URL.CreateContract,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CreateContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, createContractTestCase.getResponse());
    }

    @Test
    public void CreateContractTK25() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", symbolIs51);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK25", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(createContractTestCase.getRequest()),
                URL.CreateContract,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CreateContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, createContractTestCase.getResponse());
    }

    @Test
    public void CreateContractTK26() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", symbolIs256);

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK26", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(createContractTestCase.getRequest()),
                URL.CreateContract,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CreateContractResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, createContractTestCase.getResponse());
    }
}
