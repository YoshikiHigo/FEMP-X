package unverified;

public class ClonePair12232 {

    String method1(String content,String oldWord,String newWord){
      if ((content == null) || (oldWord == null) || (newWord == null)) {
        return null;
      }
      String tempString=new String(content);
      int position=tempString.indexOf(oldWord);
      while (position > -1) {
        tempString=tempString.substring(0,position) + newWord + tempString.substring(position + oldWord.length());
        position=tempString.indexOf(oldWord,position + newWord.length());
      }
      return tempString;
    }

    String method2(String src,String ori,String tar){
      String result=null;
      if (src != null && ori != null && tar != null) {
        try {
          StringBuffer source=new StringBuffer(src);
          int appearedIndex=0;
          int oriLength=ori.length();
          int tarLength=tar.length();
          int byPassingIndex=0;
          while (source.indexOf(ori,byPassingIndex) != -1) {
            appearedIndex=source.indexOf(ori,byPassingIndex);
            if (ori.equals(source.substring(appearedIndex,appearedIndex + oriLength))) {
              source=source.replace(appearedIndex,appearedIndex + oriLength,tar);
              byPassingIndex=appearedIndex + tarLength;
            }
     else {
              byPassingIndex=appearedIndex;
            }
          }
          result=source.toString();
        }
     catch (    Exception e) {
          e.printStackTrace();
        }
      }
      return result;
    }
}
