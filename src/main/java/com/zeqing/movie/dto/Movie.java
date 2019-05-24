package com.zeqing.movie.dto;

import java.util.Date;

public class Movie{

    private Long id;

    private String image;

    private String name;

    private String englishName;

    private Integer duration;

    private String type;

    private String director;

    private String country;

    private Date showDate;

    private String intro;

    private String actor;

    private String Tag;

    private Integer wantCount;

    private Integer globalRelease;

    private Integer showType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getShowDate() {
        return showDate;
    }

    public void setShowDate(Date showDate) {
        this.showDate = showDate;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getTag() {
        return Tag;
    }

    public void setTag(String tag) {
        Tag = tag;
    }

    public Integer getWantCount() {
        return wantCount;
    }

    public void setWantCount(Integer wantCount) {
        this.wantCount = wantCount;
    }

    public Integer getGlobalRelease() {
        return globalRelease;
    }

    public void setGlobalRelease(Integer globalRelease) {
        this.globalRelease = globalRelease;
    }

    public Integer getShowType() {
        return showType;
    }

    public void setShowType(Integer showType) {
        this.showType = showType;
    }
}
