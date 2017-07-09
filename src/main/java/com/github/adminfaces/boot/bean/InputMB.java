package com.github.adminfaces.boot.bean;

import org.omnifaces.util.Messages;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by rmpestano on 09/07/17.
 */
@Named
@ViewScoped
public class InputMB implements Serializable {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doAction() {
        Messages.create("Welcome to AdminBoot "+name+"!")
                .detail("<b>AdminFaces</b> and <b>SpringBoot</b> integration via <b>JoinFaces.</b>")
                .add();
    }
}
