package models;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by Алмаз on 23.03.14.
 */
@Entity
@Table(name="account")
public class User extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    @Constraints.Required
    @Formats.NonEmpty
    public String email;

    @Constraints.Required
    public String name;

    @Constraints.Required
    public String password;

    public static Model.Finder<String,User> find = new Model.Finder<String,User>(String.class, User.class);

    public static List<User> findAll() {
        return find.all();
    }

    public static User findByEmail(String email) {
        return find.where().eq("email", email).findUnique();
    }

    public static User authenticate(String email, String password) {
        return find.where()
                .eq("email", email)
                .eq("password", password)
                .findUnique();
    }

    public String toString() {
        return "User(" + email + ")";
    }

}
