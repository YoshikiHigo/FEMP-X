package all;

public class ClonePair11793 {

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

    String method2(String toTruncate,int maxLength){
      if (toTruncate.length() > maxLength) {
        return toTruncate.substring(0,maxLength) + "...";
      }
     else {
        return toTruncate;
      }
    }
}
