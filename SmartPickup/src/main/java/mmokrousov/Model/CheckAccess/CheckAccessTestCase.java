package mmokrousov.Model.CheckAccess;

import mmokrousov.Model.CheckAccess.Request.CheckAccessRequest;
import mmokrousov.Model.CheckAccess.Response.CheckAccessResponse;
import mmokrousov.Model.TestCaseData;

public class CheckAccessTestCase extends TestCaseData {
    private CheckAccessResponse response;
    private CheckAccessRequest request;

    public CheckAccessRequest getRequest() {
        return request;
    }

    public void setRequest(CheckAccessRequest request) {
        this.request = request;
    }

    public CheckAccessResponse getResponse() {
        return response;
    }

    public void setResponse(CheckAccessResponse response) {
        this.response = response;
    }
}
