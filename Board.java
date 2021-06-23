public abstract class Board {

    // Board size
    protected int width, height;

    // Number of mines on the board
    protected int numMines;

    // Number of cells currently marked
    protected int numMarked;

    // Number of cells yet to be revealed
    protected int numUnknown;

    // Indicates where the mines are hidden
    protected boolean[][] mines;

    // The current state of the board
    protected int[][] board;

    // Constants for cell contents.  The MINE value might be returned by
    // reveal(), the others are only used internally but will probably be
    // required in subclasses.
    public static final int UNKNOWN = -1;
    public static final int MARKED = -2;
    public static final int MINE = -3;

    public Board(int width, int height, int numMines) {

        this.width = width;
        this.height = height;
        this.numMines = numMines;
        this.numMarked = 0;
        this.numUnknown = width * height;

        // Allocate storage for game board and mines
        mines = new boolean[width][height];
        board = new int[width][height];

        // Clear the board
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                mines[i][j] = false;
                board[i][j] = UNKNOWN;
            }
        }

        // Randomly allocate mines. 
        int cells = width * height;
        int temp = 0;
        Random rand = new Random();

        while (temp < numMines) {
            int cell = rand.nextInt();
            cell = (cell < 0 ? -cell : cell)%cells;
            if (!mines[cell%width][cell/width]) {
                mines[cell%width][cell/width] = true;
                temp++;
            }
        }
    }

    public void draw() {
        //Draw representation of Board
    }

    public int reveal(int x, int y) {
        //Reveal the contents of the cell at position (x, y) on the board.
    }

    public boolean mark(int x, int y){
        //Mark' the cell (x, y), probably to indicate that a player thinks there may be a mine there.
    }

    public boolean unmark(int x, int y) {
        //Unmark the previously marked cell at (x, y).
    }

    private int closeMines(int x, int y) {
        //Work out how many neighbours of cell (x, y) contain mines.  Return the
        //number of explosive neighbours.
    }
}



public class MineSweeper {
 
   // The game board
   private Board board;
 
   // Tokenizer for commands
   private StreamTokenizer tok;
 
   // Various flags used by play() and doCommand()
   private boolean done, quit, win;
 
   // Contents of last cell revealed
   private int lastCell;

    public MineSweeper(int width, int height, int mines) {
        // Create the game board
        board = new TextBoard(width, height, mines);
     
        // Set up the command tokenizer
        tok = new StreamTokenizer(new InputStreamReader(System.in));
     
        done = win = quit = false;
    }

    public void play() throws IOException {
        //Game play code goes here. On CLick what should happen
    }

    public static void main(String[] args) throws IOException {

     MineSweeper game;

     if (args.length < 3) {
       System.out.println("Usage: java MineSweeper width height mines");
       System.exit(0);
     }
     else {
       int width = Integer.parseInt(args[0]);
       int height = Integer.parseInt(args[1]);
       int mines = Integer.parseInt(args[2]);
       game = new MineSweeper(width, height, mines);
       game.play();
     }
    }
}