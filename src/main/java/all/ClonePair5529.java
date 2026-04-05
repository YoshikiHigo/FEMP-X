package all;

public class ClonePair5529 {

    int method1(int index,int[] encodedTree){
      while (index >= 0 && encodedTree[index] >= -1) {
        index--;
      }
      if (index < 0) {
        return -1;
      }
     else {
        return index + encodedTree[index];
      }
    }

    int method2(int index,int[] encodedTree){
      while (index >= 0 && encodedTree[index] >= -1)   index--;
      if (index < 0)   return -1;
     else   return index + encodedTree[index];
    }
}
