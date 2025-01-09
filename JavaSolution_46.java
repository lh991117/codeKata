class JavaSolution_46 {
    public int solution(String s) {
        int answer = 0;

        String[] eWord = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        for (int i = 0; i < eWord.length; i++) {
            s = s.replace(eWord[i], String.valueOf(i));
        }

        return answer = Integer.parseInt(s);
    }
}
