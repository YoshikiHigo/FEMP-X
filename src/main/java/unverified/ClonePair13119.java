package unverified;

public class ClonePair13119 {

    String method1(String input,String sub,String with){
      int fromIndex=0;
      int index=input.indexOf(sub,fromIndex);
      if (index == -1) {
        return input;
      }
      final StringBuilder buf=new StringBuilder(input.length() + with.length());
      do {
        buf.append(input.substring(fromIndex,index));
        buf.append(with);
        fromIndex=index + sub.length();
      }
     while ((index=input.indexOf(sub,fromIndex)) != -1);
      if (fromIndex < input.length()) {
        buf.append(input.substring(fromIndex,input.length()));
      }
      return buf.toString();
    }

    String method2(String line,String oldString,String newString){
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
}
