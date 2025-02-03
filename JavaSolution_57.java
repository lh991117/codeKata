import java.util.ArrayList;
import java.util.List;

class JavaSolution_57 {
    public int[] solution(int[] answers) {
        int[] person1 = { 1, 2, 3, 4, 5 };
        int[] person2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] person3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

        int[] score = { 0, 0, 0 };

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person1[i % person1.length]) {
                score[0]++;
            }
            if (answers[i] == person2[i % person2.length]) {
                score[1]++;
            }
            if (answers[i] == person3[i % person3.length]) {
                score[2]++;
            }
        }

        int max_score = 0;
        for (int i = 0; i < score.length; i++) {
            if (max_score < score[i]) {
                max_score = score[i];
            }
        }

        List<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < score.length; i++) {
            if (max_score == score[i]) {
                temp.add(i + 1);
            }
        }

        int[] answer = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }

        return answer;
    }
}
