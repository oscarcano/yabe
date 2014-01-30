/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import play.db.jpa.Model;

/**
 *
 * @author oscar
 */

@Entity
    public class User extends Model{

 public String email;
 public String pass;
 public String fullName;
 public Boolean isAdmin;
 public String municipio;

 @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
 public List<Post> post;

    public User(String email, String pass, String fullName, Boolean isAdmin, String municipio) {
        this.email = email;
        this.pass = pass;
        this.fullName = fullName;
        this.isAdmin = isAdmin;
        this.municipio = municipio;
    }

    
    public static User validateUserAndPassword(String user, String pass){
        User usuario = User.find("email = ? and pass = ? ", user, pass).first();
        return usuario;
    }
    
    
    
    @Override
    public String toString() {
        return fullName;
    }

    
  
}
