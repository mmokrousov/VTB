package vtb.mmokrousov.CheckAccess;

import mmokrousov.ApiHelper.URL;
import mmokrousov.Comparator.CheckAccessComparator;
import mmokrousov.Comparator.IComparator;
import mmokrousov.Model.CheckAccess.CheckAccessTestCase;
import mmokrousov.Model.CheckAccess.Response.CheckAccessResponse;
import org.apache.tools.ant.taskdefs.Sleep;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.UUID;

import static mmokrousov.ApiHelper.Constants.*;
import static mmokrousov.ApiHelper.Post.*;
import static mmokrousov.ApiHelper.URL.*;
import static mmokrousov.Processor.Deserialization.DeserializationBase.JsonToObject;
import static mmokrousov.Processor.Deserialization.DeserializationBase.JsonToObjectResponse;
import static mmokrousov.Processor.Serialization.JsonGenerator.ObjectToJsonString;

public class CheckAccessMethods {
    private final IComparator<CheckAccessResponse> comparator = new CheckAccessComparator();
    private final Class<CheckAccessTestCase> clazz = CheckAccessTestCase.class;
    private final Class<CheckAccessResponse> clazzLow = CheckAccessResponse.class;

    @DataProvider(name = "Success")
    public static Object[][] CheckAccessSuccess() {
        return new Object[][] {
                {"src/test/resources/CheckAccess/TK1", "PRIVILEGE"},
                {"src/test/resources/CheckAccess/TK2", "PRIVILEGE2"},
                {"src/test/resources/CheckAccess/TK3", "PRIME"},
                {"src/test/resources/CheckAccess/TK4", "PRIME2"},
                {"src/test/resources/CheckAccess/TK5", "PRIVILEGE_EUR"},
                {"src/test/resources/CheckAccess/TK6", "PRIVILEGE_USD"}};
    }

