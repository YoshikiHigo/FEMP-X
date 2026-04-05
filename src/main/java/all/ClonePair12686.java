package all;

public class ClonePair12686 {

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
