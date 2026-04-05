package unverified;

public class ClonePair11830 {

    String method1(String string,String oldString,String newString){
      if (string == null) {
        return null;
      }
      int i=0;
      if ((i=string.indexOf(oldString,i)) >= 0) {
        char[] string2=string.toCharArray();
        char[] newString2=newString.toCharArray();
        int oLength=oldString.length();
        StringBuilder buf=new StringBuilder(string2.length);
        buf.append(string2,0,i).append(newString2);
        i+=oLength;
        int j=i;
        while ((i=string.indexOf(oldString,i)) > 0) {
          buf.append(string2,j,i - j).append(newString2);
          i+=oLength;
          j=i;
        }
        buf.append(string2,j,string2.length - j);
        return buf.toString();
      }
      return string;
    }

    String method2(String subject,String find,String replace){
      if (subject == null)   return null;
      StringBuffer buf=new StringBuffer();
      int l=find.length();
      int s=0;
      int i=subject.indexOf(find);
      while (i != -1) {
        buf.append(subject.substring(s,i));
        buf.append(replace);
        s=i + l;
        i=subject.indexOf(find,s);
      }
      buf.append(subject.substring(s));
      return buf.toString();
    }
}
