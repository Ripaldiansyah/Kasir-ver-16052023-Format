/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unindra.kkp_kelompok4;

import edu.unindra.kkp_kelompok4.login.formLogin;

/**
 *
 * @author ripal
 */
public class main {
    public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new formLogin().setVisible(true);
			}
		});
    }
}
