import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("오징어 게임에 오신 것을 환영합니다.");
        System.out.println("이번 게임은 구슬 게임입니다.");
        System.out.println("당신과 나는 각각 10개의 구슬을 가지고 있습니다.");
        System.out.println("10개의 구슬을 다 잃으면 죽습니다.");
        System.out.println("시작합니다.");
        System.out.println("배팅하세요.");
        String name = "이름";

        //유저가 가진 구슬 개수.
        int userGu = 10; // 초기 값
        //배팅 숫자를 입력 받기.
        Scanner sc = new Scanner(System.in); //입력을 받기 위한 준비
        //여기서부터 반복 배팅 조건이 안 맞으면 계속 반복.
        int bet = 0;
        while (true){
            System.out.print("입력: ");
            bet = sc.nextInt(); //숫자를 입력 받아서 bet 변수에 저장
            System.out.println("당신은 "+bet+"개의 구슬을 배팅했습니다.");

            //만약에 내가 가진 개수보다 많은 배팅을 하면 다시 배팅.
            if(bet>userGu) {
                System.out.println("다시 배팅하십시오.");
            }
            else {
                break;
            }
        }
        System.out.println("뭘까유");
        //컴퓨터가 10개의 구슬 중 랜덤으로 문제를 냄.
        Random random = new Random();
        int rNum = random.nextInt(10)+1;
        System.out.println("컴퓨터가 낸 문제(구슬 개수):"+rNum);
        String dab = "짝";
        if (rNum % 2 == 1) {
            dab = "홀";
            System.out.println("홀수");
        } else {
            System.out.println("짝수");
        }
        //유저가 답 맞혀야 함.
        //답을 입력 후 홀인지 짝인지 맞으면 맞다, 틀리면 틀렸다.
        String uDab = sc.next(); //문자열 입력받기

        userGu = userGu - bet;        
        
        //내가 가진 구슬 개수가 0이면 빵.
        //내가 가진 구슬 개수가 20이되면 컴퓨터가 빵.

    }
}
