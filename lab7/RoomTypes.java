package com.company.lab7;

public enum RoomTypes {
    LIVING_ROOM("Living Room"),
    BEDROOM("Bedroom"),
    KITCHEN("Kitchen"),
    BATHROOM("Bathroom");

    public final String label;

    RoomTypes(String label) {
        this.label = label;
    }
}
