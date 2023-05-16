package edu.unindra.kkp_kelompok4.model;

import com.mysql.jdbc.Blob;

/**
 *
 * @author ripal
 */
 public class modelLogin {
    private String username,password;
    private Blob pictures;
    
    public Blob getPictures() {
		return pictures;
    }

    public void setPictures(Blob pictures) {
		this.pictures = pictures;}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
