package unverified;

public class ClonePair13112 {

    String method1(String source,String from,String to){
      StringBuffer sb=new StringBuffer();
      int oldIndex=0, newIndex;
      while (-1 != (newIndex=source.indexOf(from,oldIndex))) {
        sb.append(source.substring(oldIndex,newIndex)).append(to);
        oldIndex=newIndex + from.length();
      }
      if (oldIndex < source.length())   sb.append(source.substring(oldIndex));
      return sb.toString();
    }

    String method2(String lookIn,String lookFor,String replaceWith){
      int count=0;
      int i, j;
      StringBuffer sb;
      for (i=0; (i=lookIn.indexOf(lookFor,i)) != -1; i+=lookFor.length())   ++count;
      if (count == 0) {
        return lookIn;
      }
      sb=new StringBuffer(lookIn.length() + count * (replaceWith.length() - lookFor.length()));
      for (i=0; (j=lookIn.indexOf(lookFor,i)) != -1; i=j + lookFor.length())   sb.append(lookIn.substring(i,j)).append(replaceWith);
      sb.append(lookIn.substring(i));
      return sb.toString();
    }
}
