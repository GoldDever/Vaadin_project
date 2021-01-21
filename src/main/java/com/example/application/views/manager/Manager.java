package com.example.application.views.manager;


import com.vaadin.flow.component.UI;

import com.vaadin.flow.component.page.Page;
import com.vaadin.flow.component.page.PendingJavaScriptResult;

public class Manager {
    String str = "";
    String string;

    public void saveTokenToLocalStorage(String token){
        Page page = UI.getCurrent().getPage();
        page.executeJs("localStorage.setItem($0, $1)", "token", token);

    }

    public String getToken() {
        Page page = UI.getCurrent().getPage();
        PendingJavaScriptResult p = page.executeJs("return localStorage.getItem($0)", "token");
        p.then(value -> System.out.println(value));
        System.out.println("Token is: " + str);
        return null;
    }
}
