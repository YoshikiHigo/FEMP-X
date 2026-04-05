package all;

public class ClonePair3849 {

    double method1(double[] doubleArray,double[] d2Array){
      double temp=0;
      double sum=0;
      for (int i=0; i < doubleArray.length; i++) {
        temp=doubleArray[i] - d2Array[i];
        if (temp < 0) {
          sum-=temp;
        }
     else {
          sum+=temp;
        }
      }
      return sum;
    }

    double method2(double[] value1,double[] value2){
      double sum=0.0;
      int counter=0;
      for (int i=0; i < value1.length; i++) {
        if ((!Double.isNaN(value1[i])) && (!Double.isNaN(value2[i]))) {
          sum=sum + Math.abs(value1[i] - value2[i]);
          counter++;
        }
      }
      double d=sum;
      if (counter > 0)   return d;
     else   return Double.NaN;
    }
}
