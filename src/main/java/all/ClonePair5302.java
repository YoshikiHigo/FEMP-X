package all;

public class ClonePair5302 {

    int method1(char[] a,int start){
      int len=0;
      for (int i=start; i < a.length && a[i] != 0; i++) {
        len++;
      }
      return len;
    }

    int method2(char[] a,int start){
      int len=0;
      for (int i=start; i < a.length && a[i] != 0; i++)   len++;
      return len;
    }
}
