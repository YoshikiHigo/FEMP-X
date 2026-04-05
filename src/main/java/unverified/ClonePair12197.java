package unverified;

public class ClonePair12197 {

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

    String method2(String str,String repl,String with){
      int lastindex=0;
      int pos=str.indexOf(repl);
      if (pos < 0) {
        return str;
      }
      int len=repl.length();
      int lendiff=with.length() - repl.length();
      StringBuilder out=new StringBuilder((lendiff <= 0) ? str.length() : (str.length() + (lendiff << 3)));
      for (; pos >= 0; pos=str.indexOf(repl,lastindex=pos + len)) {
        out.append(str.substring(lastindex,pos)).append(with);
      }
      return out.append(str.substring(lastindex,str.length())).toString();
    }
}
