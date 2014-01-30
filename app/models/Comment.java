/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import models.Post;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import play.db.jpa.Model;

/**
 *
 * @author oscar
 */
@Entity
public class Comment extends Model{
    public String author;
    public Date postedAt;
    @Lob
    public String content;
    
    @ManyToOne
    public Post post;
    

    public Comment(String author, String content, Post post) {
        this.author = author;
        this.content = content;
        this.post = post;
        this.postedAt = new Date();
        
    }

    
    
    
}
