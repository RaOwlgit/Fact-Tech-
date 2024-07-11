package com.TechRC.facttech;

public class Movie {

    private String name,description,hindidescription;
    private int image;


    public Movie() {
    }

    public Movie(String name, String description,String hindidescription, int image) {
        this.name = name;
        this.description = description;
        this.hindidescription = hindidescription;
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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
