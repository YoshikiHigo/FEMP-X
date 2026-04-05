package all;

public class ClonePair12853 {

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

    String method2(String src,String from,String to){
      StringBuffer sb=new StringBuffer(src);
      int i1, i2, tail;
      int len=from.length();
      int fromIndex=0;
      while ((i1=src.indexOf(from,fromIndex)) != -1) {
        i2=i1 + len;
        tail=src.length() - i2;
        sb=sb.replace(i1,i2,to);
        src=new String(sb);
        fromIndex=src.length() - tail;
      }
      return new String(sb);
    }
}
