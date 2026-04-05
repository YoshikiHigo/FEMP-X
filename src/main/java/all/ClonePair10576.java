package all;

public class ClonePair10576 {

    String method1(String s,String o,String n){
      if (s == null)   return null;
      int begin=s.indexOf(o);
      if (begin == -1)   return s;
      int end=begin + o.length();
      return (new StringBuffer(s)).replace(begin,end,n).toString();
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
