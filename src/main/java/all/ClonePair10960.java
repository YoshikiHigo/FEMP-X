package all;

public class ClonePair10960 {

    String method1(String src,int length,String end){
      if (src == null) {
        return null;
      }
      if (src.length() > length) {
        return src.substring(0,length) + end;
      }
     else {
        return src;
      }
    }

    String method2(String text,int len,String suffix){
      if (text != null) {
        if (text.length() > len) {
          return text.substring(0,len).trim() + suffix;
        }
      }
      return text;
    }
}
