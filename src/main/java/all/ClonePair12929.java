package all;

public class ClonePair12929 {

    int[] method1(int offa,int offb,int length,int[] a,int[] b){
      for (int i=0; i < length; i++) {
        a[offa + i]+=b[offb + i];
      }
      return a;
    }

    int[] method2(int offa,int offb,int length,int[] a,int[] b){
      for (int i=0; i < length; i++) {
        a[offa + i]-=b[offb + i];
      }
      return a;
    }
}
