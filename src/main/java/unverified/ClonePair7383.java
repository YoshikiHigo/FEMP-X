package unverified;

public class ClonePair7383 {

    String method1(String s,int length,char fillChar){
      if (s != null && s.length() >= length)   return s;
      StringBuilder sb=new StringBuilder(length);
      if (s != null)   sb.append(s);
      while (sb.length() < length)   sb.append(fillChar);
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
