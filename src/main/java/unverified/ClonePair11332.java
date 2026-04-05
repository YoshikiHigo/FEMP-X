package unverified;

public class ClonePair11332 {

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

    int method2(int[] array,int value){
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
}
