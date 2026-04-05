package all;

public class ClonePair3609 {

    boolean method1(int[] a,int[] b){
      if (a == null) {
        return true;
      }
      int len=b.length;
      if (a.length != len) {
        return true;
      }
      for (int i=0; i < len; i++) {
        if (a[i] != b[i]) {
          return true;
        }
      }
      return false;
    }

    boolean method2(int[] iaOld,int[] iaNew){
      boolean bRet=false;
      if ((null != iaOld) && (iaOld.length == iaNew.length)) {
        for (int i=0; i < iaNew.length; i++) {
          if (iaNew[i] != iaOld[i]) {
            bRet=true;
            break;
          }
        }
      }
     else {
        bRet=true;
      }
      return bRet;
    }
}
