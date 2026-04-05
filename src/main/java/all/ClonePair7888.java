package all;

import java.util.*;

public class ClonePair7888 {

    double[] method1(double[][] inputs){
      if (inputs.length < 1) {
        return null;
      }
      if (inputs[0] == null || inputs[0].length == 0) {
        double[] res=new double[inputs.length];
        for (int i=0; i < res.length; i++) {
          res[i]=1;
        }
        return res;
      }
      double[] res=new double[inputs.length];
      for (int i=0; i < inputs.length; i++) {
        double[] array=Arrays.copyOf(inputs[i],inputs[i].length);
        Arrays.sort(array);
        res[i]=array[array.length - 1];
        for (int j=2; j <= array.length && (Double.isNaN(res[i]) || Double.isInfinite(res[i])); j++) {
          res[i]=array[array.length - j];
        }
      }
      return res;
    }

    double[] method2(double[][] inputs){
      if (inputs.length < 1) {
        return null;
      }
      if (inputs[0] == null || inputs[0].length == 0) {
        double[] res=new double[inputs.length];
        for (int i=0; i < res.length; i++) {
          res[i]=1;
        }
        return res;
      }
      double[] ranges=new double[inputs.length];
      for (int i=0; i < inputs.length; i++) {
        double[] array=Arrays.copyOf(inputs[i],inputs[i].length);
        Arrays.sort(array);
        ranges[i]=Math.abs(array[0] - array[array.length - 1]);
      }
      return ranges;
    }
}
