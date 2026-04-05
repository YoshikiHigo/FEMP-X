package all;

public class ClonePair3801 {

    double[] method1(int offa,int offb,int length,double[] a,double[] b){
      for (int i=0; i < length; i++) {
        a[offa + i]-=b[offb + i];
      }
      return a;
    }

    double[] method2(int offa,int offb,int length,double[] a,double[] b){
      for (int i=0; i < length; i++) {
        a[offa + i]+=b[offb + i];
      }
      return a;
    }
}
