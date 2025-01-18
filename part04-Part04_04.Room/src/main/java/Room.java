/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alanchang
 */
public class Room {

    private final String code;
    private final int seats;

    public Room(String classCode, int numberOfSeats) {
        this.code = classCode;
        this.seats = numberOfSeats;
    }

    @Override
    public String toString() {
        return String.format("Room code: %s, Seats: %d", this.code, this.seats);
    }
}
