public class Bell{
    boolean flag = true;
    void sound(){
        if (this.flag) {
            System.out.println("ding");
            this.flag = false;
        }
            else{
                System.out.println("dong");
                this.flag = true;
            }
        }
}
