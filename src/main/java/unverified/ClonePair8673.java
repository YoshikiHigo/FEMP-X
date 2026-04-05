package unverified;

public class ClonePair8673 {

    int method1(String content,int fromIndex){
      while (fromIndex < content.length() && Character.isWhitespace(content.charAt(fromIndex))) {
        ++fromIndex;
      }
      return fromIndex;
    }

    int method2(String rawdata,int i){
      int length=rawdata.length();
      if (i < length) {
        char c=rawdata.charAt(i);
        while ((i < length) && Character.isWhitespace(c)) {
          ++i;
          c=rawdata.charAt(i);
        }
      }
      return i;
    }
}
