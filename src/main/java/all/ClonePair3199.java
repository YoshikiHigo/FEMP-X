package all;

public class ClonePair3199 {

    int method1(char[] o1,char[] o2){
      final int length=o1.length < o2.length ? o1.length : o2.length;
      for (int i=0; i < length; ++i) {
        if (o1[i] > o2[i])     return 1;
     else     if (o1[i] < o2[i])     return -1;
      }
      return length < o1.length ? 1 : length < o2.length ? -1 : 0;
    }

    int method2(char[] o1,char[] o2){
      if (o1.length < o2.length)   return -1;
      if (o2.length < o1.length)   return 1;
      for (int i=o1.length - 1; i >= 0; --i) {
        if (o1[i] > o2[i])     return 1;
     else     if (o1[i] < o2[i])     return -1;
      }
      return 0;
    }
}
