package unverified;

public class ClonePair12837 {

    boolean method1(Class[] paramTypes,Class[] argTypes){
      if (paramTypes.length != argTypes.length)   return false;
      for (int i=0; i < argTypes.length; i++) {
        if (!paramTypes[i].isAssignableFrom(argTypes[i]))     return false;
      }
      return true;
    }

    boolean method2(Class[] leftargs,Class[] rightargs){
      boolean equals=false;
      if (leftargs.length == rightargs.length) {
        equals=true;
        for (byte i=0; i < rightargs.length; i++) {
          if (!rightargs[i].getName().equals(leftargs[i].getName())) {
            equals=false;
            break;
          }
     else {
            equals=true;
          }
        }
      }
      return equals;
    }
}
