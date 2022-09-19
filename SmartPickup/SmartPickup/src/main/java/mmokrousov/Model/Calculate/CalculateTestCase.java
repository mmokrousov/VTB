package mmokrousov.Model.Calculate;

import mmokrousov.Model.Calculate.Request.CalculateRequest;
import mmokrousov.Model.Calculate.Response.CalculateResponse;
import mmokrousov.Model.TestCaseData;

public class CalculateTestCase extends TestCaseData {
    CalculateRequest request = new CalculateRequest();
    CalculateResponse response = new CalculateResponse();

    public CalculateRequest getRequest() {
        return request;
    }

    public void setRequest(CalculateRequest request) {
        this.request = request;
    }

    public CalculateResponse getResponse() {
        return response;
    }

    public void setResponse(CalculateResponse response) {
        this.response = response;
    }
}
