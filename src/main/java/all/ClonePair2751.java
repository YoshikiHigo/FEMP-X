package all;

public class ClonePair2751 {

    boolean method1(StackTraceElement[] a,StackTraceElement[] b){
      if (a == null) {
        return false;
      }
      if (a.length != b.length) {
        return false;
      }
      for (int i=0; i < a.length; ++i) {
        if (a[i].equals(b[i]) == false) {
          return false;
        }
      }
      return true;
    }

    boolean method2(StackTraceElement[] a,StackTraceElement[] b){
      if (a == null) {
        return false;
      }
      if (a.length != b.length) {
        return false;
      }
      for (int i=0; i < a.length; ++i) {
        if (!a[i].equals(b[i])) {
          return false;
        }
      }
      return true;
    }
}
