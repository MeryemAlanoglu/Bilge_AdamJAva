package week02;

public class AssignmentOperator {
    public static void main(String[] args) {
        byte byteNumber = 126;
        short shortNumber =327;
        int intNumber = 1058;
        long longNumber =12042;
        float floatNumber=42.8f;
        double doubleNumber=8.58;
        char character= 'A';
        boolean booleanInformation= true;

        // Referans Veri Tipleri (String ile sınırlı):
        String myText= "Merhaba!", myWeb="www.bilgeadam.com";

        // Ekrana Yazdırma Komutları:
        System.out.println(myText
                        +"\nByte Değeri :"+byteNumber
                        +"\nShort Değeri:" +shortNumber
                        +"\nIntegar degeri:" +intNumber
                        +"\nLong Degeri:"+ longNumber
                        +"\nFloat Degeri:" +floatNumber
                        +"\nDouble Degeri:"+doubleNumber
                        +"\nCharNumber Degeri:"+character
                        +"\nBloolean degeri:"+booleanInformation
                        +"\nmyWeb" + myWeb);
        System.out.println(myWeb);



    }
}
