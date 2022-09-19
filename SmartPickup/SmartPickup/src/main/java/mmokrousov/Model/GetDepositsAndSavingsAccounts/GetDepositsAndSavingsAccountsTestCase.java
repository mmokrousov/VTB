package mmokrousov.Model.GetDepositsAndSavingsAccounts;

import mmokrousov.Model.GetDepositsAndSavingsAccounts.Request.GetDepositsAndSavingsAccountsRequest;
import mmokrousov.Model.GetDepositsAndSavingsAccounts.Response.GetDepositsAndSavingsAccountsResponse;
import mmokrousov.Model.TestCaseData;

public class GetDepositsAndSavingsAccountsTestCase extends TestCaseData {
    private GetDepositsAndSavingsAccountsRequest request = new GetDepositsAndSavingsAccountsRequest();
    private GetDepositsAndSavingsAccountsResponse response = new GetDepositsAndSavingsAccountsResponse();

    public GetDepositsAndSavingsAccountsRequest getRequest() {
        return request;
    }

    public void setRequest(GetDepositsAndSavingsAccountsRequest request) {
        this.request = request;
    }

    public GetDepositsAndSavingsAccountsResponse getResponse() {
        return response;
    }

    public void setResponse(GetDepositsAndSavingsAccountsResponse response) {
        this.response = response;
    }
}
