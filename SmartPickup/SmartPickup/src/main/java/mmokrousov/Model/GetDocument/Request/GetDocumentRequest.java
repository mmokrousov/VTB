package mmokrousov.Model.GetDocument.Request;

public class GetDocumentRequest {
    private String type;
    private String typeDocument;
    private Info info;
    private InfoMemo infoMemo;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public InfoMemo getInfoMemo() {
        return infoMemo;
    }

    public void setInfoMemo(InfoMemo infoMemo) {
        this.infoMemo = infoMemo;
    }
}
