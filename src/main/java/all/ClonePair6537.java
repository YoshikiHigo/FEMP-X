package all;

public class ClonePair6537 {

    float[] method1(int offa,int offb,int length,float[] a,float[] b){
      for (int i=0; i < length; i++) {
        a[offa + i]+=b[offb + i];
      }
      return a;
    }

    float[] method2(int offa,int offb,int length,float[] a,float[] b){
      for (int i=0; i < length; i++) {
        a[offa + i]-=b[offb + i];
      }
      return a;
    }
}
