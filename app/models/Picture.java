package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;

/**
 * Created by Алмаз on 24.03.14.
 */
@Entity
@Table(name="picture")
public class Picture extends Model {

    @Id
    public Long id;

    @Constraints.Required
    public String name;

    @ManyToOne
    public NewsLetter newsLetter;


}
