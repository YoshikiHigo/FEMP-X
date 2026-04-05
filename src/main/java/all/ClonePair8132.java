package all;

public class ClonePair8132 {

    double[] method1(double[] in,int lb1,int ub1){
      double out[]=new double[ub1 - lb1 + 1];
      for (int i=0; i < out.length; i++) {
        out[i]=in[lb1 + i];
      }
      return out;
    }

    double[] method2(double[] vec,int start,int end){
      double[] x=new double[end - start + 1];
      for (int i=0; i <= end - start; i++) {
        x[i]=vec[start + i];
      }
      return x;
    }
}
