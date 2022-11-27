package Hotel;

public class Client {
    private String name,surname,Adres,BankNumber;
    public String getBankNumber() {
        return BankNumber;
    }

    public void setBankNumber(String bankNumber) {
        BankNumber = bankNumber;
    }

    public String getAdres() {
        return Adres;
    }

    public void setAdres(String adres) {
        Adres = adres;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
