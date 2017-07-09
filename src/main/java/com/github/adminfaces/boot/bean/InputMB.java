package com.github.adminfaces.boot.bean;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by rmpestano on 09/07/17.
 */
@Named
@ViewScoped
public class InputMB implements Serializable {

    private String input;


    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
