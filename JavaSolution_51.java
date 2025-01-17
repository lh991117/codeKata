class JavaSolution_51 {
    public String solution(int[] food) {
        String answer = "";
        String reverse = "";

        for (int i = 0; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer += Integer.toString(i);
            }
        }

        StringBuffer sb = new StringBuffer(answer);
        reverse = sb.reverse().toString();
        return answer + "0" + reverse;
    }
}
