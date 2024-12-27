class JavaSolution_24 {
    public String solution(String[] seoul) {
        String answer = "";
        int in = 0;

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                in = i;
                break;
            }
        }

        answer = "김서방은 " + in + "에 있다";
        return answer;
    }
}
