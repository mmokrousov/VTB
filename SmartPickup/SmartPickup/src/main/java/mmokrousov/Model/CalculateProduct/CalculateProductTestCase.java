package mmokrousov.Model.CalculateProduct;

import mmokrousov.Model.Calculate.Response.CalculateResponse;
import mmokrousov.Model.CalculateProduct.Request.CalculateProductRequest;
import mmokrousov.Model.CalculateProduct.Response.CalculateProductResponse;
import mmokrousov.Model.TestCaseData;

public class CalculateProductTestCase extends TestCaseData {
    private CalculateProductRequest request;
    private CalculateProductResponse response;

    public CalculateProductRequest getRequest() {
        return request;
    }

    public void setRequest(CalculateProductRequest request) {
        this.request = request;
    }

    public CalculateProductResponse getResponse() {
        return response;
    }

    public void setResponse(CalculateProductResponse response) {
        this.response = response;
    }
}
