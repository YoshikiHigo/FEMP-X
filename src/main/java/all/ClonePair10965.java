package all;

public class ClonePair10965 {

    boolean method1(Class c,Object o){
      if (c.isInstance(o)) {
        return true;
      }
     else   if (o == null) {
        return true;
      }
     else   if (c.isPrimitive()) {
        return (c == Boolean.TYPE && Boolean.class.isInstance(o) || c == Character.TYPE && Character.class.isInstance(o) || c == Byte.TYPE && Byte.class.isInstance(o) || c == Short.TYPE && Short.class.isInstance(o) || c == Integer.TYPE && Integer.class.isInstance(o) || c == Long.TYPE && Long.class.isInstance(o) || c == Float.TYPE && Float.class.isInstance(o) || c == Double.TYPE && Double.class.isInstance(o));
      }
      return false;
    }

    boolean method2(Class type,Object value){
      if (value == null || type.isInstance(value)) {
        return true;
      }
     else   if (type.isPrimitive()) {
        if (value instanceof Boolean && Boolean.TYPE.equals(type)) {
          return true;
        }
        if (value instanceof Byte && Byte.TYPE.equals(type)) {
          return true;
        }
        if (value instanceof Short && Short.TYPE.equals(type)) {
          return true;
        }
        if (value instanceof Integer && Integer.TYPE.equals(type)) {
          return true;
        }
        if (value instanceof Long && Long.TYPE.equals(type)) {
          return true;
        }
        if (value instanceof Float && Float.TYPE.equals(type)) {
          return true;
        }
        if (value instanceof Double && Double.TYPE.equals(type)) {
          return true;
        }
        if (value instanceof Character && Character.TYPE.equals(type)) {
          return true;
        }
        return false;
      }
     else {
        return false;
      }
    }
}
