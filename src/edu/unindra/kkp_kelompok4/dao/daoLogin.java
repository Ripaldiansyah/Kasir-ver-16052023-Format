/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unindra.kkp_kelompok4.dao;

import edu.unindra.kkp_kelompok4.home.homeApp;
import edu.unindra.kkp_kelompok4.login.encryptLogin;
import edu.unindra.kkp_kelompok4.login.formLogin;
import edu.unindra.kkp_kelompok4.resource.koneksi;
import edu.unindra.kkp_kelompok4.model.modelLogin;
import edu.unindra.kkp_kelompok4.Services.serviceLogin;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ripal
 */
public class daoLogin implements serviceLogin{
	private Connection conn = new koneksi().connect();
	@Override
	public void prosesLogin(modelLogin loginModel) {
	   String sql = ("Select * from employeeTable where username='"+loginModel.getUsername()+"' and password_hash ='"+encryptLogin				.getmd5java(loginModel.getPassword())+"'");
	   PreparedStatement stat=null;
	   ResultSet rs=null;
	   String idEmployee,employeeName,role=null;
	   Blob picture;
    try {
        stat = conn.prepareStatement(sql);
        rs = stat.executeQuery();
        if (rs.next()) {
            idEmployee = rs.getString("idEmployee");
            employeeName = rs.getString("employeeName");
            role = rs.getString("role");
	    picture = rs.getBlob("pictures");
		    
	    modelLogin model = new modelLogin();
	    model.setPictures((com.mysql.jdbc.Blob) picture);
	    
            homeApp menu = new homeApp(idEmployee, employeeName, role, (com.mysql.jdbc.Blob) picture);
            menu.setVisible(true);
            menu.revalidate();
	    formLogin login = new formLogin();
	    login.close=true;

        }else{
            JOptionPane.showMessageDialog(null, "Username atau Password salah","Kesalahan",JOptionPane.INFORMATION_MESSAGE);
	    formLogin login = new formLogin();
	    login.close=false;
	    
        }

    }
    catch (SQLException ex) {
        Logger.getLogger(daoLogin.class.getName()).log(Level.SEVERE, null, ex);

    }finally{
        if (stat!=null) {
            try {
                stat.close();
            }catch(SQLException ex){
                Logger.getLogger(daoLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

}

	
	
//	
