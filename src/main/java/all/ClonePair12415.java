package all;

public class ClonePair12415 {

    String method1(String content,int length){
      if (null != content && !"".equals(content)) {
        if (content.length() > length) {
          content=content.substring(0,length) + "...";
        }
        return content;
      }
     else {
        return "";
      }
    }

    String method2(String str,int len){
      if (str == null || str.trim().equals(""))   return "";
      if (str.length() <= len)   return str;
     else   return str.substring(0,len) + "...";
    }
}
