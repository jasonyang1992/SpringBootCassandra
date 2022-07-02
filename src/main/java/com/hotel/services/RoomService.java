package com.hotel.services;

import com.hotel.model.Rooms;

import java.util.List;

public interface RoomService {

    List<Rooms> getAllRooms();
    Rooms createRoom(Rooms rooms);
}
