package com.example.partharya.bump;

/**
 * Created by partharya on 8/1/17.
 */

public class Profile {

    private String name, number, facebook, linkedin, snapchat;

    public Profile(String input) {
        String[] info = input.split("/");
        name=info[0];
        number=info[1];
        facebook = info[2];
        snapchat = info[3];
        linkedin = info[4];

    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getFacebook() {
        return facebook;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public String getSnapchat() {
        return snapchat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public void setSnapchat(String snapchat) {
        this.snapchat = snapchat;
    }

    public String toString(){
        return name + "/" + number + "/" + facebook + "/" + linkedin + "/" + snapchat;
    }
}
