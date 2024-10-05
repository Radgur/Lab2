public class Balance{
    int rightSide = 0;
    int leftSide = 0;

    void addRight(int weight){
        this.rightSide += weight;
    }

    void addLeft(int weight){
        this.leftSide += weight;
    }

    void result(){
        if (this.leftSide == this.rightSide){
            System.out.println("=");
        }
        else if (this.leftSide > this.rightSide) {
            System.out.println("L");
        }
        else{
            System.out.println("R");
        }
    }
}