class JavaSolution_44 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int wMax = 0;
        int hMax = 0;

        // 세로가 가로 길이보다 클 경우 가로와 세로를 변경(회전)
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int temp = 0;
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }

        // 배열에 저장된 가로 최대값, 세로 최대값 구하기
        for (int i = 0; i < sizes.length; i++) {
            // 가로 최대값
            if (wMax < sizes[i][0]) {
                wMax = sizes[i][0];
            }
            // 세로 최대값
            if (hMax < sizes[i][1]) {
                hMax = sizes[i][1];
            }
        }

        return answer = wMax * hMax;
    }
}
