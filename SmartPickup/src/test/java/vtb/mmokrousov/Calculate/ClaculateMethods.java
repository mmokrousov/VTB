package vtb.mmokrousov.Calculate;

import mmokrousov.Comparator.CalculateComparator;
import mmokrousov.Comparator.IComparator;
import mmokrousov.Model.Calculate.CalculateTestCase;
import mmokrousov.Model.Calculate.Response.CalculateResponse;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.UUID;

import static mmokrousov.ApiHelper.Constants.*;
import static mmokrousov.ApiHelper.Constants.BAD_REQUEST;
import static mmokrousov.ApiHelper.Post.*;
import static mmokrousov.ApiHelper.URL.Calculate;
import static mmokrousov.Processor.Deserialization.DeserializationBase.JsonToObject;
import static mmokrousov.Processor.Deserialization.DeserializationBase.JsonToObjectResponse;
import static mmokrousov.Processor.Serialization.JsonGenerator.ObjectToJsonString;
import static org.apache.http.HttpStatus.SC_INTERNAL_SERVER_ERROR;


public class ClaculateMethods {
    public IComparator comparator = new CalculateComparator();
    private final Class<CalculateTestCase> clazz = CalculateTestCase.class;
    private final Class<CalculateResponse> clazzLow = CalculateResponse.class;

    @Test
    public void CalculateTK1() {

        //Десериализация запроса
        CalculateTestCase calculateTestCase = JsonToObject("src/test/resources/Calculate/TK1", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateTestCase.getRequest()),
                Calculate,
                header_1420(),
                OK);

