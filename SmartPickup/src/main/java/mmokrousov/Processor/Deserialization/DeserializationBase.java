package mmokrousov.Processor.Deserialization;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import mmokrousov.Model.GetDepositsAndSavingsAccounts.Response.GetDepositsAndSavingsAccountsResponse;

import java.io.DataInput;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DeserializationBase {
    static ObjectMapper objectMapper = new ObjectMapper();
    public static <T> T JsonToObject(String path, Class<T> clazz) {

        try {
            return objectMapper.readValue(new String(Files.readAllBytes(Paths.get(path))), clazz);
        }
        catch (IOException ex){
            ex.printStackTrace();
            return null;
        }
    }

    public static  <T> T JsonToObjectResponse(String response, Class<T> clazz) {
        try{
            return objectMapper.readValue(response, clazz);
        }
        catch (IOException ex){
            ex.printStackTrace();
            return null;
        }

    }

    public static  <T> T JsonToObjectResponseCreateTeg(String response, Class<T> clazz) {

        try{
            JsonNode node = objectMapper.readTree(response);
            ((ObjectNode)node).putObject("errors").get(0);
            return objectMapper.readValue((DataInput) node, clazz);
        }
        catch (IOException ex){
            ex.printStackTrace();
            return null;
        }

    }
}
