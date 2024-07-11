package com.TechRC.facttech;

public class Movie3 {

    private String name,hindidescription,link,linkTittle;
    private int image;


    public Movie3() {
    }

    public Movie3(String name, String hindidescription, String link, String linkTittle, int image) {
        this.name = name;
        this.hindidescription = hindidescription;
        this.link = link;
        this.linkTittle = linkTittle;
        this.image = image;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHindiDescription() {
        return hindidescription;
    }

    public void setHindiDescription(String hindidescription) {
        this.hindidescription = hindidescription;
    }

    public String getLink() {
        return link;
    }

    public void setlink(String link) {
        this.link = link;
    }

    public String getLinkTittle() {
        return linkTittle;
    }

    public void setLinkTittle(String linkTittle) {
        this.linkTittle = linkTittle;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
