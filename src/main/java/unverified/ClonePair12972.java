package unverified;

public class ClonePair12972 {

    String method1(String text,String toFind,String replaceBy){
      int pos=text.indexOf(toFind);
      if (pos == -1)   return text;
      StringBuffer result=new StringBuffer(text.length());
      while (pos >= 0) {
        result.append(text.substring(0,pos));
        result.append(replaceBy);
        text=text.substring(pos + toFind.length());
        pos=text.indexOf(toFind);
      }
      result.append(text);
      return (result.toString());
    }

    String method2(String line,String oldString,String newString){
      int i=0;
      if ((i=line.indexOf(oldString,i)) >= 0) {
        char line2[]=line.toCharArray();
        char newString2[]=newString.toCharArray();
        int oLength=oldString.length();
        StringBuffer buf=new StringBuffer(line2.length);
        buf.append(line2,0,i).append(newString2);
        i+=oLength;
        int j;
        for (j=i; (i=line.indexOf(oldString,i)) > 0; j=i) {
          buf.append(line2,j,i - j).append(newString2);
          i+=oLength;
        }
        buf.append(line2,j,line2.length - j);
        return buf.toString();
      }
     else {
        return line;
      }
    }
}
