package unverified;

public class ClonePair3200 {

    int method1(char[] o1,char[] o2){
      final int length=o1.length < o2.length ? o1.length : o2.length;
      for (int i=0; i < length; ++i) {
        if (o1[i] > o2[i])     return 1;
     else     if (o1[i] < o2[i])     return -1;
      }
      return length < o1.length ? 1 : length < o2.length ? -1 : 0;
    }

    int method2(char[] ca1,char[] ca2){
      for (int i=0; i < ca1.length; i++) {
        if (ca2.length <= i)     break;
        if (ca1[i] < ca2[i])     return -1;
        if (ca1[i] > ca2[i])     return 1;
      }
      return ca1.length == ca2.length ? 0 : (ca1.length < ca2.length ? -1 : 1);
    }
}
