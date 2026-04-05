package unverified;

public class ClonePair12685 {

    Class method1(String name){
      if (name.equals("int")) {
        return Integer.TYPE;
      }
     else   if (name.equals("char")) {
        return Character.TYPE;
      }
     else   if (name.equals("byte")) {
        return Byte.TYPE;
      }
     else   if (name.equals("double")) {
        return Double.TYPE;
      }
     else   if (name.equals("float")) {
        return Float.TYPE;
      }
     else   if (name.equals("long")) {
        return Long.TYPE;
      }
     else   if (name.equals("short")) {
        return Short.TYPE;
      }
     else   if (name.equals("boolean")) {
        return Boolean.TYPE;
      }
     else {
        return null;
      }
    }

    Class method2(String primitive){
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
}
