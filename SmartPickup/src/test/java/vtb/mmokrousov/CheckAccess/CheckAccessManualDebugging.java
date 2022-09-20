package vtb.mmokrousov.CheckAccess;

import mmokrousov.ApiHelper.URL;
import mmokrousov.Comparator.CheckAccessComparator;
import mmokrousov.Comparator.CheckBlackListComparator;
import mmokrousov.Comparator.IComparator;
import mmokrousov.Model.CheckAccess.CheckAccessTestCase;
import mmokrousov.Model.CheckAccess.Response.CheckAccessResponse;
import mmokrousov.Model.CheckBlackList.CheckBlackListTestCase;
import mmokrousov.Model.CheckBlackList.Response.CheckBlackListResponse;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.UUID;

import static mmokrousov.ApiHelper.Constants.*;
import static mmokrousov.ApiHelper.Post.*;
import static mmokrousov.ApiHelper.URL.*;
import static mmokrousov.Processor.Deserialization.DeserializationBase.JsonToObject;
import static mmokrousov.Processor.Deserialization.DeserializationBase.JsonToObjectResponse;
import static mmokrousov.Processor.Serialization.JsonGenerator.ObjectToJsonString;

public class CheckAccessManualDebugging {
    private final IComparator<CheckAccessResponse> comparator = new CheckAccessComparator();
    private final Class<CheckAccessTestCase> clazz = CheckAccessTestCase.class;
    private final Class<CheckAccessResponse> clazzLow = CheckAccessResponse.class;

