package unverified;

public class ClonePair4721 {

    double method1(double[] v){
      double min=v[0];
      for (int i=1; i < v.length; i++) {
        if (min > v[i]) {
          min=v[i];
        }
      }
      return (min);
    }

    double method2(double[] array){
      double min=array[0];
      for (  double d : array)   if (d < min)   min=d;
      return min;
    }
}
