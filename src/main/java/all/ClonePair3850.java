package all;

public class ClonePair3850 {

    double method1(double[] x1,double[] x2){
      int counter=0;
      double sum1=0.0;
      double sum2=0.0;
      double sumS1=0.0;
      double sumS2=0.0;
      for (int i=0; i < x1.length; i++) {
        sum1=sum1 + x1[i];
        sum2=sum2 + x2[i];
        counter++;
      }
      double mean1=sum1 / counter;
      double mean2=sum2 / counter;
      double sum=0.0;
      counter=0;
      for (int i=0; i < x1.length; i++) {
        sum=sum + (x1[i] - mean1) * (x2[i] - mean2);
        sumS1=sumS1 + (x1[i] - mean1) * (x1[i] - mean1);
        sumS2=sumS2 + (x2[i] - mean2) * (x2[i] - mean2);
        counter++;
      }
      return sum / Math.sqrt(sumS1 * sumS2);
    }

    double method2(double[] input1,double[] input2){
      double correlation=-2;
      double xy, x, y, x2, y2;
      xy=x=y=x2=y2=0;
      for (int i=0; i < input1.length; i++) {
        xy+=input1[i] * input2[i];
        x+=input1[i];
        y+=input2[i];
        x2+=input1[i] * input1[i];
        y2+=input2[i] * input2[i];
      }
      correlation=xy - x * (y / input1.length);
      correlation/=Math.sqrt(x2 - x * (x / input1.length));
      correlation/=Math.sqrt(y2 - y * (y / input1.length));
      return correlation;
    }
}