    @Test
    public void CheckAccessTK1() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK1", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstPRIV" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK2() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK2", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("ThirdPRIV2" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK3() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK3", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstPRIME" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK4() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK4", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("ThirdPRIME2" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK5() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK5", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstPRIVEUR" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK6() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK6", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstPRIVUSD" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK7() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK7", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstMULTCART" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK8() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK8", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstBASIC" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK9() {

        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", x_epa_jti);
        header.put("x-epa-sub", "no_role");
        header.put("x-epa-ctxi", x_epa_ctxi);
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", "First" + x_session_id);
        header.put("x-epa-channel", x_epa_channel);

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK9", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header,
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK10() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK10", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstNCCPnCS" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK11() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK11", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstBDtTmPnCS" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK12() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK12", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstBPlcPnCS" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK13() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK13", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstLNPnCS" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK14() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK14", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstFNPnCS" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }


    @Test
    public void CheckAccessTK15() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK15", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstPDtIdPnCS" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK16() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK16", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstAdrsPnCS" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK17() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK17", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstNAlPmPnCS" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    //Разрбораться
    @Test
    public void CheckAccessTK18() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK18", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstNoPgAcRUB" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK19() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK19", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstNARUB" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK20() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK20", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstPrivNMA" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK21() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK21", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstPvMAC" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK22() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK22", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstPvNREU" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK23() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK23", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstRl38PnCS" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK24() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK24", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstRl39PnCS" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK25() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK25", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstN18YRPnCS" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK26() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK26", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstDTDPnCS" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK27() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK27", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420_validation("x-epa-sub", x_epa_sub,
                        "x-epa-ctxi", x_epa_ctxi,
                        "x-epa-ip", x_epa_ip,
                        "x-session-id", x_session_id,
                        "x-epa-channel", x_epa_channel),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK28() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK28", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420_validation("x-epa-jti", x_epa_jti,
                        "x-epa-ctxi", x_epa_ctxi,
                        "x-epa-ip", x_epa_ip,
                        "x-session-id", x_session_id,
                        "x-epa-channel", x_epa_channel),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK29() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK29", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420_validation("x-epa-jti", x_epa_jti,
                        "x-epa-sub", x_epa_sub,
                        "x-epa-ip", x_epa_ip,
                        "x-session-id", x_session_id,
                        "x-epa-channel", x_epa_channel),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK30() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK30", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420_validation("x-epa-jti", x_epa_jti,
                        "x-epa-sub", x_epa_sub,
                        "x-epa-ctxi", x_epa_ctxi,
                        "x-session-id", x_session_id,
                        "x-epa-channel", x_epa_channel),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK31() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK31", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420_validation("x-epa-jti", x_epa_jti,
                        "x-epa-sub", x_epa_sub,
                        "x-epa-ctxi", x_epa_ctxi,
                        "x-epa-ip", x_epa_ip,
                        "x-epa-channel", x_epa_channel),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK32() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK32", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420_validation("x-epa-jti", x_epa_jti,
                        "x-epa-sub", x_epa_sub,
                        "x-epa-ctxi", x_epa_ctxi,
                        "x-epa-ip", x_epa_ip,
                        "x-session-id", x_session_id),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK33() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK33", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420_validation_value("x-epa-jti", symbolIs256,
                        "x-epa-sub", x_epa_sub,
                        "x-epa-ctxi", x_epa_ctxi,
                        "x-epa-ip", x_epa_ip,
                        "x-session-id", x_session_id,
                        "x-epa-channel", x_epa_channel),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK34() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK34", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420_validation_value("x-epa-jti", x_epa_jti,
                        "x-epa-sub", symbolIs256,
                        "x-epa-ctxi", x_epa_ctxi,
                        "x-epa-ip", x_epa_ip,
                        "x-session-id", x_session_id,
                        "x-epa-channel", x_epa_channel),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK35() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK35", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420_validation_value("x-epa-jti", x_epa_jti,
                        "x-epa-sub", x_epa_sub,
                        "x-epa-ctxi", symbolIs256,
                        "x-epa-ip", x_epa_ip,
                        "x-session-id", x_session_id,
                        "x-epa-channel", x_epa_channel),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK36() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK36", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420_validation_value("x-epa-jti", x_epa_jti,
                        "x-epa-sub", x_epa_sub,
                        "x-epa-ctxi", x_epa_ctxi,
                        "x-epa-ip", symbolIs256,
                        "x-session-id", x_session_id,
                        "x-epa-channel", x_epa_channel),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK37() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK37", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420_validation_value("x-epa-jti", x_epa_jti,
                        "x-epa-sub", x_epa_sub,
                        "x-epa-ctxi", x_epa_ctxi,
                        "x-epa-ip", x_epa_ip,
                        "x-session-id", symbolIs51,
                        "x-epa-channel", x_epa_channel),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK38() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK38", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420_validation_value("x-epa-jti", x_epa_jti,
                        "x-epa-sub", x_epa_sub,
                        "x-epa-ctxi", x_epa_ctxi,
                        "x-epa-ip", x_epa_ip,
                        "x-session-id", x_session_id,
                        "x-epa-channel", symbolIs256),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK39() {

        HashMap<String, String> header = new HashMap<>();
        header.put("Authorization", Authorization);
        header.put("x-session-id", x_session_id);

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK39", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header,
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK40() {

        HashMap<String, String> header = new HashMap<>();
        header.put("Authorization", "222");
        header.put("x-session-id", x_session_id);

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK40", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header,
                UNATHORIZED);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK41() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK41", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstBRqtSn" + x_session_id),
                UNATHORIZED);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK42() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK42", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstUndSn" + x_session_id),
                UNATHORIZED);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK43() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK43", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstFbdSn" + x_session_id),
                UNATHORIZED);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK44() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK44", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstNFdSn" + x_session_id),
                UNATHORIZED);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK45() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK45", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstISESn" + x_session_id),
                UNATHORIZED);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK46() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK46", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstBRPnCS" + x_session_id),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK47() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK47", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstFdnPnCS" + x_session_id),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK48() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK48", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstMNAlPnCS" + x_session_id),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK49() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK49", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstRtTtPnCS" + x_session_id),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK50() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK50", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstISEPnCS" + x_session_id),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK51() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK51", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstSUPnCS" + x_session_id),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK52() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK52", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstUdPf" + x_session_id),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK53() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK53", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstFdnPf" + x_session_id),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK54() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK54", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstNFPf" + x_session_id),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK55() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK55", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstCNFIMDMPf" + x_session_id),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }
/* Убрали из функционала
    @Test
    public void CheckAccessTK56() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK56", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("FirstNFEmpC" + x_session_id),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK57() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK57", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("RequestTimeoutEmployeeCard"),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK58() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK58", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("InternalServerErrorEmployeeCard"),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }
*/
    @Test
    public void CheckAccessTK59() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK59", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("ClientNotFoundPersonCrossref"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK60() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK60", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("BadRequestPersonCrossref"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK61() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK61", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("ForbiddenPersonCrossref"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK62() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK62", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("MethodNotAllowedPersonCrossref"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK63() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK63", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("RequestTimeoutPersonCrossref"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK64() {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject("src/test/resources/CheckAccess/TK64", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420("ServiceUnavailablePersonCrossref"),
                ITERNAL_SERVER_ERROR);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }
}
