package all;

public class ClonePair12018 {

    String method1(String path,String search,String replacement){
      int index=path.indexOf(search);
      if (index >= 0) {
        String result=path.substring(0,index);
        result+=replacement;
        result+=path.substring(index + search.length());
        return result;
      }
     else {
        return path;
      }
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
