package all;

public class ClonePair12689 {

    Class method1(String primitive){
      if (primitive.equals("int"))   return int.class;
     else   if (primitive.equals("short"))   return short.class;
     else   if (primitive.equals("boolean"))   return boolean.class;
     else   if (primitive.equals("byte"))   return byte.class;
     else   if (primitive.equals("long"))   return long.class;
     else   if (primitive.equals("double"))   return double.class;
     else   if (primitive.equals("float"))   return float.class;
     else   if (primitive.equals("char"))   return char.class;
      return null;
    }

    Class method2(String className){
      if (className.equals("int")) {
        return int.class;
      }
      if (className.equals("long")) {
        return long.class;
      }
      if (className.equals("float")) {
        return float.class;
      }
      if (className.equals("double")) {
        return double.class;
      }
      if (className.equals("byte")) {
        return byte.class;
      }
      if (className.equals("boolean")) {
        return boolean.class;
      }
      if (className.equals("char")) {
        return char.class;
      }
      if (className.equals("short")) {
        return short.class;
      }
      return null;
    }
}
