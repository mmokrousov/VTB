package mmokrousov.Model.GetDocument.Request;

public class InfoMemo {
    private String phoneNumberEmployee;
    private String dateVisit;
    private Driver driver;
    private AuthorizedPerson authorizedPerson;

    public String getPhoneNumberEmployee() {
        return phoneNumberEmployee;
    }

    public void setPhoneNumberEmployee(String phoneNumberEmployee) {
        this.phoneNumberEmployee = phoneNumberEmployee;
    }

    public String getDateVisit() {
        return dateVisit;
    }

    public void setDateVisit(String dateVisit) {
        this.dateVisit = dateVisit;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public AuthorizedPerson getAuthorizedPerson() {
        return authorizedPerson;
    }

    public void setAuthorizedPerson(AuthorizedPerson authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
    }
}
