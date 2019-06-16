package board;

public class Board extends Component{

    private String name;

    private int boardWidth;

    private int boardLength;

    public Board(String name, int boardWidth, int boardLength) {
        this.name = name;
        this.boardWidth = boardWidth;
        this.boardLength = boardLength;
    }

    public String getName() {
        return name;
    }

    public int getBoardWidth() {
        return boardWidth;
    }

    public int getBoardLength() {
        return boardLength;
    }

}
