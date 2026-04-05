package all;

public class ClonePair3508 {

    int method1(int val,int[] table,int size){
      int i;
      int j=0;
      for (i=0; i < size; i++) {
        if (val <= table[j++])     return (i);
      }
      return (size);
    }

    int method2(int val,int[] table,int size){
      for (int i=0; i < size; i++) {
        if (val <= table[i]) {
          return i;
        }
      }
      return size;
    }
}
