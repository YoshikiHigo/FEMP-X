package unverified;

public class ClonePair4805 {

    String method1(String value,char padding,int totalLength){
      if (value == null) {
        return value;
      }
      if (value.length() >= totalLength) {
        return value;
      }
      final StringBuffer sb=new StringBuffer(value);
      for (int i=0; i < totalLength - value.length(); i++) {
        sb.append(padding);
      }
      return sb.toString();
    }

    String method2(String s,char c,int length){
      if (s == null)   return (s);
      if (s.length() >= length)   return (s);
      StringBuilder sb=new StringBuilder();
      for (length=length - s.length(); length > 0; length--)   sb.append(c);
      sb.append(s);
      return (sb.toString());
    }
}
