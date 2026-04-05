package all;

public class ClonePair7083 {

    Float method1(Object o){
      if (o == null)   return null;
      if (o instanceof Float)   return (Float)o;
      if (o instanceof Number)   return new Float(((Number)o).floatValue());
      return new Float(o.toString());
    }

    Float method2(Object value){
      if (value != null) {
        if (value instanceof Float) {
          return (Float)value;
        }
     else     if (value instanceof Number) {
          return Float.valueOf(((Number)value).floatValue());
        }
     else {
          float floatValue=Float.parseFloat(value.toString());
          return Float.valueOf(floatValue);
        }
      }
      return null;
    }
}
