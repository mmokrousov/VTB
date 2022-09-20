package vtb.mmokrousov.GetDocument;


import com.aspose.words.Document;
import mmokrousov.Model.CreateContract.Response.CreateContractResponse;
import mmokrousov.Model.GetDocument.GetDocumentTestCase;
import mmokrousov.Model.GetDocument.Response.GetDocumentResponse;
import org.apache.commons.io.IOUtils;
import org.pdfbox.exceptions.COSVisitorException;
import org.pdfbox.pdmodel.PDDocument;
import org.pdfbox.pdmodel.PDPage;
import org.pdfbox.pdmodel.edit.PDPageContentStream;
import org.pdfbox.util.PDFTextStripper;
import org.testng.annotations.Test;


import java.io.*;
import java.sql.Blob;
import java.sql.SQLException;

import static mmokrousov.ApiHelper.Constants.BAD_REQUEST;
import static mmokrousov.ApiHelper.Post.*;
import static mmokrousov.ApiHelper.URL.*;
import static mmokrousov.ApiHelper.Constants.OK;
import static mmokrousov.Processor.Deserialization.DeserializationBase.JsonToObject;
import static mmokrousov.Processor.Deserialization.DeserializationBase.JsonToObjectResponse;
import static mmokrousov.Processor.Serialization.JsonGenerator.ObjectToJsonString;

public class GetDocumentMethods {
    private final Class<GetDocumentTestCase> clazz = GetDocumentTestCase.class;
    private final Class<GetDocumentResponse> clazzLow = GetDocumentResponse.class;

    @Test
    public void GetDocumentTK1() throws Exception {

        //Десериализация запроса
        GetDocumentTestCase getDocumentTestCase = JsonToObject("src/test/resources/GetDocument/TK1", clazz);

        //Получение ответа от микросервиса
        String response = requestAPI(ObjectToJsonString(getDocumentTestCase.getRequest()),
                GetDocument,
                header_1420(),
                OK);
        Document doc = new Document("notes.txt");
        doc.save("F:\\MSA\\Output.pdf");

    }
}
