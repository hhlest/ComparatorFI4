import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 64, 70, 70, 16, 19, 10, 30));
        System.out.println(list);

        Function<Integer, Integer> fun = a -> {
            for (int i = 2; i < a; i++)
            if ((a % i) == 0) {
                return 0;
            }
            return a;
        };

        Comparator<Integer> comp2 = (a, b) -> fun.apply(a) - fun.apply(b);
        Comparator<Integer> comp3 = (a, b) -> b - a;
        System.out.println(Collections.max(list, comp2.thenComparing(comp3)));
    }
}
