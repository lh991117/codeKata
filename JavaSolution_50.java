import java.util.HashMap;

public class JavaSolution_50 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> m = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            answer[i] = i - m.getOrDefault(c, i + 1);
            m.put(c, i);
        }

        return answer;
    }
}
