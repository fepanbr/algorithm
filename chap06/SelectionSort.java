public class SelectionSort {
  static void swap(int[] a, int idx1, int idx2) {
    int t = a[idx1];
    a[idx1] = a[idx2];
    a[idx2] = t;
  }

  static void selectionSort(int[] a, int n) {
    for (int i = 0; i < n - 1; i++) {
      int min = i;
      for (int j = i + 1; j < n; j++) {
        if(a[j] < a[min])
          min = j;
        swap(a, i, min);
      }
    }
    
    
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    
    System.out.println("버블 정렬(버전 1)");
    System.out.print("요소수 : ");
    int nx = stdIn.nextInt();
    int[] x = new int[nx];

    for (int i = 0; i < nx; i++) {
      System.out.print("x[" + i + "] : ");
      x[i] = stdIn.nextInt();
    }

    bubbleSort(x, nx);

    System.out.println("오름차순으로 정렬했습니다.");
    for (int i = 0; i < nx; i++) {
      System.out.println("x[" + i + "] = " + x[i]);
    }
  }
}
