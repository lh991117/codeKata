class JavaSolution_52 {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (true) {
            if (n >= a) {
                answer += b * (n / a);
                n = b * (n / a) + (n % a);
            } else {
                break;
            }
        }

        return answer;
    }
}
