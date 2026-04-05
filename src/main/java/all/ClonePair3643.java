package all;

public class ClonePair3643 {

    String method1(String key,String[] values){
      for (  String value : values) {
        if (value.startsWith(key)) {
          return value.split("=")[1];
        }
      }
      return null;
    }

    String method2(String string,String[] arr){
      for (  String a : arr) {
        if (a.startsWith(string))     return a.split("=")[1];
      }
      return null;
    }
}
