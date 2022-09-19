package vtb.mmokrousov.CreateContract;

import mmokrousov.ApiHelper.URL;
import mmokrousov.Comparator.CreateContractComparator;
import mmokrousov.Comparator.IComparator;
import mmokrousov.Model.CreateContract.CreateContractTestCase;
import mmokrousov.Model.CreateContract.Response.CreateContractResponse;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.UUID;

import static mmokrousov.ApiHelper.Constants.*;
import static mmokrousov.ApiHelper.Post.header_1420;
import static mmokrousov.ApiHelper.Post.requestAPI;
import static mmokrousov.Processor.Deserialization.DeserializationBase.JsonToObject;
import static mmokrousov.Processor.Deserialization.DeserializationBase.JsonToObjectResponse;
import static mmokrousov.Processor.Serialization.JsonGenerator.ObjectToJsonString;

public class CreateContractMethodsManualDebugging {
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

    @Test
    public void CreateContractTK14() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK14", clazz);

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
    public void CreateContractTK15() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK15", clazz);

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
    public void CreateContractTK16() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK16", clazz);

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
    public void CreateContractTK17() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK17", clazz);

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
    public void CreateContractTK18() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK18", clazz);

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
    public void CreateContractTK19() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);

        //Десериализация запроса
        CreateContractTestCase createContractTestCase = JsonToObject("src/test/resources/CreateContract/TK19", clazz);

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
