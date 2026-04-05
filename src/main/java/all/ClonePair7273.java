package all;

public class ClonePair7273 {

    boolean method1(ClassLoader loader1,ClassLoader loader2){
      if (loader1 == loader2) {
        return true;
      }
      if (loader2 == null) {
        return false;
      }
      if (loader1 == null) {
        return true;
      }
      for (; loader2 != null; loader2=loader2.getParent()) {
        if (loader2 == loader1) {
          return true;
        }
      }
      return false;
    }

    boolean method2(ClassLoader source,ClassLoader compare){
      if (source == compare) {
        return true;
      }
      if (compare == null) {
        return false;
      }
      if (source == null) {
        return true;
      }
      while (null != compare) {
        compare=compare.getParent();
        if (source == compare) {
          return true;
        }
      }
      return false;
    }
}
