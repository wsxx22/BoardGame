package game.player;

import game.board.Component;
import game.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Player extends Component implements ActionPlayer{

    private String username;

    private int moveX = 0;

    private int moveY = 0;

    private List<Item> items = new ArrayList<Item>();

    public Player(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public List<Item> getItems() {
        return items;
    }

    public int getMoveX() {
        return moveX;
    }

    public void setMoveX(int moveX) {
        this.moveX = moveX;
    }

    public int getMoveY() {
        return moveY;
    }

    public void setMoveY(int moveY) {
        this.moveY = moveY;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void moveUp(boolean isAvailable) {
        moveY++;
    }

    public void moveDown(boolean isAvailable) {
        moveY--;
    }

    public void moveRight(boolean isAvailable) {
        moveX++;
    }

    public void moveLeft(boolean isAvailable) {
        moveX--;
    }

}
