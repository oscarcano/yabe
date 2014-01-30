/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import models.User;
import play.db.jpa.Model;

/**
 *
 * @author oscar
 */
@Entity
public class Post extends Model{
    public String title;
    public Date postedAt;
    @Lob
    public String content;
    
@ManyToOne
    public User author;
    

@OneToMany(mappedBy = "post", cascade =CascadeType.ALL)
List<Comment> comments;
    
    
    public Post(String title, User author, String content) {
        this.title = title;
        this.postedAt = new Date();
        this.author = author;
        this.content = content;
    }
    
    
    
}
