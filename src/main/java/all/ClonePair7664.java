package all;

public class ClonePair7664 {

    Byte method1(String value){
      if (value != null) {
        try {
          return Byte.parseByte(value);
        }
     catch (    NumberFormatException e) {
        }
      }
      return null;
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
