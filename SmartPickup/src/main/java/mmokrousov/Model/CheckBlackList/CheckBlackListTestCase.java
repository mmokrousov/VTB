package mmokrousov.Model.CheckBlackList;

import mmokrousov.Model.CheckBlackList.Request.CheckBlackListRequest;
import mmokrousov.Model.CheckBlackList.Response.CheckBlackListResponse;
import mmokrousov.Model.TestCaseData;

public class CheckBlackListTestCase extends TestCaseData {
    private CheckBlackListRequest request;
    private CheckBlackListResponse response;

    public CheckBlackListRequest getRequest() {
        return request;
    }

    public void setRequest(CheckBlackListRequest request) {
        this.request = request;
    }

    public CheckBlackListResponse getResponse() {
        return response;
    }

    public void setResponse(CheckBlackListResponse response) {
        this.response = response;
    }
}
