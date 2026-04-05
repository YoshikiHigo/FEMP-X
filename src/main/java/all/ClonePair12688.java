package all;

public class ClonePair12688 {

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
