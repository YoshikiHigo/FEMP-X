package all;

public class ClonePair12522 {

    int method1(String str,char[] a,int start){
      int i, d, len=str.length();
      for (i=0; i < len; i++) {
        d=str.charAt(i) - a[start + i];
        if (d != 0) {
          return d;
        }
        if (a[start + i] == 0) {
          return d;
        }
      }
      if (a[start + i] != 0) {
        return -a[start + i];
      }
      return 0;
    }

    int method2(String str,char[] a,int start){
      int i, d, len=str.length();
      for (i=0; i < len; i++) {
        d=(int)str.charAt(i) - a[start + i];
        if (d != 0)     return d;
        if (a[start + i] == 0)     return d;
      }
      if (a[start + i] != 0)   return (int)-a[start + i];
      return 0;
    }
}
