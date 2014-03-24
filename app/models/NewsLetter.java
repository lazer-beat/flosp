package models;

import com.avaje.ebean.Ebean;
import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;
import javax.validation.Constraint;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Алмаз on 24.03.14.
 */
@Entity
@Table(name = "news")
public class NewsLetter extends Model {

    @Id
    public Long id;

    @Constraints.Required
    public String header;

    @Constraints.Required
    public String text;

    public Date date;

    @ManyToOne
    public List<Picture> pictures;

    public static List<NewsLetter> getAllNewsLetters() {
        List<NewsLetter> newsLetters = new ArrayList<NewsLetter>();
        newsLetters = Ebean.find(NewsLetter.class).findList();
        return newsLetters;
    }
}
