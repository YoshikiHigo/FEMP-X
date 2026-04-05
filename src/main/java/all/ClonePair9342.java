package all;

public class ClonePair9342 {

    int method1(int[] n){
      int sum=0;
      for (int k=0; k < n.length; k++) {
        sum+=n[k];
      }
      return sum / n.length;
    }

    int method2(int[] dataIn){
      int mean=0;
      for (int i=0; i < dataIn.length; i++) {
        mean+=dataIn[i];
      }
      mean=mean / dataIn.length;
      return mean;
    }
}
