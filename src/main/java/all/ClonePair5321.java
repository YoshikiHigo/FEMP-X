package all;

public class ClonePair5321 {

    short[] method1(int offa,int offb,int length,short[] a,short[] b){
      for (int i=0; i < length; i++) {
        a[offa + i]+=b[offb + i];
      }
      return a;
    }

    short[] method2(int offa,int offb,int length,short[] a,short[] b){
      for (int i=0; i < length; i++) {
        a[offa + i]-=b[offb + i];
      }
      return a;
    }
}
