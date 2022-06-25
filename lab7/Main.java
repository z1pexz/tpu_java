package com.company.lab7;

import java.util.*;

public class Main {
    public static Iterator<Room> iterator;
    public static int squareBathroom = 0;
    public static int squareLivingRoom = 0;
    public static int squareBedroom = 0;
    public static int squareKitchenRoom = 0;

    public static void main(String[] args) {
        Room[] floorFirst = new Room[7];
        ArrayList<Room> floorSecond = new ArrayList<>();
        LinkedList<Room> floorThird = new LinkedList<>();

        for (int i = 0; i < 7; i++) {
            floorFirst[i] = new Room(getRandomRoomType(), getRandomSquare());
            floorSecond.add(new Room(getRandomRoomType(), getRandomSquare()));
            floorThird.add(new Room(getRandomRoomType(), getRandomSquare()));
            System.out.println(floorFirst[i].toString() + " First floor.");
            System.out.println(floorSecond.get(i).toString() + " Second floor.");
            System.out.println(floorThird.get(i).toString() + " Third floor.");
        }
        System.out.println("____");
        System.out.println(getBuildingSumSquare(floorFirst, floorSecond, floorThird));

    }

    public static String getBuildingSumSquare(Room[] floorFirst, ArrayList<Room> floorSecond, LinkedList<Room> floorThird) {
        int squareSum = 0;
        Room room;
        int squareFirstFloor = 0;
        int squareSecondFloor = 0;
        int squareThirdFloor = 0;


        iterator = Arrays.stream(floorFirst).iterator();
        while (iterator.hasNext()) {
            room = iterator.next();
            squareFirstFloor += room.getSquare();
            sumSquareRoomType(room);
            squareSum += room.getSquare();
        }
        iterator = floorSecond.iterator();
        while (iterator.hasNext()) {
            room = iterator.next();
            squareSecondFloor += room.getSquare();
            sumSquareRoomType(room);
            squareSum += room.getSquare();
        }
        iterator = floorThird.iterator();
        while (iterator.hasNext()) {
            room = iterator.next();
            squareThirdFloor += room.getSquare();
            sumSquareRoomType(room);
            squareSum += room.getSquare();
        }
        return " Square of building - " + squareSum + ".\n Square of first floor - " +
                squareFirstFloor + ".\n Square of second floor - " + squareSecondFloor + ".\n Square of third floor - " + squareThirdFloor +
                ".\n Square of bathrooms - "+ squareBathroom+".\n Square of bedrooms - "+ squareBedroom+".\n Square of living rooms - "+squareLivingRoom+
                ".\n Square of kitchens - "+ squareKitchenRoom+".";

    }

    public static void sumSquareRoomType(Room room) {
        if (room.getRoomType() == RoomTypes.BATHROOM) {
            squareBathroom += room.getSquare();
        } else if (room.getRoomType() == RoomTypes.LIVING_ROOM) {
            squareLivingRoom += room.getSquare();
        } else if (room.getRoomType() == RoomTypes.BEDROOM) {
            squareBedroom += room.getSquare();
        } else {
            squareKitchenRoom += room.getSquare();
        }
    }

    public static int getRandomSquare() {
        return (int) (Math.random() * 50) + 5;
    }

    public static RoomTypes getRandomRoomType() {
        ArrayList<RoomTypes> typesRoom = new ArrayList<>();
        typesRoom.add(RoomTypes.LIVING_ROOM);
        typesRoom.add(RoomTypes.BATHROOM);
        typesRoom.add(RoomTypes.BEDROOM);
        typesRoom.add(RoomTypes.KITCHEN);
        return typesRoom.get(new Random().nextInt(4));
    }
}
