package all;

import java.util.*;

public class ClonePair6183 {

    float[] method1(float[] a,float[] b){
      int ra=a.length;
      int rb=b.length;
      if (ra != rb) {
        System.err.println("Vector dimension do not agree.");
        return null;
      }
      float[] m=new float[ra];
      for (int i=0; i < ra; i++) {
        m[i]=a[i] + b[i];
      }
      return m;
    }

    float[] method2(float[] v1,float[] v2){
      if (v1.length != v2.length) {
        return null;
      }
      int size=v1.length;
      float[] result=new float[size];
      Arrays.fill(result,Float.NaN);
      for (int i=0; i < size; i++) {
        if (!Float.isNaN(v1[i]) && !Float.isNaN(v2[i])) {
          result[i]=v1[i] + v2[i];
        }
      }
      return result;
    }
}
