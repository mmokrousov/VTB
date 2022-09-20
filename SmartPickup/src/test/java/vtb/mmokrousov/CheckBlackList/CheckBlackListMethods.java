package vtb.mmokrousov.CheckBlackList;

import mmokrousov.Comparator.CheckBlackListComparator;
import mmokrousov.Comparator.IComparator;
import mmokrousov.Model.CheckBlackList.CheckBlackListTestCase;
import mmokrousov.Model.CheckBlackList.Response.CheckBlackListResponse;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.UUID;

import static mmokrousov.ApiHelper.Constants.*;
import static mmokrousov.ApiHelper.Constants.ITERNAL_SERVER_ERROR;
import static mmokrousov.ApiHelper.Post.*;
import static mmokrousov.ApiHelper.URL.CheckBlacklist;
import static mmokrousov.Processor.Deserialization.DeserializationBase.JsonToObject;
import static mmokrousov.Processor.Deserialization.DeserializationBase.JsonToObjectResponse;
import static mmokrousov.Processor.Serialization.JsonGenerator.ObjectToJsonString;

public class CheckBlackListMethods {

    private final IComparator<CheckBlackListResponse> comparator = new CheckBlackListComparator();
    private final Class<CheckBlackListTestCase> clazz = CheckBlackListTestCase.class;
    private final Class<CheckBlackListResponse> clazzLow = CheckBlackListResponse.class;

    @DataProvider(name = "Success")
    public static Object[][] CheckBlackListSuccess() {
        return new Object[][] {
                {"src/test/resources/CheckBlackList/TK1", "blackListAllow"},
                {"src/test/resources/CheckBlackList/TK2", "blackListDeny"},
                {"src/test/resources/CheckBlackList/TK3", "blackListArbitrationDeny"},
                {"src/test/resources/CheckBlackList/TK4", "blackListArbitrationAllow"},
                {"src/test/resources/CheckBlackList/TK5", "blackListArbitrationON_REVIEW"},
                {"src/test/resources/CheckBlackList/TK6", "blackListArbitrationIN_WORK"},
                {"src/test/resources/CheckBlackList/TK7", "blackListArbitrationFOR_REVISION"},
                {"src/test/resources/CheckBlackList/TK8", "blackListArbitrationAPPROVAL_HEAD"}};
    }

    @Test(dataProvider = "Success")
    public void CheckBlackListTK1Success(String filePath, String session) {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject(filePath, clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420(session),
                OK);

        //Десериализация ответа
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow);
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK9test() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK9", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420_validation("x-epa-sub", x_epa_sub,
                        "x-epa-ctxi", UUID.randomUUID().toString(),
                        "x-epa-ip", x_epa_ip,
                        "x-session-id", UUID.randomUUID().toString(),
                        "x-epa-channel", x_epa_channel),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK9() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK9", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK10() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK10", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK11() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK11", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK12() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK12", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK13() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK13", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK14() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", UUID.randomUUID().toString());
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK14", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK15() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", symbolIs256);
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);


        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK15", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK16() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", x_epa_jti);
        header.put("x-epa-sub", symbolIs256);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);


        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK16", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK17() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", x_epa_jti);
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", symbolIs256);
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);


        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK17", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK18() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", x_epa_jti);
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", x_epa_ctxi);
        header.put("x-epa-ip", symbolIs256);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);


        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK18", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK19() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", x_epa_jti);
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", x_epa_ctxi);
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", symbolIs51);
        header.put("x-epa-channel", x_epa_channel);


        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK19", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK20() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", x_epa_jti);
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", x_epa_ctxi);
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", symbolIs256);


        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK20", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header,
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK21() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK21", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420(),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK22() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK22", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420(),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK23() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK23", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420(),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK24() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", "invalid-jti");
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", UUID.randomUUID().toString());
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK24", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header,
                UNATHORIZED);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK25() {

        HashMap<String, String> header = new HashMap<>();
        header.put("Authorization", "qwgdsgs");
        header.put("x-session-id", x_session_id);

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK25", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header,
                UNATHORIZED);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK26() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK26", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("FirstBRqtSn" + x_session_id),
                UNATHORIZED);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK27() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK27", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("FirstUndSn" + x_session_id),
                UNATHORIZED);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK28() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK28", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("FirstFbdSn" + x_session_id),
                UNATHORIZED);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK29() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK29", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("FirstNFdSn" + x_session_id),
                UNATHORIZED);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK30() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK30", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("FirstISESn" + x_session_id),
                UNATHORIZED);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK31() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK31", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("BadRequestPersonCS"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK32() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK32", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("ForbiddenPersonCS"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK33() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK33", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("MethodNotAllowedPersonCS"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK34() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK34", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("RequestTimeoutPersonCS"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK35() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK35", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("InternalServerErrorPersonCS"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK36() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK36", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("ServiceUnavailablePersonCS"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK37() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK37", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("UnauthorizedPortfolio"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK38() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK38", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("ForbiddenPortfolio"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK39() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK39", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("NotFoundPortfolio"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK40() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK40", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("ClientNotFoundInMDMPortfolio"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK41() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK41", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("NotFoundEmployeeCard"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK42() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK42", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("RequestTimeoutEmployeeCard"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK43() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK43", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("InternalServerErrorEmployeeCard"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK44() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK44", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("ClientNotFoundPersonCrossref"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK45() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK45", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("BadRequestPersonCrossref"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK46() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK46", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("ForbiddenPersonCrossref"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK47() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK47", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("MethodNotAllowedPersonCrossref"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK48() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK48", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("RequestTimeoutPersonCrossref"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK49() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK49", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("ServiceUnavailablePersonCrossref"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK50() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK50", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("blackListArbitrationValidation"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK51() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK51", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("blackListArbitrationUnsupportedMediaType"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK52() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK52", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("blackListArbitrationInternalServerError"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK53() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK53", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("blackListArbitrationBadGateway"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK54() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK54", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("blackListArbitrationGatewayTimeout"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

}
