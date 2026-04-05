package all;

public class ClonePair8073 {

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
        if (data.charAt(data.length() - 1) == 'I') {
          return new Integer(data.substring(0,data.length() - 1));
        }
      }
     catch (  NumberFormatException x) {
      }
      return null;
    }
}
