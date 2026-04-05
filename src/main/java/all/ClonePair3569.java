package all;

public class ClonePair3569 {

    Double method1(Object value){
      try {
        if (value instanceof Double) {
          return (Double)value;
        }
     else     if (value instanceof String) {
          return new Double(Double.parseDouble((String)value));
        }
        return null;
      }
     catch (  RuntimeException ex) {
        return null;
      }
    }

    Double method2(Object value){
      Double d=null;
      if (value instanceof Double) {
        d=(Double)value;
      }
     else   if (value instanceof String) {
        try {
          d=Double.valueOf((String)value);
        }
     catch (    Exception ex) {
        }
      }
     else   if (value != null) {
        try {
          d=Double.valueOf(value.toString());
        }
     catch (    Exception ex) {
        }
      }
      return d;
    }
}
