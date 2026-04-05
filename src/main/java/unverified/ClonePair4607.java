package unverified;

public class ClonePair4607 {

    double method1(double[] values){
      double min=values[0];
      for (int f=0; f < values.length; f++)   if (values[f] < min)   min=values[f];
      return min;
    }

    double method2(double[] array){
      double min=array[0];
      for (  double d : array)   if (d < min)   min=d;
      return min;
    }
}
