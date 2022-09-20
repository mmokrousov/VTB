package mmokrousov.Model.CreateContract;

import mmokrousov.Model.CreateContract.Request.CreateContractRequest;
import mmokrousov.Model.CreateContract.Response.CreateContractResponse;
import mmokrousov.Model.TestCaseData;

public class CreateContractTestCase extends TestCaseData {
    CreateContractRequest request;
    CreateContractResponse response;

    public CreateContractRequest getRequest() {
        return request;
    }

    public void setRequest(CreateContractRequest request) {
        this.request = request;
    }

    public CreateContractResponse getResponse() {
        return response;
    }

    public void setResponse(CreateContractResponse response) {
        this.response = response;
    }
}
