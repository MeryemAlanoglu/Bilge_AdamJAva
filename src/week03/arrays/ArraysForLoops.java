package week03.arrays;

public class ArraysForLoops {
    public static void main(String[] args) {

        int[]age={12,4,5,1};

        //for loop ile array de gezme
        for(int i = 0;i<age.length;i++){
            System.out.println(age[i]);

        }// arrayIndexOutOfBoundsExeption -> Arrayin dışına taşındığını belirtir.
    }
}
