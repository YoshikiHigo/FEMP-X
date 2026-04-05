package all;

public class ClonePair9669 {

    int method1(int[] list){
      int max=0;
      if (list.length > 0) {
        max=list[0];
        for (int i=0; i < list.length; i++) {
          if (max < list[i])       max=list[i];
        }
      }
      return max;
    }

    int method2(int[] a){
      int[] sums=new int[a.length];
      for (int i=0; i < a.length; i++) {
        if (i == 0) {
          sums[i]=a[i];
        }
     else {
          sums[i]=sums[i - 1] + a[i];
        }
      }
      for (  int i : sums) {
        System.out.println("Partial sum " + i);
      }
      int end=sums.length - 1;
      for (int i=sums.length - 2; i >= 0; i--) {
        if (sums[end] < sums[i]) {
          end=i;
        }
      }
      int start=0;
      for (int i=0; i < end; i++) {
        if (sums[i] < 0) {
          start=i + 1;
        }
      }
      System.out.println("Start " + start);
      System.out.println("End " + end);
      int sum=0;
      for (int i=start; i <= end; i++) {
        sum+=a[i];
      }
      return sum;
    }
}
