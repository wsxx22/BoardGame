package game.board.entity.player;

import game.board.entity.board.Board;
import game.board.utils.Component;
import game.board.utils.MovableUnit;
import game.board.equipment.Equipment;
import game.board.entity.item.Item;

public class Player extends Component implements MovableUnit {

    private String username;

    private int moveX = 0;

    private int moveY = 0;

    private Board board;

    private Equipment equipment;

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

    public void moveUp() {
        if (isPossibilityMove(moveX, moveY))
            moveY++;
    }

    public void moveDown() {
        if (isPossibilityMove(moveX, moveY))
            moveY--;
    }

    public void moveRight() {
        if (isPossibilityMove(moveX, moveY))
            moveX++;
    }

    public void moveLeft() {
        if (isPossibilityMove(moveX, moveY))
            moveX--;
    }

    private boolean isPossibilityMove(int moveX, int moveY) {
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
}