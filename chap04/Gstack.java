package chap04;

import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class Gstack<E> {
  private int max;
  private int ptr;
  private E[] stk;

  public Gstack(int capacity) {
    ptr = 0;

    max = capacity;
    try {
      stk = (E[]) new Object[max];
    } catch (OutOfMemoryError e) {
      System.out.println("메모리가 부족합니다.");
    }
  }

  // public class OverflowIntStackException extends RuntimeException {
  // public OverflowIntStackException() {
  // };
  // }

  // public class EmptyIntStackException extends RuntimeException {
  // public EmptyIntStackException() {
  // };
  // }

  public E push(E x) {
    if (ptr >= max) {
      throw new OverlappingFileLockException();
    }
    return stk[ptr++];
  }

  public E pop() {
    if (ptr <= 0) {
      throw new EmptyStackException();
    }

    return stk[--ptr];
  }

  public E peek() {
    if (ptr <= 0) {
      throw new EmptyStackException();
    }
    return stk[ptr - 1];
  }

}
