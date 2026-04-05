package all;

public class ClonePair8756 {

    float[] method1(float[] array,int start){
      int nl=array.length - start;
      float[] ret=new float[nl];
      for (int q=start; q < array.length; q++) {
        ret[q - start]=array[q];
      }
      return ret;
    }

    float[] method2(float[] v,int start){
      float[] r=new float[v.length - start];
      for (int i=start; i < r.length; i++)   r[i - start]=v[i];
      return r;
    }
}
