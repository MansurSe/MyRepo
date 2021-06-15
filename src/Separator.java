public class Separator {
    int[] array;// = {1,3,5,7,2};

    public Separator(int[] array) {
        this.array = array;

    }

    public static void main(String[] args) {

    }
    int[] even(){
        int k = 0, n =0; // считаем количество элементов
        for (int i:array){
            if (i%2 ==0) k++;
        }

        int[] evens = new int[k];
        for (int i=0; i < array.length; i++){
            if (array[i] % 2==0) {
                evens[n] = array[i]; // заполняем новый массив
                n += 1;
            }
        }

        return evens;
    }

    int[] odd() {
        int k = 0, n = 0; // считаем количество элементов
        for (int i : array) {
            if (i % 2 != 0) k++;
        }

        int[] odds = new int[k];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odds[n] = array[i]; // заполняем новый массив
                n += 1;
            }
        }
        return odds;


        //int even() {
        //   int even = 0;
        //   for (int i=0; i < array.length; i++) {
        //       if (i % 2 == 0) even += array[i];

        //   }
        //   return ;
        //

        //public int odd() {
        //   int odd = 0;
        //   for (int i=0; i < array.length; i++) {
        //       if (i%2 != 0) odd += array[i];
        //       System.out.println("Odd" + array[i]);
        //   }
        //   return array[odd];
        //


    }
}


