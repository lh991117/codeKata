import java.util.*;

class JavaSolution_47 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
            if (a.charAt(n) == b.charAt(n)) {
                return a.compareTo(b);
            }

            return Character.compare(a.charAt(n), b.charAt(n));
        });

        return strings;
    }
}
