package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

/**
 * Created by khain on 18/12/2015.
 */
@Entity
public class check extends Model{
    private String ok;

    public check(String ok) {
        this.ok = ok;
    }
}
