public class Bell {
    public static void main(String[] args) {
    Bell bel = new Bell();
        bel.sound();
    }
    Boolean ding = true;

    void sound() {
        if (ding){
            System.out.println("ding");
        } else {
            System.out.println("dong");
        }
        ding =! ding;

    }
}
