package unverified;

public class ClonePair12000 {

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

    String method2(String text,String find,String replace){
      int replaceStart=text.indexOf(find);
      if (replaceStart == -1)   return text;
      int findLength=find.length();
      StringBuffer toReturn=new StringBuffer();
      while (replaceStart != -1) {
        toReturn.append(text.substring(0,replaceStart));
        toReturn.append(replace);
        text=text.substring(replaceStart + findLength);
        replaceStart=text.indexOf(find);
      }
      toReturn.append(text);
      return toReturn.toString();
    }
}
