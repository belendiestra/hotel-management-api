package com.belendiestra.hotelmanagementapi.repository;

import com.belendiestra.hotelmanagementapi.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
