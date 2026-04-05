package unverified;

public class ClonePair11333 {

    int method1(int[] array,int valor){
      int esq=0;
      int dir=array.length - 1;
      int valorMeio;
      while (esq <= dir) {
        valorMeio=esq + ((dir - esq) / 2);
        if (array[valorMeio] < valor) {
          esq=valorMeio + 1;
        }
     else     if (array[valorMeio] > valor) {
          dir=valorMeio - 1;
        }
     else {
          return valorMeio;
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
