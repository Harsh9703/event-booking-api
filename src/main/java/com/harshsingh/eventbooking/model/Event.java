package com.harshsingh.eventbooking.model;

public class Event {
    private Long id;
    private String name;
    private String venue;
    private String date;

    public Event(Long id, String name, String venue, String date) {
        this.id = id;
        this.name = name;
        this.venue = venue;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getVenue() {
        return venue;
    }

    public String getDate() {
        return date;
    }

}
