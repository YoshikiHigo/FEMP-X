package all;

public class ClonePair5464 {

    long[] method1(int offa,int offb,int length,long[] a,long[] b){
      for (int i=0; i < length; i++) {
        a[offa + i]+=b[offb + i];
      }
      return a;
    }

    long[] method2(int offa,int offb,int length,long[] a,long[] b){
      for (int i=0; i < length; i++) {
        a[offa + i]-=b[offb + i];
      }
      return a;
    }
}
