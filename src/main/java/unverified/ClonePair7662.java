package unverified;

public class ClonePair7662 {

    Byte method1(String s){
      if (s == null)   return null;
      Byte rval;
      try {
        rval=new Byte(s);
      }
     catch (  NumberFormatException e) {
        return null;
      }
      return rval;
    }

    Byte method2(String value){
      if (value != null) {
        try {
          return Byte.parseByte(value);
        }
     catch (    NumberFormatException e) {
        }
      }
      return null;
    }
}
