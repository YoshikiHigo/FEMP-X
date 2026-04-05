package all;

public class ClonePair6905 {

    double[] method1(double[][] inArray,int outLength,int _ll,int _ul){
      double[] out=new double[outLength];
      final int lower=Math.max(0,_ll);
      final int upper=Math.min(inArray.length - 1,_ul);
      final int yul=Math.min(inArray[0].length,outLength);
      for (int i=lower; i <= upper; i++) {
        for (int j=0; j < yul; j++) {
          out[j]+=inArray[i][j];
        }
      }
      return out;
    }

    double[] method2(double[][] inArray,int outLength,int _ll,int _ul){
      final double[] out=new double[outLength];
      final int lower=Math.max(0,_ll);
      final int upper=Math.min(inArray[0].length - 1,_ul);
      final int xul=Math.min(inArray.length,outLength);
      for (int i=0; i < xul; i++) {
        for (int j=lower; j <= upper; j++) {
          out[i]+=inArray[i][j];
        }
      }
      return out;
    }
}
