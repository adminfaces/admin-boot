package com.github.adminfaces.boot.bean;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

import static com.github.adminfaces.template.util.Assert.has;

/**
 * Created by rmpestano on 12/07/17.
 */
/*@Named
@SessionScoped*/
public class Skin2MB implements Serializable {

    /*private String skin;

    @Inject
    private AdminConfig adminConfig;

    @PostConstruct
    public void init() {
        skin = adminConfig.getSkin();
        if (!has(skin)) {
            skin = "skin-blue";
        }
    }


    public void changeSkin(String skin) {
        this.skin = skin;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }*/
}
