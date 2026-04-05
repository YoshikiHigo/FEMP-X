package all;

public class ClonePair12708 {

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

    String method2(String originalText,String searchFor,String replaceWith){
      if (originalText == null) {
        return null;
      }
      int i=0;
      String compareLine=originalText.toLowerCase();
      searchFor=searchFor.toLowerCase();
      if ((i=compareLine.indexOf(searchFor,i)) >= 0) {
        char[] originalChars=originalText.toCharArray();
        char[] replaceWithChars=replaceWith.toCharArray();
        int searchForLength=searchFor.length();
        StringBuffer buf=new StringBuffer(originalChars.length);
        buf.append(originalChars,0,i).append(replaceWithChars);
        i+=searchForLength;
        int j=i;
        while ((i=compareLine.indexOf(searchFor,i)) > 0) {
          buf.append(originalChars,j,i - j).append(replaceWithChars);
          i+=searchForLength;
          j=i;
        }
        buf.append(originalChars,j,originalChars.length - j);
        return buf.toString();
      }
      return originalText;
    }
}
