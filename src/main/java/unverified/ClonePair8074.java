package unverified;

public class ClonePair8074 {

    Object method1(String data){
      try {
        if (data.charAt(data.length() - 1) == 'D') {
          return new Double(data.substring(0,data.length() - 1));
        }
      }
     catch (  NumberFormatException x) {
      }
      return null;
    }

    Object method2(String data){
      try {
        if (data.charAt(data.length() - 1) == 'F') {
          return new Float(data.substring(0,data.length() - 1));
        }
      }
     catch (  NumberFormatException x) {
      }
      return null;
    }
}
