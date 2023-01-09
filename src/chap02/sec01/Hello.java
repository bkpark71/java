package sec01;

/**
 * 콘솔에 '안녕' 메시지를 출력하는 자바 프로그램
 */

public class Hello {
    public static void main(String[] args) {
        /*
         * 메인 메소드 내부
         */
        System.out.println("안녕!");	// 화면에 문자 출력

        System.out.println("안녕" + "!");

        String hello = "안녕!";
        System.out.println(hello);
    }
}
