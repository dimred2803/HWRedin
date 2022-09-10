package actors;

public abstract class Actor {
    private int index;
    private String personName;
    private String phoneNumber;
    private String eMail;
    private String statusName = "Actor";

    Actor (int index, String personName, String phoneNumber, String eMail) {
        this.index = index;
        this.personName = personName;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public abstract void  printInfo();

    void setIndex (int index) {
        this.index = index;
    }
    void setPersonName (String personName) {
        this.personName = personName;
    }
    void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    void setStatusName (String statusName) {
        this.statusName = statusName;
    }
    int getIndex () {
        return this.index;
    }
    String getPersonName () {
        return this.personName;
    }
    String getPhoneNumber() {
        return this.phoneNumber;
    }
    String getStatusName () {
        return this.statusName;
    }
    String geteMail () {
        return this.eMail;
    }
}

