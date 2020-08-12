package com.example.calendarapp;

import java.util.ArrayList;

public class ListItems {
    private String name;
    private String desc;
    private String byName;
    private String date;
    private String time;
    private String venue;
    private String marker;
    private String eventId;
    private ArrayList<String> arrayList,nameList;
    private String photoUrl;
    private Integer id;
    private String state;

    public ListItems( String name,String desc,String byName,String date,String time,String venue,String marker,String eventId,ArrayList<String> arrayList){
        this.name=name;
        this.desc=desc;
        this.byName=byName;
        this.date=date;
        this.time=time;
        this.venue=venue;
        this.marker=marker;
        this.eventId=eventId;
        this.arrayList=arrayList;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }
    public ArrayList<String> getNameList(){return nameList;}

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
    public void setId(Integer id){this.id=id;}

    public Integer getId(){return id;}
    public void setNameList(ArrayList<String> nameList){this.nameList=nameList;}

    public void setState(String state){this.state=state;}
    public String getState(){return state;}

    public String getName(){
        return name;
    }
    public String getDesc(){
        return desc;
    }
    public String getByName(){return byName;}
    public String getDate(){
        return date;
    }
    public String getTime(){
        return time;
    }
    public String getVenue(){
        return venue;
    }
    public String getMarker(){return marker;}
    public String getEventId(){return eventId;}
    public ArrayList<String> getArrayList(){return arrayList;}
}