package all;

public class ClonePair6320 {

    int method1(int[] a,int[] b){
      int len=Math.min(a.length,b.length);
      for (int i=0; i < len; i++) {
        int ai=a[i];
        int bi=b[i];
        if (ai != bi) {
          return ai < bi ? -1 : 1;
        }
      }
      return a.length - b.length;
    }

    int method2(int[] i1,int[] i2){
      int minLength=Math.min(i1.length,i2.length);
      for (int i=0; i < minLength; i++) {
        int i3=i1[i] < i2[i] ? -1 : (i1[i] == i2[i] ? 0 : 1);
        if (i3 != 0)     return i3;
      }
      return i1.length - i2.length;
    }
}
