package all;

public class ClonePair7666 {

    Byte method1(String value){
      if (value == null) {
        return null;
      }
      try {
        return new Byte(value);
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }

    Byte method2(String s){
      try {
        if (s != null) {
          return Byte.decode(s);
        }
     else {
          return null;
        }
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }
}
