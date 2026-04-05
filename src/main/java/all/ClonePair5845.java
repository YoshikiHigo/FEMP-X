package all;

public class ClonePair5845 {

    boolean method1(byte[] a1,int offs1,byte[] a2,int offs2,int num){
      while (num-- > 0) {
        if (a1[offs1++] != a2[offs2++]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] a1,int offs1,byte[] a2,int offs2,int num){
      int index1=offs1;
      int index2=offs2;
      int count=num;
      while (count-- > 0) {
        if (a1[index1++] != a2[index2++]) {
          return false;
        }
      }
      return true;
    }
}
