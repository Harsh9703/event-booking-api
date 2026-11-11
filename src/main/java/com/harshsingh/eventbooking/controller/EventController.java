package com.harshsingh.eventbooking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harshsingh.eventbooking.model.Event;
import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @GetMapping
    public List<Event> getEvents() {

        Event event1 = new Event(
                1L,
                "Phoenix Suns vs Lakers",
                "Footprint Center",
                "2027-01-15"
        );

        Event event2 = new Event(
                2L,
                "Coldplay Concert",
                "State Farm Stadium",
                "2027-02-20"
        );

        return List.of(event1, event2);

    }

}
