public class Programmer {
    String name, company, position;

    public static void main(String[] args) {

    }

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "intern";
    }


    public String getPosition() {
        return position;
    }

    void work() {
        switch(position){
            case "intern":
                position = "junior";
                break;
            case "Junior":
                position = "middle";
                break;
            case "middle":
                position = "senior";
                break;
            case "senior":
                position = "lead";
                break;
        }
    }
}
