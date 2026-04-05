package all;

public class ClonePair3186 {

    short[] method1(int offset,int length,short[] a,short alpha){
      for (int i=offset; i < offset + length; i++) {
        a[i]+=alpha;
      }
      return a;
    }

    short[] method2(int offset,int length,short[] a,short alpha){
      for (int i=offset; i < offset + length; i++) {
        a[i]*=alpha;
      }
      return a;
    }
}
