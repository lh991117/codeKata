class JavaSolution_31 {
    public String solution(int n) {
        String answer = "";
        
        for(int i=0; i<n; i++){
            if((i+1)%2==0){
                answer+="박";
            }
            else{
                answer+="수";
            }
        }
        
        return answer;
    }
}