        //Десериализация ответа и сообщения из файла
        CalculateResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, calculateTestCase.getResponse());
    }

    @Test
    public void CalculateTK2() {

        //Десериализация запроса
        CalculateTestCase calculateTestCase = JsonToObject("src/test/resources/Calculate/TK2", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateTestCase.getRequest()),
                Calculate,
                header_1420(),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CalculateResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, calculateTestCase.getResponse());
    }

    @Test
    public void CalculateTK3() {

        //Десериализация запроса
        CalculateTestCase calculateTestCase = JsonToObject("src/test/resources/Calculate/TK3", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateTestCase.getRequest()),
                Calculate,
                header_1420(),
                OK);

        //Десериализация ответа и сообщения из файла
        CalculateResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, calculateTestCase.getResponse());
    }

    @Test
    public void CalculateTK4() {

        //Десериализация запроса
        CalculateTestCase calculateTestCase = JsonToObject("src/test/resources/Calculate/TK4", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateTestCase.getRequest()),
                Calculate,
                header_1420(),
                OK);

        //Десериализация ответа и сообщения из файла
        CalculateResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, calculateTestCase.getResponse());
    }

    @Test
    public void CalculateTK5() {

        //Десериализация запроса
        CalculateTestCase calculateTestCase = JsonToObject("src/test/resources/Calculate/TK5", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateTestCase.getRequest()),
                Calculate,
                header_1420(),
                SC_INTERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CalculateResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, calculateTestCase.getResponse());
    }

    @DataProvider(name = "ValidHeader")
    public static Object[][] CalculateValidHeader() {
        return new Object[][] {
                {"src/test/resources/Calculate/TK6", "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/Calculate/TK7", "x-epa-jti", x_epa_jti, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/Calculate/TK8", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/Calculate/TK9", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi" , x_epa_ctxi, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/Calculate/TK10", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi" , x_epa_ctxi, "x-epa-ip", x_epa_ip, "x-epa-channel", x_epa_channel},
                {"src/test/resources/Calculate/TK11", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi" , x_epa_ctxi, "x-epa-ip", x_epa_ip, "x-session-id", x_session_id}};
    }

    @Test(dataProvider = "ValidHeader")
    public void CalculateTK6(String filePath, String header1, String value1,
                               String header2, String value2,
                               String header3, String value3,
                               String header4, String value4,
                               String header5, String value5) {

        //Десериализация запроса
        CalculateTestCase calculateTestCase = JsonToObject(filePath, clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateTestCase.getRequest()),
                Calculate,
                header_1420_validation(header1, value1,
                        header2, value2,
                        header3, value3,
                        header4, value4,
                        header5, value5),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CalculateResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, calculateTestCase.getResponse());
    }


    @Test
    public void CalculateTK12() {


        //Десериализация запроса
        CalculateTestCase calculateTestCase = JsonToObject("src/test/resources/Calculate/TK12", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateTestCase.getRequest()),
                Calculate,
                header_1420(),
                OK);

        //Десериализация ответа и сообщения из файла
        CalculateResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, calculateTestCase.getResponse());
    }

    //Прописать верные хедеры
    @Test
    public void CalculateTK13() {


        //Десериализация запроса
        CalculateTestCase calculateTestCase = JsonToObject("src/test/resources/Calculate/TK13", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateTestCase.getRequest()),
                Calculate,
                header_1420(),
                OK);

        //Десериализация ответа и сообщения из файла
        CalculateResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, calculateTestCase.getResponse());
    }

    @Test
    public void CalculateTK14() {


        //Десериализация запроса
        CalculateTestCase calculateTestCase = JsonToObject("src/test/resources/Calculate/TK14", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateTestCase.getRequest()),
                Calculate,
                header_1420(),
                OK);

        //Десериализация ответа и сообщения из файла
        CalculateResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, calculateTestCase.getResponse());
    }

    @DataProvider(name = "ValidHeader_2")
    public static Object[][] CalculateValidHeader_2() {
        return new Object[][] {
                {"src/test/resources/Calculate/TK15", "x-epa-jti", symbolIs256, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/Calculate/TK16", "x-epa-jti", x_epa_jti, "x-epa-sub", symbolIs256, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/Calculate/TK17", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", symbolIs256, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/Calculate/TK18", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , symbolIs256, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/Calculate/TK19", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", symbolIs51, "x-epa-channel", x_epa_channel},
                {"src/test/resources/Calculate/TK19_1", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "X-User-Session-ID", symbolIs51, "x-epa-channel", x_epa_channel},
                {"src/test/resources/Calculate/TK20", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", symbolIs256}};
    }

    @Test(dataProvider = "ValidHeader_2")
    public void CalculateTK7(String filePath, String header1, String value1,
                               String header2, String value2,
                               String header3, String value3,
                               String header4, String value4,
                               String header5, String value5,
                                String header6, String value6) {

        //Десериализация запроса
        CalculateTestCase calculateTestCase = JsonToObject(filePath, clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateTestCase.getRequest()),
                Calculate,
                header_1420_validation_value(header1, value1,
                        header2, value2,
                        header3, value3,
                        header4, value4,
                        header5, value5,
                        header6, value6),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CalculateResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, calculateTestCase.getResponse());
    }

    @Test
    public void CalculateTK15() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", symbolIs256);
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CalculateTestCase calculateTestCase = JsonToObject("src/test/resources/Calculate/TK15", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateTestCase.getRequest()),
                Calculate,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CalculateResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, calculateTestCase.getResponse());
    }

    @Test
    public void CalculateTK16() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", symbolIs256);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CalculateTestCase calculateTestCase = JsonToObject("src/test/resources/Calculate/TK16", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateTestCase.getRequest()),
                Calculate,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CalculateResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, calculateTestCase.getResponse());
    }

    @Test
    public void CalculateTK17() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", symbolIs256);
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CalculateTestCase calculateTestCase = JsonToObject("src/test/resources/Calculate/TK17", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateTestCase.getRequest()),
                Calculate,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CalculateResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, calculateTestCase.getResponse());
    }

    @Test
    public void CalculateTK18() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", symbolIs256);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CalculateTestCase calculateTestCase = JsonToObject("src/test/resources/Calculate/TK18", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateTestCase.getRequest()),
                Calculate,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CalculateResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, calculateTestCase.getResponse());
    }

    @Test
    public void CalculateTK19() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", symbolIs51);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CalculateTestCase calculateTestCase = JsonToObject("src/test/resources/Calculate/TK19", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateTestCase.getRequest()),
                Calculate,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CalculateResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, calculateTestCase.getResponse());
    }

    @Test
    public void CalculateTK20() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", symbolIs256);

        //Десериализация запроса
        CalculateTestCase calculateTestCase = JsonToObject("src/test/resources/Calculate/TK20", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateTestCase.getRequest()),
                Calculate,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CalculateResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, calculateTestCase.getResponse());
    }

    @Test
    public void CalculateTK21() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", symbolIs256);

        //Десериализация запроса
        CalculateTestCase calculateTestCase = JsonToObject("src/test/resources/Calculate/TK21", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateTestCase.getRequest()),
                Calculate,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CalculateResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, calculateTestCase.getResponse());
    }

    @Test
    public void CalculateTK22() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", symbolIs256);

        //Десериализация запроса
        CalculateTestCase calculateTestCase = JsonToObject("src/test/resources/Calculate/TK22", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(calculateTestCase.getRequest()),
                Calculate,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CalculateResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, calculateTestCase.getResponse());
    }
}
