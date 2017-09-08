package com.example.admin.myreportcardapplication;

/**
 * Created by Admin on 8/31/2017.
 */

public class Details {
    String name, username, password ,id, confrimpassword ;


    public void setId(String id)
    {
        this.id=id;
    }

    public String getPassword() {
        return password;
    }
    public  void setName(String name)
    {
        this.name = name;

    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getConfrimpassword() {
        return confrimpassword;
    }

    public void setConfrimpassword(String confrimpassword) {
        this.confrimpassword = confrimpassword;
    }

    public String getUsername() {
        return username;
    }

    public String getId() {
        return id;
    }
}
