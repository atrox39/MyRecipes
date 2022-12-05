package com.adrossoftware.myrecipes.models;

public class RecipeModel {
    private String uid;
    private String title;
    private String description;
    private String ingredients;
    private String steps;
    private String user;
    private String createdAt;

    public RecipeModel() {}

    public RecipeModel(String title, String description, String ingredients, String steps, String user, String createdAt) {
        this.uid = uid;
        this.title = title;
        this.description = description;
        this.ingredients = ingredients;
        this.steps = steps;
        this.user = user;
        this.createdAt = createdAt;
    }

    public RecipeModel(String uid, String title, String description, String ingredients, String steps, String user, String createdAt) {
        this.uid = uid;
        this.title = title;
        this.description = description;
        this.ingredients = ingredients;
        this.steps = steps;
        this.user = user;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return this.title;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
