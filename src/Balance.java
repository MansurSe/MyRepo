public class Balance {
    public static void main(String[] args) {
            }
    int r =0;
    int l =2;


    public void addRight(int n){
        r += n;
    }

    public void addLeft(int n) {
        l +=n;
    }

     String getSituation() {

        if (r==l)
            return "=";
        else if (r>l)
            return "R";
        else return "L";

    }


}