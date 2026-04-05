package all;

public class ClonePair7969 {

    boolean method1(String str,String segment){
      if ((str == null) || (segment == null))   return false;
      if (segment.length() == 0)   return true;
      return str.indexOf(segment) >= 0;
    }

    boolean method2(String str,String searchStr){
      if (str == null || searchStr == null) {
        return false;
      }
      return str.indexOf(searchStr) >= 0;
    }
}
