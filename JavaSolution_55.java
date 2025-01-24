class JavaSolution_55 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";

        int index1 = 0;
        int index2 = 0;

        for (String word : goal) {
            if (index1 < cards1.length && word.equals(cards1[index1])) {
                index1++;
            } else if (index2 < cards2.length && word.equals(cards2[index2])) {
                index2++;
            } else {
                return answer = "No";
            }
        }

        return answer = "Yes";
    }
}
