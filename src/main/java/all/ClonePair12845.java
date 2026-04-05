package all;

public class ClonePair12845 {

    String method1(String input,String from,String to){
      assert from.length() == to.length();
      StringBuilder sb=null;
      int len=input.length();
      for (int i=0; i < len; i++) {
        int ind=from.indexOf(input.charAt(i));
        if (ind >= 0) {
          if (sb == null) {
            sb=new StringBuilder(input);
          }
          sb.setCharAt(i,to.charAt(ind));
        }
      }
      if (sb == null) {
        return input;
      }
     else {
        return sb.toString();
      }
    }

    String method2(String s,String from,String to){
      StringBuffer sNew=null;
      for (int i=0; i < s.length(); ++i) {
        int t=from.indexOf(s.charAt(i));
        if (t != -1) {
          if (sNew == null)       sNew=new StringBuffer(s);
          sNew.setCharAt(i,to.charAt(t));
        }
      }
      return sNew == null ? s : sNew.toString();
    }
}
