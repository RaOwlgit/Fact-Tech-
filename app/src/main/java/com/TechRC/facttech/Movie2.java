package com.TechRC.facttech;

public class Movie2 {

    private String name,description,hindidescription,link,linkTittle;
    private int image;


    public Movie2() {
    }

    public Movie2(String name, String description, String hindidescription,String link, String linkTittle, int image) {
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
