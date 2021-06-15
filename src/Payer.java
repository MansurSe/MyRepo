public class Payer {
    public static void main(String[] args) {
        Payer payer = new Payer("Seifulin","Mansur","Almaty","32323");
        System.out.println(payer);
        System.out.println(payer);
    }
    String surname;
    String name ;
    String address ;
    String cardNumber;



    public Payer(String surname, String name, String address, String cardNumber){
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.cardNumber = cardNumber;

    }

    @Override
    public String toString() {
        return "Payer:" + surname + " " + name + ",address: " + address + ",cardNumber:" + cardNumber;
    }
}
