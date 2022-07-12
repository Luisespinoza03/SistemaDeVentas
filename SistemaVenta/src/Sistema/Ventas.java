package Sistema;

public class Ventas {

    private String name;
    private int nit;
    private String email;
    private String gender;

    public Ventas() {
    }

    public Ventas(String name, int nit, String email, String gender) {
        this.name = name;
        this.nit = nit;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + " " + email + " " + gender + " " + nit;
    }
}
