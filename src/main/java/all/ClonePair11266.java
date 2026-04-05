package all;

public class ClonePair11266 {

    int method1(int[] data,int key){
      for (int i=0; i < data.length; ++i) {
        if (data[i] > key)     return -1;
     else     if (data[i] == key)     return i;
      }
      return -1;
    }

    int method2(int[] array,int valor){
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
}
