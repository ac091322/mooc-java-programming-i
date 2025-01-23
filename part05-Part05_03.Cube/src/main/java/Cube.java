/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alanchang
 */
public class Cube {

    private final int edgeLength;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int volume() {
        return (int) Math.pow(edgeLength, 3);
    }

    @Override
    public String toString() {
        return String.format("The length of the edge is %d and the volume is %d.", this.edgeLength, this.volume());
    }
}
