package all;

public class ClonePair12864 {

    boolean method1(String filename){
      if (filename.indexOf("\\") != -1 || filename.indexOf("/") != -1 || filename.indexOf(":") != -1 || filename.indexOf("*") != -1 || filename.indexOf("?") != -1 || filename.indexOf("<") != -1 || filename.indexOf(">") != -1 || filename.indexOf("|") != -1 || filename.indexOf("\"") != -1)   return false;
      return true;
    }

    boolean method2(String url){
      boolean retVal=true;
      char[] ch=url.toCharArray();
      int index=0;
      while (index < ch.length) {
        if (!((ch[index] > 96 && ch[index] < 123) || (ch[index] > 46 && ch[index] < 59) || ch[index] == 126 || ch[index] == 63 || ch[index] == 56)) {
          retVal=false;
        }
      }
      return retVal;
    }
}
