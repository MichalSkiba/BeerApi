package com.michalskiba.beer.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int id;
    @NotNull
    private String login;
    @NotNull
    private String password;

    public User() {
    }

    public User(@NotNull String login, @NotNull String password) {
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
