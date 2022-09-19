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

public class CheckBlackListManualDebugging {

    private final IComparator<CheckBlackListResponse> comparator = new CheckBlackListComparator();
    private final Class<CheckBlackListTestCase> clazz = CheckBlackListTestCase.class;
    private final Class<CheckBlackListResponse> clazzLow = CheckBlackListResponse.class;

    @Test
    public void CheckBlackListTK1() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK1", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("FirstBLAllow" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK2() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK2", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("FirstBLDeny" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK3() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK3", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("FirstBLArbDn" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK4() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK4", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("FirstBLArbAl" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK5() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK5", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("FirstBLArbOR" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK6() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK6", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("FirstBLArbIW" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK7() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK7", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("FirstBLArbFR" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK8() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK8", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420("FirstBLArbAH" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK9() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK9", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420_validation("x-epa-sub", x_epa_sub,
                        "x-epa-ctxi", x_epa_ctxi,
                        "x-epa-ip", x_epa_ip,
                        "x-session-id", x_session_id,
                        "x-epa-channel", x_epa_channel),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK10() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK10", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420_validation("x-epa-jti", x_epa_jti,
                        "x-epa-ctxi", x_epa_ctxi,
                        "x-epa-ip", x_epa_ip,
                        "x-session-id", x_session_id,
                        "x-epa-channel", x_epa_channel),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK11() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK11", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420_validation("x-epa-jti", x_epa_jti,
                        "x-epa-sub", x_epa_sub,
                        "x-epa-ip", x_epa_ip,
                        "x-session-id", x_session_id,
                        "x-epa-channel", x_epa_channel),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK12() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK12", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420_validation("x-epa-jti", x_epa_jti,
                        "x-epa-sub", x_epa_sub,
                        "x-epa-ctxi", x_epa_ctxi,
                        "x-session-id", x_session_id,
                        "x-epa-channel", x_epa_channel),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK13() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK13", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420_validation("x-epa-jti", x_epa_jti,
                        "x-epa-sub", x_epa_sub,
                        "x-epa-ctxi", x_epa_ctxi,
                        "x-epa-ip", x_epa_ip,
                        "x-epa-channel", x_epa_channel),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK14() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK14", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420_validation("x-epa-jti", x_epa_jti,
                        "x-epa-sub", x_epa_sub,
                        "x-epa-ctxi", x_epa_ctxi,
                        "x-epa-ip", x_epa_ip,
                        "x-session-id", x_session_id),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK15() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK15", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420_validation_value("x-epa-jti", symbolIs256,
                        "x-epa-sub", x_epa_sub,
                        "x-epa-ctxi", x_epa_ctxi,
                        "x-epa-ip", x_epa_ip,
                        "x-session-id", x_session_id,
                        "x-epa-channel", x_epa_channel),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK16() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK16", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420_validation_value("x-epa-jti", x_epa_jti,
                        "x-epa-sub", symbolIs256,
                        "x-epa-ctxi", x_epa_ctxi,
                        "x-epa-ip", x_epa_ip,
                        "x-session-id", x_session_id,
                        "x-epa-channel", x_epa_channel),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK17() {


        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK17", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420_validation_value("x-epa-jti", x_epa_jti,
                        "x-epa-sub", x_epa_sub,
                        "x-epa-ctxi", symbolIs256,
                        "x-epa-ip", x_epa_ip,
                        "x-session-id", x_session_id,
                        "x-epa-channel", x_epa_channel),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK18() {


        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK18", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420_validation_value("x-epa-jti", x_epa_jti,
                        "x-epa-sub", x_epa_sub,
                        "x-epa-ctxi", x_epa_ctxi,
                        "x-epa-ip", symbolIs256,
                        "x-session-id", x_session_id,
                        "x-epa-channel", x_epa_channel),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK19() {


        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK19", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420_validation_value("x-epa-jti", x_epa_jti,
                        "x-epa-sub", x_epa_sub,
                        "x-epa-ctxi", x_epa_ctxi,
                        "x-epa-ip", x_epa_ip,
                        "x-session-id", symbolIs51,
                        "x-epa-channel", x_epa_channel),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckBlackListResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkBlackListTestCase.getResponse());
    }

    @Test
    public void CheckBlackListTK20() {

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK20", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420_validation_value("x-epa-jti", x_epa_jti,
                        "x-epa-sub", x_epa_sub,
                        "x-epa-ctxi", x_epa_ctxi,
                        "x-epa-ip", x_epa_ip,
                        "x-session-id", x_session_id,
                        "x-epa-channel", symbolIs256),
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

        //Десериализация запроса
        CheckBlackListTestCase checkBlackListTestCase = JsonToObject("src/test/resources/CheckBlackList/TK24", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(checkBlackListTestCase.getRequest()),
                CheckBlacklist,
                header_1420_validation_value("x-epa-jti", "invalid_jti",
                        "x-epa-sub", x_epa_sub,
                        "x-epa-ctxi", x_epa_ctxi,
                        "x-epa-ip", x_epa_ip,
                        "x-session-id", x_session_id,
                        "x-epa-channel", x_epa_channel),
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
                header_1420("FirstBRPnCS" + x_session_id),
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
                header_1420("FirstFdnPnCS" + x_session_id),
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
                header_1420("FirstMNAlPnCS" + x_session_id),
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
                header_1420("FirstRtTtPnCS" + x_session_id),
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
                header_1420("FirstISEPnCS" + x_session_id),
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
                header_1420("FirstSUPnCS" + x_session_id),
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
                header_1420("FirstUdPf" + x_session_id),
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
                header_1420("FirstFdnPf" + x_session_id),
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
                header_1420("FirstNFPf" + x_session_id),
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
                header_1420("FirstCNFIMDMPf" + x_session_id),
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
                header_1420("FirstNFEmpC" + x_session_id),
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
                header_1420("FirstRTEmpC" + x_session_id),
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
                header_1420("FirstISEEmpC" + x_session_id),
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
