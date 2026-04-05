package all;

public class ClonePair12860 {

    String method1(String StringIn,int MaxLength){
      if (StringIn == null || StringIn.length() <= MaxLength) {
        return StringIn;
      }
     else {
        return StringIn.substring(0,MaxLength);
      }
    }

    String method2(String text,int beginTextLenghth){
      if (text == null) {
        return null;
      }
      String inputText=text.trim();
      String beginText=inputText;
      if (inputText.length() > beginTextLenghth) {
        beginText=text.substring(0,beginTextLenghth);
      }
      return beginText;
    }
}
