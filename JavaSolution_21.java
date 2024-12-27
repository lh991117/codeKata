class JavaSolution_21 {
    public boolean solution(int x) {
        boolean answer = true;
        int num=0;
        int sum=0;
        num=x;
        
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        
        if(x%sum==0){
            answer=true;
        }
        else{
            answer=false;
        }
        
        return answer;
    }
}
