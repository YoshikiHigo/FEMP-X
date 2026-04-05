package unverified;

public class ClonePair11814 {

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

    String method2(String line,String oldString,String newString){
      if (line == null) {
        return null;
      }
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
}
