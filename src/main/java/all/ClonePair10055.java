package all;

public class ClonePair10055 {

    boolean method1(char[] a,int astart,int alength,char[] b,int bstart,int blength){
      if (alength != blength) {
        return false;
      }
     else {
        for (int i=0; i < alength; i++) {
          if (a[astart + i] != b[bstart + i]) {
            return false;
          }
        }
        return true;
      }
    }

    boolean method2(char[] a,int aoff,int alen,char[] b,int boff,int blen){
      if (alen != blen)   return false;
     else {
        for (int i=0; i < alen; ++i)     if (a[aoff + i] != b[boff + i])     return false;
        return true;
      }
    }
}
