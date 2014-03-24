package controllers;

import models.NewsLetter;
import play.mvc.Controller;

import java.util.List;

import play.mvc.Result;
import views.html.newsletter;

/**
 * Created by Алмаз on 24.03.14.
 */
public class News extends Controller {

    public static Result newsletter() {
        List<NewsLetter> newsLetters = NewsLetter.getAllNewsLetters();
        return ok(newsletter.render(newsLetters));
    }

}
