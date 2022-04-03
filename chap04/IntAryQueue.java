package chap04;

public class IntAryQueue {
  private int max;
  private int num;
  private int[] que;

  public IntAryQueue(int capacity) {
    max = capacity;

  }

  // public class EmptyIntStackException extends RuntimeException {
  // public EmptyIntStackException() {
  // }
  // }

  // public class OverflowIntStackException extends RuntimeException {
  // public OverflowIntStackException() {
  // }
  // }

  public int push(int x) {
    if (max <= 0) {
      return 0;
    } else {
      return que[num + 1];
    }
  }

  public int pop() {
    if (max <= 0)
      return 0;
    int result = que[0];

    for (int i = 0; i < num; i++) {
      que[i] = que[i + 1];
    }

    return result;

  }

}
