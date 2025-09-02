package models;

public class User {

    private String name;
    private String email;
    private String password;
    private String cpf;
    private String phone;

    public User(String name, String email, String password, String cpf, String phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCpf() {
        return cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{"
                + "name='" + name + '\''
                + ", email='" + email + '\''
                + ", cpf='" + cpf + '\''
                + ", phone='" + phone + '\''
                + '}';
    }
}
