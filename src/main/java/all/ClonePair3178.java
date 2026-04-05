package all;

public class ClonePair3178 {

    int method1(Object a,Object b){
      String sa=(String)a;
      String sb=(String)b;
      int alen=sa.length();
      int blen=sb.length();
      int mlen=Math.min(alen,blen);
      for (int i=0; i < mlen; i++) {
        char ca=sa.charAt(i);
        char cb=sb.charAt(i);
        if (ca == '*') {
          if (cb != '*') {
            return 1;
          }
        }
     else     if (cb == '*') {
          return -1;
        }
     else     if (ca < cb) {
          return -1;
        }
     else     if (ca > cb) {
          return 1;
        }
      }
      if (alen < blen) {
        return 1;
      }
     else   if (alen > blen) {
        return -1;
      }
      return 0;
    }

    int method2(Object o1,Object o2){
      long l1=((String)o1).length(), l2=((String)o2).length(), c=Math.max(l1,l2);
      String s1=(String)o1, s2=(String)o2;
      if (!s1.endsWith("/*"))   l1*=c;
      if (!s2.endsWith("/*"))   l2*=c;
      if (!s1.startsWith("*"))   l1*=c * 2;
      if (!s2.startsWith("*"))   l2*=c * 2;
      if (l2 != l1)   return (int)((l2 - l1) / Math.abs(l2 - l1));
     else   return s1.compareTo(s2);
    }
}
