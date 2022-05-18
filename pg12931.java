

//@Url :https://programmers.co.kr/learn/courses/30/lessons/12931

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n); //숫자를 문자형으로 변환

        for (int i =0; i<s.length(); i++){
            answer +=Integer.parseInt(s.substring(i, i+1)); //문자형을 숫자형으로 변경, 배열 자르기 매서드 활용
        }

        return answer;
    }
}