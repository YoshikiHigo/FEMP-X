package all;

public class ClonePair8924 {

    int method1(int[] elements,int start,int length){
      int sum=0;
      for (int j=0; j < length; j++)   sum+=elements[start + j];
      return sum;
    }

    int method2(int[] buffer,int from,int to){
      int r=0;
      for (int i=from; i < to; i++)   r+=buffer[i];
      return r;
    }
}
