/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import models.User;
import play.mvc.Controller;

/**
 *
 * @author oscar
 */
public class Sessions extends Controller{
    public static void open(){
        render();
    }
    public static void validate(){
        String user = params.get("user");
        String pass = params.get("password");


        User usuario = User.validateUserAndPassword(user, pass);
        

        if(usuario==null){
                open();
        }else
        {
            session.put("currentuser", usuario.fullName);
             welcome();
        }
        

    }
    
    public static void welcome(){
        System.out.println(""+session.get("currentuser"));
        render();
    }
}
