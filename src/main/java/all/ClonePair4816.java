package all;

public class ClonePair4816 {

    double method1(double[] values){
      int len=values.length;
      if (len > 0) {
        double sum=0;
        for (    double v : values) {
          sum+=v;
        }
        return sum / len;
      }
     else {
        return 0;
      }
    }

    double method2(double[] distData){
      double sumX=0;
      if (distData.length == 0)   return (0);
     else   sumX=distData[0];
      for (int i=1; i < distData.length; i++)   sumX+=distData[i];
      double result=(sumX / distData.length);
      return result;
    }
}
