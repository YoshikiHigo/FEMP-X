package all;

public class ClonePair11343 {

    int method1(int[] array,int value){
      int low=0;
      int high=array.length - 1;
      while (low <= high) {
        int mid=(low + high) >> 1;
        int bci=array[mid];
        if (bci == value) {
          return mid;
        }
        if (bci > value) {
          high=mid - 1;
        }
     else {
          low=mid + 1;
        }
      }
      return -1;
    }

    int method2(int[] a,int find){
      int left=0;
      int right=a.length - 1;
      int mid=(left + right) / 2;
      while (left <= right) {
        if (find < a[mid]) {
          right=mid - 1;
        }
     else     if (find > a[mid]) {
          left=mid + 1;
        }
     else {
          return mid;
        }
        mid=(left + right) / 2;
      }
      return -1;
    }
}
