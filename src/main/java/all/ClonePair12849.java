package all;

public class ClonePair12849 {

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
      String result="";
      for (int i=0; i < s.length(); i=i + 1) {
        char ch=s.charAt(i);
        int index=from.indexOf(ch);
        if (index == -1) {
          result=result + ch;
        }
     else {
          result=result + to.charAt(index);
        }
      }
      return result;
    }
}
