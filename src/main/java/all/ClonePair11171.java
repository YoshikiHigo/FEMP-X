package all;

public class ClonePair11171 {

    String method1(String str,String from,String to){
      if (str == null)   return str;
      int index=str.indexOf(from);
      if (index == -1)   return str;
      int pos=0;
      final int fromLen=from.length();
      final StringBuilder sb=new StringBuilder();
      while (index > -1) {
        sb.append(str.substring(pos,index)).append(to);
        pos=index + fromLen;
        index=str.indexOf(from,pos);
      }
      sb.append(str.substring(pos));
      return sb.toString();
    }

    String method2(String str,String oldToken,String newToken){
      if (str == null)   return str;
      StringBuilder result=new StringBuilder(str.length() + 100);
      int i=str.indexOf(oldToken);
      int startOfIndex=0;
      for (; i != -1; i=str.indexOf(oldToken,startOfIndex)) {
        result.append(str.substring(startOfIndex,i));
        result.append(newToken);
        startOfIndex=i + oldToken.length();
      }
      result.append(str.substring(startOfIndex,str.length()));
      return result.toString();
    }
}
