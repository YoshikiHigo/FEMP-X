package all;

public class ClonePair5175 {

    boolean method1(String pattern,float value){
      try {
        if (pattern.startsWith("<=")) {
          String number=pattern.substring(2);
          return value <= Float.parseFloat(number);
        }
        if (pattern.startsWith("<")) {
          String number=pattern.substring(1);
          return value < Float.parseFloat(number);
        }
        if (pattern.startsWith(">=")) {
          String number=pattern.substring(2);
          return value >= Float.parseFloat(number);
        }
        if (pattern.startsWith(">")) {
          String number=pattern.substring(1);
          return value > Float.parseFloat(number);
        }
        if (pattern.startsWith("!=")) {
          String number=pattern.substring(2);
          return value != Float.parseFloat(number);
        }
        if (pattern.startsWith("==")) {
          String number=pattern.substring(2);
          return value == Float.parseFloat(number);
        }
        if (pattern.contains(";")) {
          String[] floats=pattern.split(";");
          return Float.parseFloat(floats[0]) < value && value < Float.parseFloat(floats[1]);
        }
      }
     catch (  Exception ex) {
        ex.printStackTrace();
        return false;
      }
      return false;
    }

    boolean method2(String pattern,float value){
      try {
        if (pattern.startsWith("<=")) {
          String number=pattern.substring(2);
          return value <= Float.parseFloat(number);
        }
        if (pattern.startsWith("<")) {
          String number=pattern.substring(1);
          return value < Float.parseFloat(number);
        }
        if (pattern.startsWith(">=")) {
          String number=pattern.substring(2);
          return value >= Float.parseFloat(number);
        }
        if (pattern.startsWith(">")) {
          String number=pattern.substring(1);
          return value > Float.parseFloat(number);
        }
        if (pattern.startsWith("!=")) {
          String number=pattern.substring(2);
          return value != Float.parseFloat(number);
        }
        if (pattern.startsWith("==")) {
          String number=pattern.substring(2);
          return value == Float.parseFloat(number);
        }
        if (pattern.contains(";")) {
          String[] integers=pattern.split(";");
          return Float.parseFloat(integers[0]) < value && value < Float.parseFloat(integers[1]);
        }
      }
     catch (  Exception ex) {
        return false;
      }
      return false;
    }
}
