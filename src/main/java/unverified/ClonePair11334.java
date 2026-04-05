package unverified;

public class ClonePair11334 {

    String method1(String s,int places){
      int j=places - s.length();
      if (j > 0) {
        StringBuffer sb=null;
        sb=new StringBuffer(j);
        for (int k=0; k < j; k++) {
          sb.append(' ');
        }
        return sb.toString() + s;
      }
     else {
        return s;
      }
    }

    String method2(String content,int count){
      StringBuffer sb=new StringBuffer();
      if (count > content.length()) {
        for (int i=count - content.length(); content.length() < count && i != 0; i--)     sb.append("0");
      }
      sb.append(content);
      return sb.toString();
    }
}
