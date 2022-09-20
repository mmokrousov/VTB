package mmokrousov.ApiHelper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import mmokrousov.Model.Epa.EpaResponse;


import java.io.File;
import java.util.HashMap;
import java.util.UUID;

import static io.restassured.RestAssured.given;
import static mmokrousov.ApiHelper.Constants.*;

public class Post {
    private static final ContentType CONTENT_TYPE = ContentType.JSON;
    private static final ContentType URLENCODED = ContentType.URLENC;


    //Хедер для getDepositsAndSavingsAccounts статус 200
    public static HashMap<String, String> header_1421(){
        HashMap<String, String> header = new HashMap<>();
        //header.put("Authorization", "Bearer " + token);
        header.put("X-Initiator-Host", X_Initiator_Host);
        header.put("X-Initiator-Service", X_Initiator_Service);
        header.put("X-Mdm-Id", X_Mdm_Id);
        header.put("X-UNC", X_UNC);
        header.put("X-User-Session-ID", UUID.randomUUID().toString());
        header.put("X-Message-ID", UUID.randomUUID().toString());
        return header;
    }

    //Хедер для checkAccess статус 200
    public static HashMap<String, String> header_1420(){
        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", x_epa_jti);
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", x_epa_ctxi);
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", x_session_id);
        header.put("x-epa-channel", x_epa_channel);
        return header;
    }

    public static HashMap<String, String> header_1420(String session){
        HashMap<String, String> header = new HashMap<>();
        header.put("x-epa-jti", x_epa_jti);
        header.put("x-epa-sub", x_epa_sub);
        header.put("x-epa-ctxi", x_epa_ctxi);
        header.put("x-epa-ip", x_epa_ip);
        header.put("x-session-id", session);
        header.put("x-epa-channel", x_epa_channel);
        return header;
    }

    //Запрос на checkAccess проверка обязательности хедеров
    public static HashMap<String, String> header_1420_validation(String header1, String value1,
                                                                 String header2, String value2,
                                                                 String header3, String value3,
                                                                 String header4, String value4,
                                                                 String header5, String value5){
        HashMap<String, String> header = new HashMap<>();
        header.put(header1, value1);
        header.put(header2, value2);
        header.put(header3, value3);
        header.put(header4, value4);
        header.put(header5, value5);
        return header;
    }

    //Запрос на checkAccess проверка наполнения хедеров
    public static HashMap<String, String> header_1420_validation_value(String header1, String value1,
                                                                 String header2, String value2,
                                                                 String header3, String value3,
                                                                 String header4, String value4,
                                                                 String header5, String value5,
                                                                 String header6, String value6){
        HashMap<String, String> header = new HashMap<>();
        header.put(header1, value1);
        header.put(header2, value2);
        header.put(header3, value3);
        header.put(header4, value4);
        header.put(header5, value5);
        header.put(header6, value6);
        return header;
    }

    public static String requestAPI(String body,
                                       String url,
                                       HashMap<String, String> header, int statusCode){
        RestAssured.useRelaxedHTTPSValidation();
        String jsonResponse = given()
                .log().all(true)
                .headers(header)
                .contentType(CONTENT_TYPE)
                .body(body)
                .request("POST", url)
                .then().statusCode(statusCode).extract().response().prettyPrint();
        return jsonResponse;
    }


    //Запрос для CancelContract
    public static String requestAPI(String url,
                                    HashMap<String, String> header, int statusCode, String param){
        RestAssured.useRelaxedHTTPSValidation();
        String jsonResponse = given()
                .log().all(true)
                .headers(header)
                .contentType(CONTENT_TYPE)
                .request("POST", url + param)
                .then().statusCode(statusCode).extract().response().prettyPrint();
        return jsonResponse;
    }
    //Запрос на сервис savings-product-market
    public static String requestAPI200(String url){
        RestAssured.useRelaxedHTTPSValidation();
        String jsonResponse = given()
                .log().all(true)
                .header("X-Channel", "Telebank")
                .header("X-Initiator-Service", "finstrategy-configurator")
                .contentType(CONTENT_TYPE)
                .request("GET", url)
                .then().statusCode(200).extract().response().prettyPrint();
        return jsonResponse;
    }

}
