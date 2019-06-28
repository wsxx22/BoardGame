package game.utils;

import game.entity.Entity;

public interface MovableUnit extends Entity {

    void moveUp();

    void moveDown();

    void moveRight();

    void moveLeft();

    boolean isPossibilityMove(int moveX, int moveY);

}
