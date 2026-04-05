package unverified;

public class ClonePair7444 {

    String method1(String s,int length,char fillChar){
      if (s != null && s.length() >= length)   return s;
      StringBuffer sb=new StringBuffer(length);
      int l=s == null ? length : length - s.length();
      while (sb.length() < l)   sb.append(fillChar);
      if (s != null)   sb.append(s);
      return sb.toString();
    }

    String method2(String s,int length,char fillChar){
      if (s != null && s.length() >= length)   return s;
      StringBuffer sb=new StringBuffer(length);
      if (s != null)   sb.append(s);
      while (sb.length() < length)   sb.append(fillChar);
      return sb.toString();
    }
}
