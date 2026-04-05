package unverified;

public class ClonePair12835 {

    boolean method1(Class[] constructorTypes,Class[] paramTypes){
      if (constructorTypes.length != paramTypes.length)   return false;
      boolean compatible=true;
      for (int i=0; i < constructorTypes.length && compatible; i++)   if (!constructorTypes[i].isAssignableFrom(paramTypes[i]))   compatible=false;
      return compatible;
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
