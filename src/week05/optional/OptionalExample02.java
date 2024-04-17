package week05.optional;

import java.util.Optional;

import static week05.supplier.SupplierTest06.findNameById;

public class OptionalExample02 {
    public static void main(String[] args) {
        Optional<String> nullStr = Optional.ofNullable(null);
        //String str= null;
        //System.out.println(str.toUpperCase());
        System.out.println(nullStr);
        nullStr = Optional.of("Alperen");
        nullStr.ifPresent(e -> System.out.println(e.toUpperCase()));
        nullStr = Optional.empty();
        nullStr.ifPresent(e -> System.out.println(e.toLowerCase()));
        System.out.println(findNameById(2L));
        System.out.println(findNameById2(2L));
        findNameById(1L).ifPresentOrElse(
                s -> System.out.println("Merhaba" + s),
                () -> System.out.println("üzgünüm bulamadım")
        );
        if (findNameById2(2L)!= null) {
            System.out.println("Merhaba" + findNameById2(2L));
        } else {
            System.out.println("Üzgünüm Bulamadım");
        }

        Optional<String> nullstr2 = Optional.ofNullable(null);
        System.out.println(nullstr2.map(String::length).orElse(-1));
        System.out.println(nullstr2.map(String::length).orElseThrow(RuntimeException::new));

    }

        public static Optional<String> findNameById (Long id){
            String name = null;
            if (id == 1) {
                name = "Alperen";
            }
            return Optional.ofNullable(name);
        }
        public static String findNameById2 (Long id){
            String name = null;
            if (id == 1) {
                name = "Alperen";
            }
            return name;
        }
    }
