package all;

public class ClonePair12851 {

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

    String method2(String source,String toBeReplaced,String replacement){
      StringBuffer results=new StringBuffer();
      int len=toBeReplaced.length();
      for (int i=0; i < source.length(); ++i) {
        if (source.regionMatches(false,i,toBeReplaced,0,len)) {
          results.append(replacement);
          i+=len - 1;
        }
     else {
          results.append(source.charAt(i));
        }
      }
      return results.toString();
    }
}
