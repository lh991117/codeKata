import java.util.Arrays;

public class JavaSolution_48 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int f = 0; f < commands.length; f++) {
            int i = commands[f][0];
            int j = commands[f][1];
            int k = commands[f][2];

            int[] sArray = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(sArray);
            answer[f] = sArray[k - 1];
        }

        return answer;
    }
}
