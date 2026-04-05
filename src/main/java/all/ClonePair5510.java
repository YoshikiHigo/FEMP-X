package all;

public class ClonePair5510 {

    int method1(int elem,int[] arr){
      for (int i=arr.length; i-- > 0; )   if (arr[i] == elem)   return i;
      return -1;
    }

    int method2(int value,int[] array){
      for (int i=array.length; --i >= 0; ) {
        if (array[i] == value) {
          return i;
        }
      }
      return -1;
    }
}
