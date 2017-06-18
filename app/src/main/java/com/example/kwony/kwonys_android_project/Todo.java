package com.example.kwony.kwonys_android_project;

/**
 * Created by kwony on 5/7/17.
 */

public class Todo {
    String category;
    String contents;
    String place;
    String time;

    public String getCategory() {
        return category;
    }
//void 는 리턴값이 없을때
    public void setCategory(String category) {
        this.category = category;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
