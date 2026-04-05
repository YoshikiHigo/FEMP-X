package unverified;

public class ClonePair12203 {

    String method1(String line,String oldString,String newString){
      int i=0;
      if ((i=line.indexOf(oldString,i)) >= 0) {
        char[] line2=line.toCharArray();
        char[] newString2=newString.toCharArray();
        int oLength=oldString.length();
        StringBuffer buf=new StringBuffer(line2.length);
        buf.append(line2,0,i).append(newString2);
        i+=oLength;
        int j=i;
        while ((i=line.indexOf(oldString,i)) > 0) {
          buf.append(line2,j,i - j).append(newString2);
          i+=oLength;
          j=i;
        }
        buf.append(line2,j,line2.length - j);
        return buf.toString();
      }
      return line;
    }

    String method2(String subject,String original,String replacement){
      StringBuffer output=new StringBuffer();
      int p=0;
      int i;
      while ((i=subject.indexOf(original,p)) != -1) {
        output.append(subject.substring(p,i));
        output.append(replacement);
        p=i + original.length();
      }
      if (p < subject.length())   output.append(subject.substring(p));
      return output.toString();
    }
}
