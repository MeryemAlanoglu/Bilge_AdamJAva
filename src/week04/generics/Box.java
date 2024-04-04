package week04.generics;

public class Box <T> {
    private T item;

    public void addItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public static void main(String[] args) {
        Box<String> stringBox=new Box<>();
        stringBox.addItem("Merhaba Dünya!");
        String message= stringBox.getItem();
        System.out.println("Message :"+message);

        Box<Integer> integerBox=new Box<>();
        integerBox.addItem(42);
        int number=integerBox.getItem();
        System.out.println("Sayi: " + number);

    }  //Box adlı generic sınıfında belirli bir türde nesneler eklememizi ve çıkarmamızı sağlar.T tür parametresi
        //ile sınıfın genel ve tekrar kullanılabilir olmasını sağlar. addItem metodu ile nesne ekleyebilirsiniz ,
        // getItem metodu ile nesneyi alabilirsiniz. Main metoduyla hem String hem integar türünde kutular oluşturulur ve kullanılılr
}

