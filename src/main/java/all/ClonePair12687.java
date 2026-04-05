package all;

public class ClonePair12687 {

    Class method1(String type){
      if (type.equals("boolean")) {
        return Boolean.TYPE;
      }
     else   if (type.equals("byte")) {
        return Byte.TYPE;
      }
     else   if (type.equals("char")) {
        return Character.TYPE;
      }
     else   if (type.equals("short")) {
        return Short.TYPE;
      }
     else   if (type.equals("int")) {
        return Integer.TYPE;
      }
     else   if (type.equals("long")) {
        return Long.TYPE;
      }
     else   if (type.equals("float")) {
        return Float.TYPE;
      }
     else   if (type.equals("double")) {
        return Double.TYPE;
      }
      return null;
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
