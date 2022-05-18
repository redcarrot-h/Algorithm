import java.util.Scanner;

//@Url : https://programmers.co.kr/learn/courses/30/lessons/12969
/*2차행렬을 만들 필요가 없었음
for문을 돌릴 때 입력한 값까지로 설정하는 것을 몰라서 틀림.
for문안에 int 빼먹으면 안됨*/


class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/* 다른 사람 코드 참
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String star = "";
        for(int i=1; i<=a; i++){
            star += "*";
        }
        for(int i=1; i<=b; i++){
            System.out.println(star);
        }
    }
}*/

