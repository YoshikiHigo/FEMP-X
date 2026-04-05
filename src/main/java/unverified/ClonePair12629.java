package unverified;

public class ClonePair12629 {

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

    String method2(String s,int desiredLength){
      int len=s.length();
      if (len == desiredLength)   return s;
      if (len > desiredLength)   return s.substring(0,desiredLength);
      StringBuffer sb=new StringBuffer(s);
      for (int i=len; i < desiredLength; i++)   sb.append(' ');
      return sb.toString();
    }
}
