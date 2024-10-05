import java.util.ArrayDeque;

public class OddEvenSeparator{
    ArrayDeque<Integer> odd = new ArrayDeque<Integer>();
    ArrayDeque<Integer> even = new ArrayDeque<Integer>();
    void addNumber(int number){
        if(number%2 == 0) {
            this.even.add(number);
        }
        else{
            this.odd.add(number);
        }
    }

    void even(){
        System.out.println(even);
    }

    void odd(){
        System.out.println(odd);
    }
}