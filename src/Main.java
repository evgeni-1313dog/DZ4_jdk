import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        Search.sea.add(new Guide(65, 382974, "Ivan", 23));
        Search.sea.add(new Guide(32, 376438, "Misha", 3));
        Search.sea.add(new Guide(6, 384638, "Vitia", 17));
        Search.sea.add(new Guide(15, 8527276, "Denis", 11));
        Search.sea.add(new Guide(34, 2352366, "Dasha", 9));
        Search.sea.add(new Guide(3, 3821736, "Olia", 30));
        Search.sea.add(new Guide(42, 3264796, "Donat", 19));
        Search.sea.add(new Guide(24, 3723792, "Poma", 1));
        Search.sea.add(new Guide(45, 3824722, "Kira", 6));
        Search.sea.add(new Guide(1, 3727422, "Kiril", 7));




        System.out.println(Search.sea);

        System.out.println("with 5 years of experience:");
        System.out.println(Collections.unmodifiableList(Search.getExp(6)));

        System.out.println("Phone numbers of name Kira:");
        System.out.println(Search.getPhoneByName("Kiril"));

        System.out.println("The employee with ID: 65");
        System.out.println(Search.getService(65));

    }
}