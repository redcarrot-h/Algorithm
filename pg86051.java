
//@Url : https://programmers.co.kr/learn/courses/30/lessons/86051


class Solution {
    public int solution(int[] numbers) {
        // int answer = -1;
        int answer = ((0+9)*10)/2; // 등차 수열의 합(공차가 1인 경우) = {(첫번째 항 + 마지막 항)*항의 개수}/2
        // return answer;
        for (int num : numbers) {
            answer -= num;
        }
        return answer;
    }
}