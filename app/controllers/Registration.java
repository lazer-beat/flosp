package controllers;

import play.api.mvc.Result;
import play.mvc.Controller;
import views.html.registration;

/**
 * Created by Алмаз on 23.03.14.
 */
public class Registration extends Controller {

    public static Result registration() {
        return (Result) ok(registration.render("Registration"));
    }
}
