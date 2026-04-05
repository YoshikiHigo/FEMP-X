package all;

public class ClonePair6610 {

    double method1(double[] array,int firstIdx,int lastIdx){
      double sum=0.0;
      for (int i=firstIdx; i <= lastIdx; i++)   sum+=array[i];
      return sum / (double)(lastIdx - firstIdx + 1);
    }

    double method2(double[] array,int firstIdx,int lastIdx){
      double sum=0.0;
      for (int i=firstIdx; i <= lastIdx; i++) {
        sum+=array[i];
      }
      return sum / (lastIdx - firstIdx + 1);
    }
}
