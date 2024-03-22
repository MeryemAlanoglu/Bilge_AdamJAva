package week02;

public class LogicaOperator {
    public static void main(String[] args) {
        String username = "meryemalanoglu";
        int password = 123456;

        System.out.println(username.equals("meryemalanoglu"));
        System.out.println(username.equals("meryem"));
        System.out.println(password == 123456);
        System.out.println(password == 0123456);

        //Koşulların yapısını anlatırken if-else kavramına daha detaylı değineceğiz.
        if (username.equals("meryemalanoglu") && password == 123456)
            System.out.println("Giriş Başarılı");

    }
}
