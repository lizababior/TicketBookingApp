package com.babior.ticketbookingapp.repository;

import com.babior.ticketbookingapp.business.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {

}
