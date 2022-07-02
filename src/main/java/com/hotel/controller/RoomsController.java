package com.hotel.controller;

import com.hotel.model.Rooms;
import com.hotel.services.impl.RoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Rooms/Api")
public class RoomsController {

    @Autowired
    private RoomServiceImpl roomService;

    @GetMapping
    public List<Rooms> getAllRooms(){
        return roomService.getAllRooms();
    }

    @PostMapping
    public ResponseEntity<Rooms> createRoom(@RequestBody Rooms rooms){
        return new ResponseEntity<>(roomService.createRoom(rooms), HttpStatus.CREATED);
    }
}
