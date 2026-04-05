package all;

public class ClonePair13034 {

    String method1(String s,String find,String replace){
      if (s == null)   return s;
      StringBuffer result=new StringBuffer();
      int index;
      while ((index=s.indexOf(find)) >= 0) {
        result.append(s.substring(0,index));
        result.append(replace);
        s=s.substring(index + find.length());
      }
      result.append(s);
      return result.toString();
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
