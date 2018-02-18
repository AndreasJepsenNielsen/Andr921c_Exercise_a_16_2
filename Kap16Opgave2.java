import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Kap16Opgave2 {

    public static void main(String[] args) {
        LinkedIntList A = new LinkedIntList();

        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(6);
        A.add(7);
        A.add(6);
        A.add(10);
        A.add(22);
        A.add(33);
        A.add(44);
        A.add(66);
        A.add(70);
        A.add(600);

        max(A);
    }

    // Kapitel 16 opgave 2
    public static int max(LinkedIntList list) {
        if (list.isEmpty()) {
            list.next();
        }

        int maximum = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maximum) {
                maximum = list.get(i);
            }
        }
        System.out.println(maximum);
        return maximum;
    }
}
