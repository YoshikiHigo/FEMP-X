package unverified;

public class ClonePair3512 {

    int method1(int element,int[] A,int puzzleSize){
      for (int i=0; i < puzzleSize; i++)   if (A[i] == element)   return i;
      return -1;
    }

    int method2(int item,int[] list,int len){
      int i;
      for (i=0; i < len; i++) {
        if (list[i] == item)     return (i);
      }
      return (-1);
    }
}
