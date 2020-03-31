package com.dtt.arenaofvalue.model;

import android.util.Log;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class Heroes {
    private String id;
    private String name;
    private String linkDetail;
    private String image;
    private String type;

    private HeroDetail heroDetail;

    public Heroes() {
    }

    public Heroes(String id, String name, String linkDetail, String image, String type, HeroDetail heroDetail) {
        this.id = id;
        this.name = name;
        this.linkDetail = linkDetail;
        this.image = image;
        this.type = type;
        this.heroDetail = heroDetail;
    }

    public Heroes(String id, String name, String linkDetail, String image, String type) {
        this.id = id;
        this.name = name;
        this.linkDetail = linkDetail;
        this.image = image;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public HeroDetail getHeroDetail() {
        return heroDetail;
    }

    public void setHeroDetail(HeroDetail heroDetail) {
        this.heroDetail = heroDetail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLinkDetail() {
        return linkDetail;
    }

    public void setLinkDetail(String linkDetail) {
        this.linkDetail = linkDetail;
    }


}
