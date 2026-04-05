package all;

public class ClonePair13354 {

    String method1(String line,String oldString,String newString){
      int i=0;
      int j=0;
      if ((i=line.indexOf(oldString,i)) >= 0) {
        char line2[]=line.toCharArray();
        char newString2[]=newString.toCharArray();
        int oLength=oldString.length();
        StringBuffer buffer=new StringBuffer(line2.length);
        buffer.append(line2,0,i).append(newString2);
        i+=oLength;
        for (j=i; (i=line.indexOf(oldString,i)) > 0; j=i) {
          buffer.append(line2,j,i - j).append(newString2);
          i+=oLength;
        }
        buffer.append(line2,j,line2.length - j);
        return buffer.toString();
      }
     else {
        return line;
      }
    }

    String method2(String source,String toBeReplaced,String replacement){
      StringBuffer results=new StringBuffer();
      int len=toBeReplaced.length();
      for (int i=0; i < source.length(); ++i) {
        if (source.regionMatches(false,i,toBeReplaced,0,len)) {
          results.append(replacement);
          i+=len - 1;
        }
     else {
          results.append(source.charAt(i));
        }
      }
      return results.toString();
    }
}
