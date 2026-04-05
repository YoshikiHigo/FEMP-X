package all;

public class ClonePair7085 {

    Float method1(Object value){
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

    Float method2(Object value){
      if (value == null) {
        return null;
      }
      if (value instanceof Float) {
        return (Float)value;
      }
      if (value instanceof Number) {
        return Float.valueOf(((Number)value).floatValue());
      }
      return Float.valueOf(value.toString());
    }
}
