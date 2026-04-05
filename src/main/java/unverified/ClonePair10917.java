package unverified;

public class ClonePair10917 {

    String method1(String string,int length,String padCharacter){
      if (string == null) {
        return null;
      }
      if (padCharacter == null) {
        return null;
      }
      if (string.length() >= length) {
        return string.substring(0,length);
      }
      StringBuffer sb=new StringBuffer(string);
      while (sb.length() < length) {
        sb.insert(0,padCharacter);
      }
      return sb.toString();
    }

    String method2(String s,int length,String suffix){
      if (s == null || suffix == null) {
        return null;
      }
      if (s.length() > length) {
        s=s.substring(0,length) + suffix;
      }
      return s;
    }
}
