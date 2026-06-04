package com.belendiestra.hotelmanagementapi.controller;

import com.belendiestra.hotelmanagementapi.entity.Room;
import com.belendiestra.hotelmanagementapi.service.RoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/api/rooms")
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }

    @GetMapping("/api/rooms/{id}")
    public Room getRoomById(@PathVariable Long id) {
        return roomService.getRoomById(id);
    }


    @PostMapping("/api/rooms")
    public Room createRoom(@RequestBody Room room) {
        return roomService.saveRoom(room);
    }
}
