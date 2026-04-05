package all;

public class ClonePair12838 {

    boolean method1(Class[] classes1,Class[] classes2){
      for (int index=0, count=classes1.length; index < count; ++index) {
        Class c1=classes1[index], c2=classes2[index];
        if (c1 == c2)     continue;
     else     if (c1.isPrimitive())     return true;
     else     if (c1.isAssignableFrom(c2))     return false;
     else     if (c2.isAssignableFrom(c1))     return true;
      }
      return false;
    }

    boolean method2(Class[] classes1,Class[] classes2){
      for (int index=0, count=classes1.length; index < count; ++index) {
        Class c1=classes1[index], c2=classes2[index];
        if (c1 == c2) {
          continue;
        }
     else     if (c1.isPrimitive()) {
          return true;
        }
     else     if (c1.isAssignableFrom(c2)) {
          return false;
        }
     else     if (c2.isAssignableFrom(c1)) {
          return true;
        }
      }
      return false;
    }
}
