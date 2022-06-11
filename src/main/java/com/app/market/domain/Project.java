package com.app.market.domain;

public class Project {
    private int projectId;
    private String tittle;
    private String description;
    private String imageRoute;
    private String logoRoute;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageRoute() {
        return imageRoute;
    }

    public void setImageRoute(String imageRoute) {
        this.imageRoute = imageRoute;
    }

    public String getLogoRoute() {
        return logoRoute;
    }

    public void setLogoRoute(String logoRoute) {
        this.logoRoute = logoRoute;
    }
}
