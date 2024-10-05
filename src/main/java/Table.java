public class Table{
    int rows = 0;
    int cols = 0;
    int[][] values;

    Table(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.values = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                setValue(i, j, 0);
            }
        }
    }

    int getValue(int row, int col){
        return this.values[row][col];
    }

    void setValue(int row, int col, int value){
        this.values[row][col] = value;
    }

    int rows(){
        return this.rows;
    }

    int cols(){
        return this.cols;
    }

    @Override
    public String toString(){
        String s = "";
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.cols; j++){
                s += getValue(i, j) + " ";
            }
        }
        return s;
    }

    double average(){
        double avg = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                avg += getValue(i, j);
            }
        }
        avg = avg/(rows*cols);
        return avg;
    }
}