package unverified;

import java.util.*;

public class ClonePair5872 {

    double method1(double[] values,double q){
      if (values.length == 0) {
        return 0;
      }
      if (values.length == 1) {
        return values[0];
      }
      if (q > 1) {
        q=1;
      }
      if (q < 0) {
        q=0;
      }
      double[] vals=(double[])values.clone();
      Arrays.sort(vals);
      int ind1=(int)Math.floor((vals.length - 1) * q);
      int ind2=(int)Math.ceil((vals.length - 1) * q);
      return (vals[ind1] + vals[ind2]) / (double)2;
    }

    double method2(double[] values,double q){
      if (values.length == 0) {
        return 0;
      }
      if (values.length == 1) {
        return values[0];
      }
      if (q > 1) {
        q=1;
      }
      if (q < 0) {
        q=0;
      }
      double[] vals=(double[])values.clone();
      Arrays.sort(vals);
      int ind1=(int) Math.floor((vals.length - 1) * q);
      int ind2=(int) Math.ceil((vals.length - 1) * q);
      return (vals[ind1] + vals[ind2]) / (double)2;
    }
}
