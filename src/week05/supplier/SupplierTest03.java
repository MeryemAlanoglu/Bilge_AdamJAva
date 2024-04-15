package week05.supplier;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierTest03 {


    public static void main(String[] args) {
        //Araştırma konusu: Java da tarih
//        LocalDate date = LocalDate.now(); //YYYY/MM/DD günün tarihini veririr
//        System.out.println(date);
//        LocalDate date2 = LocalDate.ofEpochDay(0);
//        System.out.println(date2);
//
//        System.out.println(System.currentTimeMillis());
//
//        long millis = 1713255057911l;
//        long second = 1713255057911l/1000l;
//        long minute= second/60;
//        long hour = minute/60;
//        long day = hour/24;
//        LocalDate date3 =LocalDate.ofEpochDay(day);
//        System.out.println(date3);
//      long birthDate


        Supplier<String> currentDateTime =()-> LocalDateTime.now().toString();
        System.out.println(currentDateTime.get());

        Supplier<LocalDateTime> supplier02=LocalDateTime::now;
        LocalDateTime localDateTime= supplier02.get();
        System.out.println(localDateTime);

        Supplier<String> supplier03 = ()-> dtf.format (LocalDateTime.now());
        String local;// TODO kodun devamı yazılacak

    }
    private static final DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd-mm-yy");
}
