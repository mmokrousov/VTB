package mmokrousov.Model.CheckBlackList.Response;

public class CheckBlackListResponse {
    private String blacklist;
    private String comment;
    private String stageArb;
    private String commentArb;
    private String errorCode;
    private String message;
    private String traceId;
    private String currency;


    public String getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(String blacklist) {
        this.blacklist = blacklist;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getStageArb() {
        return stageArb;
    }

    public void setStageArb(String stageArb) {
        this.stageArb = stageArb;
    }

    public String getCommentArb() {
        return commentArb;
    }

    public void setCommentArb(String commentArb) {
        this.commentArb = commentArb;
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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
