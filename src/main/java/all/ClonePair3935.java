package all;

public class ClonePair3935 {

    double method1(boolean[] b,int offset,int length,double min,double max){
      double sum=0.0;
      for (int i=0, o=offset; i < length; i++, o++) {
        sum+=(b[o] ? 1.0 : 0.0) * Math.pow(2.0,i);
      }
      double div=(max - min) / (Math.pow(2,length) - 1);
      return min + div * sum;
    }

    double method2(boolean[] b,int offset,int length,double min,double max){
      double sum=0.0;
      for (int i=0; i < length; i++) {
        double mod=0.0;
        for (int j=0, o=offset; j <= i; j++, o++) {
          mod+=(b[o] ? 1.0 : 0.0);
        }
        sum+=(mod % 2) * Math.pow(2.0,i);
      }
      double div=(max - min) / (Math.pow(2,length) - 1);
      return min + div * sum;
    }
}
