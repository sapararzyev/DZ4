
import java.util.*;

public class Main {
    public static void main(String[] args ){
        Scanner Namescanner = new Scanner(System.in);
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        ArrayList<String> C = new ArrayList<>();
        System.out.println("vyvodite eshe 5 imen chtoby zapolnit spisok А");


        for (int i = 0; i < 5; i++) A.add(Namescanner.next());
        System.out.println("spisok А: " + A);
        System.out.println("vyvodite eshe 5 imen chtoby zapolnit spisok Б");
        for (int i = 0; i < 5; i++) B.add(Namescanner.next());
        System.out.println("spisok Б: " + B);

        C.addAll(A);
        C.addAll(B);
        ArrayList<String> sapar = new ArrayList<>(C);
        C.set(0, sapar.get(0));C.set(1, sapar.get(9));
        C.set(2,sapar .get(1));C.set(3, sapar.get(8));
        C.set(4,sapar .get(2));C.set(5, sapar.get(7));
        C.set(6,sapar .get(3));C.set(7, sapar.get(6));
        C.set(8,sapar .get(4));C.set(9, sapar.get(5));
        System.out.println(" spisok С: " + C);

        String[] rrr  = C.toArray(new String[0]);
        Arrays.sort(rrr, Comparator.comparing(String::length));
        System.out.println("sortirovannyi spisok: " + Arrays.toString(rrr));
    }
}




