package all;

public class ClonePair11803 {

    String method1(String src,int length){
      if (src.length() <= length) {
        return src;
      }
     else {
        String tmp=src.substring(0,length);
        tmp=tmp + "...";
        return tmp;
      }
    }

    String method2(String s,int maxLen){
      int len=s.length();
      if (len > maxLen) {
        s=s.substring(0,maxLen) + "...";
      }
      return s;
    }
}
