package mmokrousov.Model.CheckAccess.Response;

import java.util.ArrayList;
import java.util.List;

public class CheckAccessResponse {
    private String checkEmployee;
    private String userGuide;
    private Boolean check;
    private Boolean representative;
    private String nameRepresentative;
    private List<ReasonError> reasonError = new ArrayList<>();
    private List<EmptyParamList> emptyParamList = new ArrayList<>();
    private String errorCode;
    private String message;
    private String traceId;

    public String getCheckEmployee() {
        return checkEmployee;
    }

    public void setCheckEmployee(String checkEmployee) {
        this.checkEmployee = checkEmployee;
    }

    public String getUserGuide() {
        return userGuide;
    }

    public void setUserGuide(String userGuide) {
        this.userGuide = userGuide;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    public Boolean getRepresentative() {
        return representative;
    }

    public void setRepresentative(Boolean representative) {
        this.representative = representative;
    }

    public String getNameRepresentative() {
        return nameRepresentative;
    }

    public void setNameRepresentative(String nameRepresentative) {
        this.nameRepresentative = nameRepresentative;
    }

    public List<ReasonError> getReasonError() {
        return reasonError;
    }

    public void setReasonError(List<ReasonError> reasonError) {
        this.reasonError = reasonError;
    }

    public List<EmptyParamList> getEmptyParamList() {
        return emptyParamList;
    }

    public void setEmptyParamList(List<EmptyParamList> emptyParamList) {
        this.emptyParamList = emptyParamList;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }
}
