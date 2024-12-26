class JavaSolution_19 {
    public long solution(long n) {
        long answer = 0;
        long num = 0;

        while (true) {
            if (num * num == n) {
                answer = (num + 1) * (num + 1);
                break;
            } else if (num * num > n) {
                answer = -1;
                break;
            }
            num++;
        }

        return answer;
    }
}
