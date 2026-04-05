package all;

public class ClonePair4464 {

    double method1(double[] polje){
      if (polje.length == 0)   return 0;
      double zbroj=0;
      for (int i=0; i < polje.length; i++) {
        zbroj+=polje[i];
      }
      return zbroj / polje.length;
    }

    double method2(double[] values){
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
}
