import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(20, 6, 4, 12, 1, 8, 16, 4, 10));
        System.out.println(list);

        Comparator<Integer> comp1 = (a,b) -> primeCheck(a) - primeCheck(b);
        System.out.println(Collections.max(list, comp1));
    }

    public static Integer primeCheck(Integer n) {
        for (int i = 2; i < n; i++) {
            if((n % i) == 0) {
                return 0;
            }
        }
        return n;
    }
}
