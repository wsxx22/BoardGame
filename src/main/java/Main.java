import game.board.Board;
import game.item.Item;
import game.item.Shield;
import game.item.Sword;
import game.obstacle.Obstacle;
import game.obstacle.Tree;
import game.player.Player;

public class Main {

    public static void main(String[] args) {

        Item axe = new Sword("Axe", 10);
        Item lightShield = new Shield("Light Shield", 5);

        Obstacle tree = new Tree("tree");

        Player janek = new Player("janek22");
        Board boardJungle = new Board("jungle", 10, 10);
        janek.setBoard(boardJungle);

        boardJungle.addComponent(2,3, axe);
        boardJungle.addComponent(4,7, lightShield);
        boardJungle.addComponent(2,8, tree);

        janek.moveUp();
    }

}
