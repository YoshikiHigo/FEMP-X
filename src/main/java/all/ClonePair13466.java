package all;

public class ClonePair13466 {

    String method1(String s,String what,String onWhat){
      if (s == null) {
        return null;
      }
      String res;
      int i;
      i=s.lastIndexOf(what);
      if (i < 0) {
        return s;
      }
      res=s.substring(0,i) + onWhat + s.substring(i + what.length());
      return res;
    }

    String method2(String value,String oldKeySubstring,String newKeySubstring){
      if (value == null) {
        return null;
      }
      int oldKeySubstringSize=oldKeySubstring.length();
      while (true) {
        int index=value.indexOf(oldKeySubstring);
        if (index == -1) {
          break;
        }
        value=value.substring(0,index) + newKeySubstring + value.substring(index + oldKeySubstringSize);
      }
      return value;
    }
}
