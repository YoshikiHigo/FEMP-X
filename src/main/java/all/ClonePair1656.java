package all;

public class ClonePair1656 {

    Integer method1(Object value){
      if (value instanceof Integer) {
        return (Integer)value;
      }
     else   if (value instanceof String) {
        try {
          return Integer.parseInt((String)value);
        }
     catch (    NumberFormatException e) {
          return null;
        }
      }
     else {
        return null;
      }
    }

    Integer method2(Object value){
      Integer retVal=null;
      if (value == null)   return null;
      if (value instanceof Integer)   return (Integer)value;
      Class c=value.getClass();
      if (c.getSuperclass() == Number.class)   return new Integer(((Number)value).intValue());
      if (value instanceof String)   try {
        retVal=new Integer(Integer.parseInt((String)value));
      }
     catch (  NumberFormatException e) {
      }
      return retVal;
    }
}
