package unverified;

public class ClonePair13548 {

    String method1(String or,String ac,String ne){
      int orl=or.length();
      int acl=ac.length();
      StringBuilder resB=new StringBuilder();
      if (acl <= orl && or.lastIndexOf(ac) == orl - acl)   return resB.append(or.substring(0,or.length() - ac.length())).append(ne).toString();
      return or;
    }

    String method2(String input,String replace,String replacement){
      int idx;
      if ((idx=input.indexOf(replace)) == -1) {
        return input;
      }
      StringBuffer returning=new StringBuffer();
      while (idx != -1) {
        returning.append(input.substring(0,idx));
        returning.append(replacement);
        input=input.substring(idx + replace.length());
        idx=input.indexOf(replace);
      }
      returning.append(input);
      return returning.toString();
    }
}
