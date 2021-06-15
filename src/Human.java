public class Human {
    String name;
    int age;
    int weight;
    String address;
    String work;

    public static void main(String[] args) {

    }

    public Human(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 50;
    }
    public Human(String name, String address){
        this.name = name;
        this.address = address;
        this.weight = 50;
        this.age = 18;
    }
    public Human(String name, int age, int weight){
        this(name, age);// вызываем из другого конструктора выше
        this.weight = weight;
    }

    public Human(String name, int age, String work){
        this(name, age);
        this.work = work;
        this.weight = 50;
    }

    public Human(int age, int weight, String address, String work){
        this.name = "Tom";
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }


}
