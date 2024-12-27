import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class JavaSolution_25 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        if (list.isEmpty())
            list.add(-1);

        answer = list.stream().mapToInt(Integer::intValue).toArray();

        Arrays.sort(answer);

        return answer;
    }
}
