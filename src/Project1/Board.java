//package Project1;
//
//
//
//public class Board
//{
//    private DynamicArray<DynamicArray<Tile>> board; // the internal storage of the board data
//
//    public Board(int height, int width) // this contructor creates a 2D placeholder of null values; these values will be populated later with calls to setTile() -- O(height * width)
//
//    public int getWidth() // returns the width of the board -- O(1)
//
//    public int getHeight() // returns the height of the board -- O(1)
//
//    public void setTile(int y, int x, Tile t) // sets the tile at location y,x -- O(1)
//
//    public Tile getTile(int y, int x) // gets the tile from location y,x -- O(1)
//
//    public void consolidate(Block block) // when the dropping block has reached its final location, this method will consolidate it into the tetris well -- O(block_size)
//
//    public void clearRows() // clear any/all rows that are complete and shifts the above tiles down -- O(board_size)
//
//    public void reward() // applies the reward as explained in the project description -- O(board_size)
//
//    public void penalize() // applies the penalty as explained in the project description -- O(board_size)
//
//}
//
