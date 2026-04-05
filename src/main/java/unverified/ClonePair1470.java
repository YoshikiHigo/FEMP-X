package unverified;

public class ClonePair1470 {

    int method1(Object value){
      try {
        if (value == null) {
          return 0;
        }
     else     if (value instanceof Integer) {
          return (Integer)value;
        }
     else     if (value instanceof Long) {
          long v=(Long)value;
          if (v > Integer.MAX_VALUE || v < Integer.MIN_VALUE) {
            return 0;
          }
     else {
            return (int)v;
          }
        }
     else     if (value instanceof Double) {
          double v=(Double)value;
          if (v > Integer.MAX_VALUE || v < Integer.MIN_VALUE) {
            return 0;
          }
     else {
            return (int)v;
          }
        }
     else     if (value instanceof Number) {
          return ((Number)value).intValue();
        }
     else     if (value instanceof String) {
          if (((String)value).length() == 0) {
            return 0;
          }
     else {
            return Integer.parseInt((String)value);
          }
        }
     else     if (value instanceof Boolean) {
          if ((Boolean)value) {
            return 1;
          }
     else {
            return 0;
          }
        }
     else     return 0;
      }
     catch (  Exception e) {
        return 0;
      }
    }

    int method2(Object aValue){
      int out=0;
      if (aValue == null)   return out;
      if (aValue instanceof Integer) {
        try {
          Integer i=(Integer)aValue;
          out=i.intValue();
        }
     catch (    Exception ex) {
        }
      }
     else   if (aValue instanceof String) {
        String s=(String)aValue;
        if (s.length() > 0) {
          try {
            out=Integer.parseInt(s);
          }
     catch (      Exception ex) {
          }
        }
      }
      return out;
    }
}
