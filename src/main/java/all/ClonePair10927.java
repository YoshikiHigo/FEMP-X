package all;

public class ClonePair10927 {

    String method1(String string,int numChars,String trailer){
      if (string.length() > numChars) {
        String result=string.substring(0,numChars);
        return result + trailer;
      }
     else {
        return string;
      }
    }

    String method2(String source,int maxLength,String ellipses){
      if (source.length() > maxLength) {
        return source.substring(0,maxLength) + ellipses;
      }
      return source;
    }
}
