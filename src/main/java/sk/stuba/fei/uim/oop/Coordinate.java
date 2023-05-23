package sk.stuba.fei.uim.oop;

import lombok.Getter;

public class Coordinate {
    @Getter
    private int x;
    @Getter
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
