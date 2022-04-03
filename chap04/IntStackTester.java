package chap04;

import java.util.Scanner;

import chap04.IntStack.EmptyIntStackException;
import chap04.IntStack.OverflowIntStackException;

public class IntStackTester {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    IntStack s = new IntStack(64);

    while (true) {
      System.out.println("현재 데이터 수: " + s.size() + " / " + s.capacity());

      System.out.print("(1) 푸시 (2) 팝 (3) 피크 " +
          "(4) 덤프 (5) 종료 : ");

      int menu = stdIn.nextInt();
      if (menu == 0)
        break;

      int x;
      switch (menu) {
        case 1:
          System.out.print("데이터 : ");
          x = stdIn.nextInt();
          try {
            s.push(x);
          } catch (OverflowIntStackException e) {
            System.out.println("스택이 가득 찼습니다.");
          }
          break;

        case 2:
          try {
            x = s.pop();
            System.out.println("팝한 데이터는 " + x + "입니다.");
          } catch (EmptyIntStackException e) {
            System.out.println("스택이 비었습니다.");
          }
          break;

        case 3:
          try {
            x = s.peek();
            System.out.println("피크한 데이터는 " + x + "입니다.");
          } catch (Exception e) {
            System.out.println("스택이 비었습니다.");
          }
          break;

        case 4:
          s.dump();
          break;
      }
    }
  }
}
