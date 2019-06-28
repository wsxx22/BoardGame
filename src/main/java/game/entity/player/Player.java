package game.entity.player;

import game.board.Board;
import game.entity.Damageable;
import game.entity.item.Item;
import game.equipment.Equipment;
import game.utils.Component;


public class Player implements OfflinePlayer, OnlinePlayer, Damageable {

    private String username;

    private Board board;

    private Equipment equipment;

    private boolean isActive;

    public Player(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    private void addItemToEquipment(Item item) {
        equipment.addItem(item);
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public void moveUp() {
        if (isPossibilityMove(moveX, moveY))
            moveY++;
    }
    @Override
    public void moveDown() {
        if (isPossibilityMove(moveX, moveY))
            moveY--;
    }
    @Override
    public void moveRight() {
        if (isPossibilityMove(moveX, moveY))
            moveX++;
    }
    @Override
    public void moveLeft() {
        if (isPossibilityMove(moveX, moveY))
            moveX--;
    }

    @Override
    public boolean isPossibilityMove(int moveX, int moveY) {
        Component[][] components = this.board.getComponents();
        if (components[moveX][moveY] == null) {
            return true;
        }
        if (components[moveX][moveY].equals(Item.class)) {
            this.addItemToEquipment((Item) components[moveX][moveY]);
            return true;
        }
        return false;
    }

    @Override
    public boolean isActivePlayer(boolean isActive) {
        return isActive();
    }
}