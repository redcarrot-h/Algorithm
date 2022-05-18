

//@Url : https://programmers.co.kr/learn/courses/30/lessons/12910


import java.util.*; //util package에 내가 사용하는 클래스가 있으니 거기를 참조해서 찾을 것
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<Integer>(); //타입설정 int타입만 사용가능
        for (int i=0; i<arr.length; i++) {
            if (arr[i]%divisor == 0) {
                arrList.add(arr[i]); //ArrayList 값 추가
            }
        }

        if (arrList.size() > 0) {//ArrayList의 크기를 구하려면 ArrayList의 size() 메소드를 사용하면 됩니다.
            answer = new int[arrList.size()];
            for (int i=0; i<answer.length; i++) {
                answer[i] = arrList.get(i); //ArrayList의 get(index) 메소드를 사용하면 ArrayList의 원하는 index의 값이 리턴됩니다.
            }
            Arrays.sort(answer); // 오름차순 정렬
        } else {
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}