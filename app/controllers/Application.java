package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.about;
import views.html.contacts;
import views.html.index;
import views.html.orders;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render(""));
    }

    public static Result about() {
        return ok(about.render(""));
    }

    public static Result contacts() {
        return ok(contacts.render("Контакты"));
    }

    public static Result orders() {
        return ok(orders.render("Цены/Заказы"));
    }
}
