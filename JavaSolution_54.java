class JavaSolution_54 {
    public String solution(int a, int b) {
        String answer = "";
        String[] week = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int days = 0;
        int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        for (int i = 0; i < a - 1; i++) {
            days += month[i];
        }
        days += b;

        answer = week[(days - 1) % 7];

        return answer;
    }
}
