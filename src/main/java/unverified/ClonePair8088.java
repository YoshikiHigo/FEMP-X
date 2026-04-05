package unverified;

public class ClonePair8088 {

    boolean method1(String str,String searchStr){
      if (str == null || searchStr == null) {
        return false;
      }
      return str.indexOf(searchStr) >= 0;
    }

    boolean method2(String str,String searchStr){
      if ((str == null) || (searchStr == null)) {
        return false;
      }
      return str.indexOf(searchStr) >= 0;
    }
}
