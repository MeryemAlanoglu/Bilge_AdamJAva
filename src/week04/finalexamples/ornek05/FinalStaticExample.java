package week04.finalexamples.ornek05;

public class FinalStaticExample {
    private static final String COLON=":";
    private static final String COMMA=",";
    private static final String DOT=".";

    public static void main(String[] args) {
        String vuid="123456";
        String request="145423";

        System.out.println("String Concat");
        System.out.println(vuid.concat(COLON).concat(request));

        System.out.println("String builder");
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(vuid).append(COLON).append(request));

        String programingLang = " Java,.NET,Python";
        String[] programingLangArr= programingLang.split(COMMA);
        for(String lang: programingLangArr){
            System.out.println(lang);
        }
    }
}
