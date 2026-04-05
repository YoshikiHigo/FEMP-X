package all;

public class ClonePair11275 {

    int method1(int[] array,int value){
      int end=array.length - 1;
      int start=0;
      int middle;
      while (start < end) {
        middle=(start + end) / 2;
        if (value > array[middle]) {
          start=middle + 1;
        }
     else     if (value < array[middle]) {
          end=middle - 1;
        }
     else {
          return middle;
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
