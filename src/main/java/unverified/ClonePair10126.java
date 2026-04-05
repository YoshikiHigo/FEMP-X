package unverified;

public class ClonePair10126 {

    Integer method1(String str){
      if (str == null) {
        return null;
      }
      return Integer.decode(str);
    }

    Integer method2(String str){
      if (str == null)   return null;
      return Integer.parseInt(str);
    }
}
