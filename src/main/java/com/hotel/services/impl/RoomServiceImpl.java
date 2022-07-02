package com.hotel.services.impl;

import com.hotel.model.Rooms;
import com.hotel.repository.RoomRepo;
import com.hotel.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepo roomRepo;

    @Override
    public List<Rooms> getAllRooms() {
        return roomRepo.findAll();
    }

    @Override
    public Rooms createRoom(Rooms rooms) {
        return roomRepo.save(rooms);
    }
}
