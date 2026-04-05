package all;

public class ClonePair11001 {

    double method1(int offset,int length,float[] a){
      double res=a[offset];
      for (int i=offset + 1; i < offset + length; i++) {
        res+=a[i];
      }
      return res;
    }

    double method2(int offset,int length,float[] a){
      double res=a[offset];
      for (int i=offset + 1; i < offset + length; i++) {
        res*=a[i];
      }
      return res;
    }
}
