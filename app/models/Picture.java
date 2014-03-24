package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Created by Алмаз on 24.03.14.
 */
@Entity
@Table(name="picture")
public class Picture extends Model {

    @Id
    public Long id;

    public String name;

    @OneToMany
    public NewsLetter newsLetter;


}
