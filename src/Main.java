import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(20, 6, 7, 12, 1, 8, 16, 19, 10));
        System.out.println(list);

        Comparator<Integer> comp1 = (a,b) -> convert(a) - convert(b);
        if (!isPrimeNumbersInList(list)) {
            System.out.println(Collections.max(list, comp1));
        } else {
            System.out.println(Collections.min(list));
        }
    }

    public static Integer convert(Integer n) {
        for (int i = 2; i < n; i++) {
            if((n % i) == 0) {
                return 0;
            }
        }
        return n;
    }

    public static boolean isPrimeNumbersInList(List<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            if((l.get(i) % 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
