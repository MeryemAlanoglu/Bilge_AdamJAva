package week03.arrays;

public class ArrayQ1 {
    public static void main(String[] args) {
        //2,-9,0,5,12,-25,22,9,8,12 sayılarını bir dizi içerisine tanımlayınız.
        // Daha sonra for/foreach kullanarak toplamını bulup ekrana yazdıran ve sonrasında ise
        //ortalamasını da hesaplayan ekrana yazdıran java kodunu yazınız.

        int[] numberArr= {2,-9,0,5,12,-25,22,9,8,12};
        int toplam =0;
        double oran=0;
        for(int number:numberArr){
            toplam=toplam+number;

        }
        System.out.println(toplam);
        oran=toplam/(double) numberArr.length;
        System.out.println(oran);

    }
}
