class JavaSolution_41 {
    public String solution(String s) {
        char[] answer = s.toCharArray();
        int index = 0;

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == ' ') {
                index = 0;
            } else {
                if (index++ % 2 == 0) {
                    answer[i] = Character.toUpperCase(answer[i]);
                } else {
                    answer[i] = Character.toLowerCase(answer[i]);
                }
            }
        }

        return String.valueOf(answer);
    }
}
