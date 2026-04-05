package all;

public class ClonePair7393 {

    String method1(String s,int length,char fillChar){
      if (s != null && s.length() >= length)   return s;
      StringBuilder sb=new StringBuilder(length);
      int l=s == null ? length : length - s.length();
      while (sb.length() < l)   sb.append(fillChar);
      if (s != null)   sb.append(s);
      return sb.toString();
    }

    String method2(String s,int length,char fillChar){
      if (s != null && s.length() >= length)   return s;
      StringBuffer sb=new StringBuffer(length);
      int l=s == null ? length : length - s.length();
      while (sb.length() < l)   sb.append(fillChar);
      if (s != null)   sb.append(s);
      return sb.toString();
    }
}
