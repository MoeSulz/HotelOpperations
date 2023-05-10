package com.learntocode;

public class main {
    public static void main(String[] args) {

        Reservation num1 = new Reservation("King", 4, true);
        Reservation num2 = new Reservation("Double", 3, false);
        display(num1);
        System.out.println("-----------");
        display(num2);

        Room room = new Room(2, 99.99);
        System.out.println("Number of Beds: " + room.getNumberOfBeds());
        System.out.println("Price: " + room.getPrice());
        System.out.println("Is Occupied: " + room.isOccupied());
        System.out.println("Is Dirty: " + room.isDirty());
        System.out.println("Is Available: " + room.isAvailable());
    }
    public static void display(Reservation list){
        System.out.println("RoomType: " + list.getRoomType());
        System.out.println("Price: " + list.getPrice());
        System.out.println("Number of Nights: " + list.getNumberOfNights());
        System.out.println("Is Weekend? " + list.isWeekend());
        System.out.println("Reservation Total: " + list.getReservationTotal());
    }

}
