package unverified;

public class ClonePair7663 {

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
}
