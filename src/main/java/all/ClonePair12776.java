package all;

public class ClonePair12776 {

    String method1(String src,String ori,String tar){
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

    String method2(String text,String fromText,String toText){
      if (text == null || fromText == null || toText == null) {
        return null;
      }
      final StringBuffer buf=new StringBuffer(128);
      int pos=0;
      int pos2=0;
      while (true) {
        pos=text.indexOf(fromText,pos2);
        if (pos == 0) {
          buf.append(toText);
          pos2=fromText.length();
        }
     else     if (pos > 0) {
          buf.append(text.substring(pos2,pos));
          buf.append(toText);
          pos2=pos + fromText.length();
        }
     else {
          buf.append(text.substring(pos2));
          break;
        }
      }
      return buf.toString();
    }
}
