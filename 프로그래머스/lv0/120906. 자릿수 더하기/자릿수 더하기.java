class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp=n;
        while(temp!=0){
            answer=answer+temp%10;
            temp=temp/10;
        }
        return answer;
    }
}