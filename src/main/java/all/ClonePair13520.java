package all;

public class ClonePair13520 {

    String method1(String or,String ac,String ne){
      int orl=or.length();
      int acl=ac.length();
      StringBuilder resB=new StringBuilder();
      if (acl <= orl && or.lastIndexOf(ac) == orl - acl)   return resB.append(or.substring(0,or.length() - ac.length())).append(ne).toString();
      return or;
    }

    String method2(String original,String regex,String replacement){
      int index=0;
      String newString=original;
      while ((newString.contains(regex)) && (regex.compareTo(replacement) != 0)) {
        index=newString.indexOf(regex);
        newString=newString.substring(0,index) + replacement + newString.substring(index + regex.length(),newString.length());
      }
      return newString;
    }
}
