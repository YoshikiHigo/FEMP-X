package unverified;

public class ClonePair11165 {

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

    String method2(String s1,String s2,String s3){
      if (s1 == null)   return null;
      int inc=s3.length() - s2.length();
      int offset=0;
      int fromIndex=0;
      int findIndex=s1.indexOf(s2,fromIndex);
      StringBuffer buf=new StringBuffer(s1);
      while (findIndex != -1) {
        buf.delete(findIndex + offset,findIndex + offset + s2.length());
        buf.insert(findIndex + offset,s3);
        offset+=inc;
        fromIndex=findIndex + s2.length();
        findIndex=s1.indexOf(s2,fromIndex);
      }
      String result=buf.toString();
      return result;
    }
}
