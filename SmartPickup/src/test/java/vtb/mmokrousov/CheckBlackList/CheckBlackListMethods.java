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

    @DataProvider(name = "ValidHeader")
    public static Object[][] CheckBlackListValidHeader() {
        return new Object[][] {
                {"src/test/resources/CheckBlackList/TK9", "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CheckBlackList/TK10", "x-epa-jti", x_epa_jti, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CheckBlackList/TK11", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CheckBlackList/TK12", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi" , x_epa_ctxi, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CheckBlackList/TK13", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi" , x_epa_ctxi, "x-epa-ip", x_epa_ip, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CheckBlackList/TK14", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi" , x_epa_ctxi, "x-epa-ip", x_epa_ip, "x-session-id", x_session_id}};
    }

    @Test(dataProvider = "ValidHeader")
    public void CheckBlackListTK6(String filePath, String header1, String value1,
                               String header2, String value2,
                               String header3, String value3,
                               String header4, String value4,
                               String header5, String value5) {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject(filePath, clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420_validation(header1, value1,
                        header2, value2,
                        header3, value3,
                        header4, value4,
                        header5, value5),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @DataProvider(name = "ValidHeader_2")
    public static Object[][] CheckBlackListValidHeader_2() {
        return new Object[][] {
                {"src/test/resources/CheckBlackList/TK15", "x-epa-jti", symbolIs256, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CheckBlackList/TK16", "x-epa-jti", x_epa_jti, "x-epa-sub", symbolIs256, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CheckBlackList/TK17", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", symbolIs256, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CheckBlackList/TK18", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , symbolIs256, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CheckBlackList/TK19", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", symbolIs51, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CheckBlackList/TK19_1", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "X-User-Session-ID", symbolIs51, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CheckBlackList/TK20", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", symbolIs256}};
    }

    @Test(dataProvider = "ValidHeader_2")
    public void CheckBlackListTK7(String filePath, String header1, String value1,
                                  String header2, String value2,
                                  String header3, String value3,
                                  String header4, String value4,
                                  String header5, String value5,
                                  String header6, String value6) {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject(filePath, clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420_validation_value(header1, value1,
                        header2, value2,
                        header3, value3,
                        header4, value4,
                        header5, value5,
                        header6, value6),
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

    @DataProvider(name = "SystemsUnavailableSession")
    public static Object[][] CheckBlackListSystemsUnavailableSession() {
        return new Object[][] {
                {"src/test/resources/CheckBlackList/TK26", "FirstBRqtSn" + x_session_id},
                {"src/test/resources/CheckBlackList/TK27", "FirstUndSn" + x_session_id},
                {"src/test/resources/CheckBlackList/TK28", "FirstFbdSn" + x_session_id},
                {"src/test/resources/CheckBlackList/TK29", "FirstNFdSn" + x_session_id},
                {"src/test/resources/CheckBlackList/TK30", "FirstISESn" + x_session_id}};
    }

    @Test(dataProvider = "SystemsUnavailableSession")
    public void CheckBlackListTK26(String filePath, String session) {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject(filePath, clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420(session),
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
