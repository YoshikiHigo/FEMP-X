package all;

public class ClonePair12727 {

    String method1(String text,int maxLength){
      if (text.length() > maxLength) {
        return text.substring(0,maxLength - 3) + "...";
      }
      return text;
    }

    String method2(String string,int cutOff){
      if (string.length() > cutOff) {
        StringBuffer sb=new StringBuffer(string.substring(0,cutOff - 3));
        sb.append("...");
        return sb.toString();
      }
      return string;
    }
}
