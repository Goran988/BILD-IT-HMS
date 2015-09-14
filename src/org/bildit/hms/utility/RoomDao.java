package org.bildit.hms.utility;

import java.util.List;

import org.bildit.hms.beans.Room;

/**
 * @author Ognjen Mišiæ - list of room-related methods for implementation
 *
 */
public interface RoomDao {
	// list all rooms
List<Room> listOfRooms();

// whether we want to edit it's occupancy status, price, or something else, go through this method
void editRoom(int roomNumber);
}
