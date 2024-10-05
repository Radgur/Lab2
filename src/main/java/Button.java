public class Button {
    String name = "";
    int click_count = 0;
    public Button(String s) {
        this.name = s;
    }

    void click(){
        this.click_count += 1;
        System.out.println(this.click_count);
    }
}