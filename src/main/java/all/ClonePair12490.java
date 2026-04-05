package all;

public class ClonePair12490 {

    int method1(int offset,int length,short[] a){
      int res=a[offset];
      for (int i=offset + 1; i < offset + length; i++) {
        res+=a[i];
      }
      return res;
    }

    int method2(int offset,int length,short[] a){
      int res=a[offset];
      for (int i=offset + 1; i < offset + length; i++) {
        res*=a[i];
      }
      return res;
    }
}
