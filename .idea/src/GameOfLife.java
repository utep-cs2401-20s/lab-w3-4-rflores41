public class GameOfLife {
    int [][] board;
    int [][] previous;
    int size;

    //default constructor
    public GameOfLife(){}

    //constructor for number of rows and colums for board and previous
    public GameOfLife(int size){
        this.size = size;
        int board [][] = new int [size][size];
        int previous [][] = new int [size][size];
    }

    //copy board into previous
    public GameOfLife(int [][] board){
        this.board[size][size] = board[size][size];
        this.previous[size][size] = board[size][size];
    }

    //getter
    public int [][] getBoard(){
        return board;
    }

    //transforms board into next state
    //Rules:
    //Any live cell with fewer than two live neighbours dies, as if by underpopulation.
    //Any live cell with two or three live neighbours lives on to the next generation.
    //Any live cell with more than three live neighbours dies, as if by overpopulation.
    //Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction
    //side note, 0 is dead, 1 is alive
    public void oneStep(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; i++){


                }
            }
        }
    }

    //computes the number of corresponding neighbors the cell has
    public int neighbors(int i, int j){
        //to prevent out of bounds
        //If i is less than 0
        //if i is greater then size
        //if j is less than 0
        //if j is greater then size
        //if i is fine but j is less than 0
        //if i is fine but j is greater than size
        //if i is less than 0 but j is fine
        //if i is greater then size but j is fine
        //if i and j are less than 0
        //if i and j are greater than size
        if(board[i][j] == 1){
            if(i < 0){
            //skip this index
            }
            if(i > size){
                //skip this index
            }



    }

    //transforms the board into the board after n steps of evolution
    public void evolution(int n){

    }

}
//test
