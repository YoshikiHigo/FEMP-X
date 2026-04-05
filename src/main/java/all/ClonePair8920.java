package all;

public class ClonePair8920 {

    int method1(int[] elements,int start,int length){
      int sum=0;
      for (int j=0; j < length; j++)   sum+=elements[start + j];
      return sum;
    }

    int method2(int[] differences,int start,int toTake){
      int sum=0;
      for (int i=0; i < toTake; i++) {
        sum+=differences[start + i];
      }
      return sum;
    }
}
