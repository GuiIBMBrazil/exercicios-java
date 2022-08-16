package entitiees;

import java.util.Date;

public class Client {
    private String name;
    private String email;
    Date birthDate;

    public Client() {}

    public Client(Date birthDate, String name, String email) {
        this.birthDate = birthDate;
        this.name =name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