    @Test(dataProvider = "Success")
    public void CheckAccessTK1(String filePath, String session) {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject(filePath, clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420(session),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }


    @DataProvider(name = "ClientNotEligible")
    public static Object[][] CheckAccessClientNotEligible() {
        return new Object[][] {
                {"src/test/resources/CheckAccess/TK7", "MULTICARTA"},
                {"src/test/resources/CheckAccess/TK8", "BASIC"},
                {"src/test/resources/CheckAccess/TK10", "nationalityCountryCodePersonCS"},
                {"src/test/resources/CheckAccess/TK11", "birthDateTimePersonCS"},
                {"src/test/resources/CheckAccess/TK12", "birthPlacePersonCS"},
                {"src/test/resources/CheckAccess/TK13", "lastNamePersonCS"},
                {"src/test/resources/CheckAccess/TK14", "firstNamePersonCS"},
                {"src/test/resources/CheckAccess/TK15", "personDocumentIdentityPersonCS"},
                {"src/test/resources/CheckAccess/TK16", "addressPersonCS"},
                {"src/test/resources/CheckAccess/TK17", "notAllParamsPersonCS"},
                {"src/test/resources/CheckAccess/TK18", "NOPACKAGE_ACTIVE_RUB"},
                {"src/test/resources/CheckAccess/TK19", "NO_ACTIVE_RUB"},
                {"src/test/resources/CheckAccess/TK20", "PRIVILEGE_NO_MASTER_ACCOUNT"},
                {"src/test/resources/CheckAccess/TK21", "PRIVILEGE_MASTER_ACCOUNT_closed"},
                {"src/test/resources/CheckAccess/TK22", "PRIVILEGE_NOT_RUB_EUR_USD"},
                {"src/test/resources/CheckAccess/TK23", "Role_38PersonCS"},
                {"src/test/resources/CheckAccess/TK24", "Role_39PersonCS"},
                {"src/test/resources/CheckAccess/TK25", "NO_18_YEARSPersonCS"},
                {"src/test/resources/CheckAccess/TK26", "deathDateTimePersonCS"}};
    }

    @Test(dataProvider = "ClientNotEligible")
    public void CheckAccessTK2(String filePath, String session) {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject(filePath, clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420(session),
                OK);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @DataProvider(name = "SystemsUnavailableSession")
    public static Object[][] CheckAccessSystemsUnavailableSession() {
        return new Object[][] {
                {"src/test/resources/CheckAccess/TK41", "FirstBRqtSn" + x_session_id},
                {"src/test/resources/CheckAccess/TK42", "FirstUndSn" + x_session_id},
                {"src/test/resources/CheckAccess/TK43", "FirstFbdSn" + x_session_id},
                {"src/test/resources/CheckAccess/TK44", "FirstNFdSn" + x_session_id},
                {"src/test/resources/CheckAccess/TK45", "FirstISESn" + x_session_id}};
    }

    @Test(dataProvider = "SystemsUnavailableSession")
    public void CheckAccessTK3(String filePath, String session) {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject(filePath, clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420(session),
                UNATHORIZED);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }


    @DataProvider(name = "SystemsUnavailableOther")
    public static Object[][] CheckAccessSystemsUnavailableOther() {
        return new Object[][] {
                {"src/test/resources/CheckAccess/TK46", "BadRequestPersonCS"},
                {"src/test/resources/CheckAccess/TK47", "ForbiddenPersonCS"},
                {"src/test/resources/CheckAccess/TK48", "MethodNotAllowedPersonCS"},
                {"src/test/resources/CheckAccess/TK49", "RequestTimeoutPersonCS"},
                {"src/test/resources/CheckAccess/TK50", "InternalServerErrorPersonCS"},
                {"src/test/resources/CheckAccess/TK51", "ServiceUnavailablePersonCS"},
                {"src/test/resources/CheckAccess/TK52", "UnauthorizedPortfolio"},
                {"src/test/resources/CheckAccess/TK53", "ForbiddenPortfolio"},
                {"src/test/resources/CheckAccess/TK54", "NotFoundPortfolio"},
                {"src/test/resources/CheckAccess/TK55", "ClientNotFoundInMDMPortfolio"},
                {"src/test/resources/CheckAccess/TK56", "NotFoundEmployeeCard"},
                {"src/test/resources/CheckAccess/TK57", "RequestTimeoutEmployeeCard"},
                {"src/test/resources/CheckAccess/TK58", "InternalServerErrorEmployeeCard"},
                {"src/test/resources/CheckAccess/TK59", "ClientNotFoundPersonCrossref"},
                {"src/test/resources/CheckAccess/TK60", "BadRequestPersonCrossref"},
                {"src/test/resources/CheckAccess/TK61", "ForbiddenPersonCrossref"},
                {"src/test/resources/CheckAccess/TK62", "MethodNotAllowedPersonCrossref"},
                {"src/test/resources/CheckAccess/TK63", "RequestTimeoutPersonCrossref"},
                {"src/test/resources/CheckAccess/TK64", "ServiceUnavailablePersonCrossref"}};
    }

    @Test(dataProvider = "SystemsUnavailableOther")
    public void CheckAccessTK4(String filePath, String session) {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject(filePath, clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420(session),
                ITERNAL_SERVER_ERROR);

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


    @DataProvider(name = "ValidHeader")
    public static Object[][] CheckAccessValidHeader() {
        return new Object[][] {
                {"src/test/resources/CheckAccess/TK27", "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CheckAccess/TK28", "x-epa-jti", x_epa_jti, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CheckAccess/TK29", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CheckAccess/TK30", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi" , x_epa_ctxi, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CheckAccess/TK31", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi" , x_epa_ctxi, "x-epa-ip", x_epa_ip, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CheckAccess/TK32", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi" , x_epa_ctxi, "x-epa-ip", x_epa_ip, "x-session-id", x_session_id}};
    }

    @Test(dataProvider = "ValidHeader")
    public void CheckAccessTK6(String filePath, String header1, String value1,
                               String header2, String value2,
                               String header3, String value3,
                               String header4, String value4,
                               String header5, String value5) {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject(filePath, clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420_validation(header1, value1,
                        header2, value2,
                        header3, value3,
                        header4, value4,
                        header5, value5),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @DataProvider(name = "ValidHeader_2")
    public static Object[][] CheckAccessValidHeader_2() {
        return new Object[][] {
                {"src/test/resources/CheckAccess/TK33", "x-epa-jti", symbolIs256, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CheckAccess/TK34", "x-epa-jti", x_epa_jti, "x-epa-sub", symbolIs256, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CheckAccess/TK35", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", symbolIs256, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CheckAccess/TK36", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , symbolIs256, "x-session-id", x_session_id, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CheckAccess/TK37", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", symbolIs51, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CheckAccess/TK37_1", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "X-User-Session-ID", symbolIs51, "x-epa-channel", x_epa_channel},
                {"src/test/resources/CheckAccess/TK38", "x-epa-jti", x_epa_jti, "x-epa-sub", x_epa_sub, "x-epa-ctxi", x_epa_ctxi, "x-epa-ip" , x_epa_ip, "x-session-id", x_session_id, "x-epa-channel", symbolIs256}};
    }

    @Test(dataProvider = "ValidHeader_2")
    public void CheckAccessTK7(String filePath, String header1, String value1,
                               String header2, String value2,
                               String header3, String value3,
                               String header4, String value4,
                               String header5, String value5,
                               String header6, String value6) {

        //Сериализация запроса и ответа
        CheckAccessTestCase checkAccessTestCase = JsonToObject(filePath, clazz);

        //Получение ответа от микросервиса
        String response = requestAPI("",
                CheckAccess,
                header_1420_validation_value(header1, value1,
                        header2, value2,
                        header3, value3,
                        header4, value4,
                        header5, value5,
                        header6, value6),
                BAD_REQUEST);

        //Десериализация ответа и сообщения из файла
        CheckAccessResponse testCase = JsonToObjectResponse(response, clazzLow); //Десериализация ответа
        comparator.compare(testCase, checkAccessTestCase.getResponse());
    }

    @Test
    public void CheckAccessTK8() {

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
}
