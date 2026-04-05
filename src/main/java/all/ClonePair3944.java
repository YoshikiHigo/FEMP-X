package all;

public class ClonePair3944 {

    int method1(byte[] a1,byte[] a2){
      if (a1 == a2)   return 0;
      final int l1=(null == a1) ? 0 : a1.length, l2=(null == a2) ? 0 : a2.length, l=Math.min(l1,l2);
      for (int aIndex=0; aIndex < l; aIndex++) {
        final byte v1=a1[aIndex], v2=a2[aIndex];
        final int vDiff=v1 - v2;
        if (vDiff != 0)     return vDiff;
      }
      return (l1 - l2);
    }

    int method2(byte[] a1,byte[] a2){
      if (a1 == a2)   return 0;
      int len1=(a1 == null ? 0 : a1.length);
      int len2=(a2 == null ? 0 : a2.length);
      int n=Math.min(len1,len2);
      byte b1, b2;
      for (int i=0; i < n; i++) {
        b1=a1[i];
        b2=a2[i];
        if (b1 != b2)     return b1 - b2;
      }
      return len1 - len2;
    }
}
