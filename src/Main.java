import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 64, 7, 70, 16, 19, 10, 3));
        System.out.println(list);

        Function<Integer, Integer> fun = a -> {
            for (int i = 2; i < a; i++)
            if ((a % i) == 0) {
                return 0;
            }
            return a;
        };

        Comparator<Integer> comp1 = (a, b) -> fun.apply(a) - fun.apply(b);
        if (isPrimeNumbersInList(list)) System.out.println(Collections.max(list, comp1));
        if (!isPrimeNumbersInList(list)) System.out.println(Collections.min(list));
    }

    public static boolean isPrimeNumbersInList(List<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            for (int j = 2; j < l.get(i); j++)
                if ((l.get(i) % j) == 0) {
                    return true;
                }
        }
        return false;
    }
}
