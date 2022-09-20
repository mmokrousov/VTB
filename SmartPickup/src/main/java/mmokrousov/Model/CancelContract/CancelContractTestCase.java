package mmokrousov.Model.CancelContract;

import mmokrousov.Model.CancelContract.Request.CancelContractRequest;
import mmokrousov.Model.CancelContract.Response.CancelContractResponse;
import mmokrousov.Model.TestCaseData;

public class CancelContractTestCase extends TestCaseData {
    CancelContractRequest request;
    CancelContractResponse response;

    public CancelContractRequest getRequest() {
        return request;
    }

    public void setRequest(CancelContractRequest request) {
        this.request = request;
    }

    public CancelContractResponse getResponse() {
        return response;
    }

    public void setResponse(CancelContractResponse response) {
        this.response = response;
    }
}
