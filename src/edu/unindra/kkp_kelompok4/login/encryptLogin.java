/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unindra.kkp_kelompok4.login;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author ripal
 */
public class encryptLogin {
	public static String getmd5java(String Message){
		String digest = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] hash = md.digest(Message.getBytes("UTF-8"));
			
			StringBuilder sb = new StringBuilder(2*hash.length);
			for (byte b : hash){
				sb.append(String.format("%02x", b&0xff));
			}
			digest = sb.toString();
		} catch (UnsupportedEncodingException e) {
			Logger.getLogger(encryptLogin.class.getName()).log(Level.SEVERE,null,e);
		}catch(NoSuchAlgorithmException e){
			Logger.getLogger(encryptLogin.class.getName()).log(Level.SEVERE,null,e); 
		}return digest;
	}
}
	
