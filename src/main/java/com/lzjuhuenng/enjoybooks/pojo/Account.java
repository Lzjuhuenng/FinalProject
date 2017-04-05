package com.lzjuhuenng.enjoybooks.pojo;

public class Account {

    private int id;

    private String account;

    private String password;

    private String email;

    private int role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", account=" + account + ", password=" + password + ", email=" + email + ", role="
                + role + "]";
    }


}
