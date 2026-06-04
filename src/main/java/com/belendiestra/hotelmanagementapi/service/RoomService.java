package com.belendiestra.hotelmanagementapi.service;


import com.belendiestra.hotelmanagementapi.entity.Room;
import com.belendiestra.hotelmanagementapi.repository.RoomRepository;
import org.springframework.stereotype.Service;

import  java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }

    public Room getRoomById(Long id) {
        return roomRepository.findById(id).orElse(null);
    }


    public Room saveRoom(Room room) {
        return roomRepository.save(room);
    }

}
