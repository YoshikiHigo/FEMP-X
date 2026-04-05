package unverified;

public class ClonePair12706 {

    String method1(String line,String oldString,String newString){
      if (line == null)   return null;
      String lcLine=line.toLowerCase();
      String lcOldString=oldString.toLowerCase();
      int i=0;
      if ((i=lcLine.indexOf(lcOldString,i)) >= 0) {
        char[] line2=line.toCharArray();
        char[] newString2=newString.toCharArray();
        int oLength=oldString.length();
        StringBuilder buf=new StringBuilder(line2.length);
        buf.append(line2,0,i).append(newString2);
        i+=oLength;
        int j=i;
        while ((i=lcLine.indexOf(lcOldString,i)) > 0) {
          buf.append(line2,j,i - j).append(newString2);
          i+=oLength;
          j=i;
        }
        buf.append(line2,j,line2.length - j);
        return buf.toString();
      }
      return line;
    }

    String method2(String line,String oldString,String newString){
      if (line == null)   return null;
      String lcLine=line.toLowerCase();
      String lcOldString=oldString.toLowerCase();
      int i=0;
      if ((i=lcLine.indexOf(lcOldString,i)) >= 0) {
        char line2[]=line.toCharArray();
        char newString2[]=newString.toCharArray();
        int oLength=oldString.length();
        StringBuffer buf=new StringBuffer(line2.length);
        buf.append(line2,0,i).append(newString2);
        i+=oLength;
        int j;
        for (j=i; (i=lcLine.indexOf(lcOldString,i)) > 0; j=i) {
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
