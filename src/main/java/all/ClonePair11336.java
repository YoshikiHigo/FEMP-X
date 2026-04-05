package all;

public class ClonePair11336 {

    int method1(int[] data,int key){
      int low=0, high=data.length - 1;
      while (low <= high) {
        final int i=(low + high) >> 1;
        final int v=data[i];
        if (v == key)     return i;
     else     if (v < key)     low=i + 1;
     else     high=i - 1;
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
