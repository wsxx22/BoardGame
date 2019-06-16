import game.board.Board;
import game.board.Component;
import game.item.Item;
import game.item.Shield;
import game.item.Sword;
import game.obstacle.Obstacle;
import game.obstacle.Tree;
import game.player.Player;
import game.utils.Type;

public class Main {

    public static void main(String[] args) {

        Item axe = new Sword("Axe", Type.OFFENSIVE, 10);
        Item lightShield = new Shield("Light Shield", Type.DEFENSIVE, 5);

        Obstacle tree = new Tree("tree");

        Player janek = new Player("janek22", Type.OFFENSIVE);
        Board boardJungle = new Board("jungle", 10, 10);

        janek.setBoard(boardJungle.getComponents());

        boardJungle.addComponent(2,3, axe);
        boardJungle.addComponent(4,7, lightShield);
        boardJungle.addComponent(2,8, tree);

        janek.moveUp(isAvailableFieldOnBoard(boardJungle.getComponents(), janek));

    }

    private static boolean isAvailableFieldOnBoard (Component[][] board, Player player) {

        if (board[player.getMoveBoardWidth()][player.getMoveBoardLength()] == null) {
            return true;
        } else if (board[player.getMoveBoardWidth()][player.getMoveBoardLength()].equals(Item.class)) {
            player.addItem((Item) board[player.getMoveBoardWidth()][player.getMoveBoardLength()]);
            return true;
        }  else {
            return false;
        }

    }

}
