package models;

import com.avaje.ebean.Ebean;
import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;
import javax.validation.Constraint;
import javax.validation.constraints.NotNull;
import java.text.SimpleDateFormat;
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

    @NotNull
    @Constraints.Required
    public String header;

    @Constraints.Required
    @NotNull
    public String shortText;

    @NotNull
    @Constraints.Required
    public String text;

    @Formats.DateTime(pattern="dd-MM-yyyy")
    public Date date;

    @OneToMany
    public List<Picture> pictures;

    public static List<NewsLetter> getAllNewsLetters() {
        List<NewsLetter> newsLetters = new ArrayList<NewsLetter>();
        newsLetters = Ebean.find(NewsLetter.class).findList();
        return newsLetters;
    }
}
