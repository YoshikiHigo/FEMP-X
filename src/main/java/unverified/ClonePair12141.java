package unverified;

public class ClonePair12141 {

    String method1(String input,String replace,String replacement){
      if (replace.equals(replacement))   return input;
      int idx;
      if ((idx=input.indexOf(replace)) == -1) {
        return input;
      }
      boolean finished=false;
      while (!finished) {
        StringBuffer returning=new StringBuffer();
        while (idx != -1) {
          returning.append(input.substring(0,idx));
          returning.append(replacement);
          input=input.substring(idx + replace.length());
          idx=input.indexOf(replace);
        }
        returning.append(input);
        input=returning.toString();
        if ((idx=returning.indexOf(replace)) == -1) {
          finished=true;
        }
      }
      return input;
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
