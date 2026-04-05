package unverified;

public class ClonePair11331 {

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

    int method2(int[] data,int key){
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
}
