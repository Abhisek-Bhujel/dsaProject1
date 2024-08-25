package Project1;

public class Block {

    private int topLeftY;
    private int topLeftX;
    private int size;

    private int noOfRows;

    private int noOfColumn;

    private DynamicArray<Tile> rows;


    private DynamicArray<DynamicArray<Tile>> block; // the internal storage of the block data

    public Block(int y, int x, int size) {
        this.size = size;
        this.topLeftX = 0;
        this.topLeftY = 0;
        this.noOfColumn = x;
        this.noOfRows = y;
        rows = new DynamicArray<>(x);
        block = new DynamicArray<>(y);
        for (int i = 0; i < y; i++) {

            for (int j = 0; j < x; j++) {
                rows.set(j, null);
            }

            block.set(i, rows);
        }

    } // this contructor creates a 2D
    // placeholder of null values; these values will be populated later with calls to setTile() -- O(block_size)

    public Block(int y, int x, int size, byte color) {
        this.size = size;
        this.topLeftX = 0;
        this.topLeftY = 0;
        block = new DynamicArray<>(y);
        rows = new DynamicArray<>(x);
        for (int i = 0; i < y; i++) {

            for (int j = 0; j < x; j++) {
                rows.set(j, new Tile(color));
            }

            block.set(i, rows);
        }
    }// overloaded constuctor
    // that creates a 2D matrix with actual tile objects; no need to call setTile afterwards -- O(block_size)

    public int getSize() {
        return size;
    } // returns the length of the side of block -- O(1)

    public int getY() {
        return topLeftY;
    }// returns the top-left Y-coordinate of the block -- O(1)

    public int getX() {
        return topLeftX;
    } // returns the top-left X-coordinate of the block -- O(1)

    public void setTile(int y, int x, Tile t) {

        rows = block.get(y);
        rows.set(x, t);
    }// sets the tile at location y,x -- O(1)

    public Tile getTile(int y, int x) {
        rows = block.get(y);
        return rows.get(x);
    } // gets the tile from location y,x -- O(1)

    public void drop() {
        for (int i = block.size() - 1; i > 0; i--) { // Start from the last row and move each row down
            block.set(i, block.get(i - 1)); // Move each row down
        }

        // Create a new empty row at the top
        DynamicArray<Tile> newRow = new DynamicArray<>(block.get(0).size());
        for (int j = 0; j < newRow.size(); j++) {
            newRow.set(j, null); // Initialize each cell with null
        }

        block.set(0, newRow); // Set the top row to be the new empty row
        topLeftY++; // Adjust the Y-coordinate
    }

    // drops the block by one row -- O(block_size)

    public void moveLeft() {
        for (int i = 0; i < block.size(); i++) {
            DynamicArray<Tile> row = block.get(i);
            for (int j = 0; j < row.size() - 1; j++) {
                row.set(j, row.get(j + 1));
            }
            row.set(row.size() - 1, null);
        }
        topLeftX--;

    } // moves the block one spot to the left -- O(block_size)

    public void moveRight() {
        for (int i = 0; i < size; i++) {
            DynamicArray<Tile> row = block.get(i);
            for (int j = row.size() + 1; j < 0; j++) {
                row.set(j, row.get(j - 1));
            }
            row.set(0, null);
        }
        topLeftX++;
    } // moves the block one spot to the right -- O(block_size)

    public void rotate() {
        for (int i = 0; i < size; i++) {
            DynamicArray<Tile> row = block.get(i);
            for (int j = 0; j < row.size(); j++) {

                Tile k = row.get(j);
                block.get(j).set(i, k);
            }
        }
        for (int p = 0; p < size; p++) {
            DynamicArray<Tile> row = block.get(p);
            for (int q = 0; q < (noOfColumn - 1) / 2; q++) {
                Tile temp = row.get(q);
                row.set(q, row.get(noOfColumn - (q + 1)));
                row.set(noOfColumn - q - 1, temp);
            }
        }
    }
// rotates the block 90 degrees clockwise -- O(block_size)

    public void flipVertical() {
        for (int i = 0; i < size / 2; i++) {
            DynamicArray<Tile> tempRow = block.get(i);
            block.set(i, block.get(size - (1 + i)));
            block.set(size - (1 + i), tempRow);

        }
    }
// flips the block vertically -- O(block_size)
    public void flipHorizontal () {
            for (int p = 0; p < size; p++) {
                DynamicArray<Tile> row = block.get(p);
                for (int q = 0; q < noOfColumn / 2; q++) {
                    Tile temp = row.get(q);
                    row.set(q, row.get(noOfColumn - q - 1));
                    row.set(noOfColumn - q - 1, temp);
                }
            }
        }


        // flips the block horizontally -- O(block_size)

//        public Block scaleUp () {
//
//        }
//// scales up the block (double size) -- O(block_size)
//
//        public Block scaleDown () {
//
//        }


// scales down the block (half size) -- O(block_size)

        @Override
        public String toString () {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < block.size(); i++) { // Iterate over each row
                DynamicArray<Tile> row = block.get(i);

                for (int j = 0; j < row.size(); j++) { // Iterate over each tile in the row
                    Tile tile = row.get(j);

                    if (tile == null) {
                        result.append("" + i + j + " "); // Use a placeholder for null tiles
                    } else {
                        result.append(" " + tile.toString() + " "); // Print the tile's toString()
                    }
                }
                result.append("\n"); // Move to the next line after each row
            }

            return result.toString();
        }

    }
