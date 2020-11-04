/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan33.oo.userlogin;

/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fauzan
 * NIM      : 10119077
 * Kelas    : IF - 2
 * Deskripsi: User Login
 */

import java.util.Scanner;
import User.User;

public class PBOIF210119077Latihan33OOUserLogin {
        private static String usName;
        private static String passWord;   

    public static void main(String[] args) {
    
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan Username = ");
        usName = keyboard.next();
        System.out.print("Masukkan Password = ");
        passWord = keyboard.next();
        User usLog = new User();
        usLog.pengecekanLogin(usName, passWord);
        
    }
    
}
