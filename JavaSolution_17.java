class JavaSolution_17 {
    public int[] solution(long n) {
        int count = 0;
        long num = n;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        int[] answer = new int[count];

        for (int i = 0; i < count; i++) {
            answer[i] = (int) (num % 10);
            num = num / 10;
        }
        return answer;
    }
}
