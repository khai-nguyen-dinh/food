package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

/**
 * Created by khain on 17/12/2015.
 */
@Entity
public class Users extends Model{
    private String username;
    private String password;
    private String name;
    private String sdt;


}
