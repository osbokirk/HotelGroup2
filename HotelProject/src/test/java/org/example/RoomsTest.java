package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RoomsTest {

    @Test
    public void testRoomIsAvailable_IfIsNotOccupiedAndDirty(){
        //Room should be available if it is neither occupied nor dirty
        Rooms room = new Rooms(2, 139.00, false, false);
        assertTrue(room.isAvailable(), "Room should be available when it is not occupied and not dirty.");
    }
    @Test
    public void testRoomIsNotAvailable_IfISOccupied(){
        //Room should not be available if it is occupied
        Rooms room = new Rooms(2, 139.00, true, false);
        assertFalse(room.isAvailable(), "Room should not be available when it is occupied.");
    }
    @Test
    public void testRoomIsNotAvailable_IfIsDirty() {
        //Room should not be Available if it is dirty
        Rooms room = new Rooms(2, 139.00, false, true);
        assertFalse(room.isAvailable(), "Room should not be available when it is dirty.");
    }
    @Test
    public void testRoomIsNotAvailable_IfIsOccupiedAndDirty(){
        Rooms room = new Rooms(2, 139.00, true, true);
        assertFalse(room.isAvailable(), "Room should not be available when it is both occupied and dirty.");
    }
  
}