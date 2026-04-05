package all;

public class ClonePair12834 {

    boolean method1(Class[] constructorTypes,Class[] paramTypes){
      if (constructorTypes.length != paramTypes.length)   return false;
      boolean compatible=true;
      for (int i=0; i < constructorTypes.length && compatible; i++)   if (!constructorTypes[i].isAssignableFrom(paramTypes[i]))   compatible=false;
      return compatible;
    }

    boolean method2(Class[] paramTypes,Class[] argTypes){
      if (paramTypes.length != argTypes.length)   return false;
      for (int i=0; i < argTypes.length; i++) {
        if (!paramTypes[i].isAssignableFrom(argTypes[i]))     return false;
      }
      return true;
    }
}
