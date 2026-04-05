package all;

public class ClonePair12226 {

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

    String method2(String orig,String token,String replacement){
      if (orig.indexOf(token) < 0)   return orig;
      int tokenlen=token.length();
      int posn;
      String result="";
      while ((posn=orig.indexOf(token)) >= 0) {
        result+=orig.substring(0,posn) + replacement;
        orig=orig.substring(posn + tokenlen);
      }
      return result + orig;
    }
}
