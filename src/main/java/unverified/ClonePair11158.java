package unverified;

public class ClonePair11158 {

    boolean method1(Class formal,Class actual){
      if (actual == null && !formal.isPrimitive()) {
        return true;
      }
      if (actual != null && formal.isAssignableFrom(actual)) {
        return true;
      }
      if (formal.isPrimitive()) {
        if (formal == Boolean.TYPE && actual == Boolean.class) {
          return true;
        }
        if (formal == Character.TYPE && actual == Character.class) {
          return true;
        }
        if (formal == Byte.TYPE && actual == Byte.class) {
          return true;
        }
        if (formal == Short.TYPE && (actual == Short.class || actual == Byte.class)) {
          return true;
        }
        if (formal == Integer.TYPE && (actual == Integer.class || actual == Short.class || actual == Byte.class)) {
          return true;
        }
        if (formal == Long.TYPE && (actual == Long.class || actual == Integer.class || actual == Short.class || actual == Byte.class)) {
          return true;
        }
        if (formal == Float.TYPE && (actual == Float.class || actual == Long.class || actual == Integer.class || actual == Short.class || actual == Byte.class)) {
          return true;
        }
        if (formal == Double.TYPE && (actual == Double.class || actual == Float.class || actual == Long.class || actual == Integer.class || actual == Short.class || actual == Byte.class)) {
          return true;
        }
      }
      return false;
    }

    boolean method2(Class formal,Class actual){
      if (actual == null && !formal.isPrimitive()) {
        return true;
      }
      if (actual != null && formal.isAssignableFrom(actual)) {
        return true;
      }
      if (formal.isPrimitive()) {
        if (formal == Boolean.TYPE && actual == Boolean.class)     return true;
        if (formal == Character.TYPE && actual == Character.class)     return true;
        if (formal == Byte.TYPE && actual == Byte.class)     return true;
        if (formal == Short.TYPE && (actual == Short.class || actual == Byte.class))     return true;
        if (formal == Integer.TYPE && (actual == Integer.class || actual == Short.class || actual == Byte.class))     return true;
        if (formal == Long.TYPE && (actual == Long.class || actual == Integer.class || actual == Short.class || actual == Byte.class))     return true;
        if (formal == Float.TYPE && (actual == Float.class || actual == Long.class || actual == Integer.class || actual == Short.class || actual == Byte.class))     return true;
        if (formal == Double.TYPE && (actual == Double.class || actual == Float.class || actual == Long.class || actual == Integer.class || actual == Short.class || actual == Byte.class))     return true;
      }
      return false;
    }
}
