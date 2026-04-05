package all;

public class ClonePair12224 {

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

    String method2(String str,String old_sub,String new_sub){
      if (str.indexOf(old_sub) != -1 && !old_sub.equals(new_sub)) {
        StringBuffer buf=new StringBuffer();
        int len=old_sub.length();
        int index, fromIndex=0;
        while ((index=str.indexOf(old_sub,fromIndex)) != -1) {
          buf.append(str.substring(fromIndex,index));
          buf.append(new_sub);
          fromIndex=index + len;
        }
        buf.append(str.substring(fromIndex));
        return buf.toString();
      }
      return str;
    }
}
