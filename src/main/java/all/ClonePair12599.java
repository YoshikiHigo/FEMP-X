package all;

public class ClonePair12599 {

    String method1(String text,int width){
      if (text.length() == width) {
        return text;
      }
     else   if (text.length() > width) {
        return text.substring(0,width);
      }
     else {
        StringBuffer padded=new StringBuffer(text);
        while (padded.length() < width) {
          padded.append(' ');
        }
        return padded.toString();
      }
    }

    String method2(String s,int length){
      if (s.length() < length) {
        StringBuffer str=new StringBuffer(s);
        for (int i=0; i < length - s.length(); i++) {
          str.append(" ");
        }
        s=str.toString();
      }
     else   if (s.length() > length) {
        s=s.substring(0,length);
      }
      return s;
    }
}
