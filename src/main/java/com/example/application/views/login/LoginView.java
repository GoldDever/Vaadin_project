package com.example.application.views.login;

import com.example.application.views.manager.Manager;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route("login")

public class LoginView extends VerticalLayout {

    private LoginForm login = new LoginForm();

    public LoginView(){
        setSizeFull(); //полноразмерное
        setAlignItems(Alignment.CENTER); //центрирует содержимое по горизонтали
        setJustifyContentMode(JustifyContentMode.CENTER); //центрирует содержимое по вертикали
        add(new H1("Trade-CRM"), login, new Checkbox("Remember me"));
        Manager manager = new Manager();
        manager.saveTokenToLocalStorage("Madagaskar");
        manager.getToken();
    }
}
