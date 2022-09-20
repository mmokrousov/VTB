package mmokrousov.Model.GetDocument;

import mmokrousov.Model.GetDocument.Request.GetDocumentRequest;
import mmokrousov.Model.GetDocument.Response.GetDocumentResponse;
import mmokrousov.Model.TestCaseData;

public class GetDocumentTestCase extends TestCaseData {
    GetDocumentRequest request;
    GetDocumentResponse response;

    public GetDocumentRequest getRequest() {
        return request;
    }

    public void setRequest(GetDocumentRequest request) {
        this.request = request;
    }

    public GetDocumentResponse getResponse() {
        return response;
    }

    public void setResponse(GetDocumentResponse response) {
        this.response = response;
    }
}
