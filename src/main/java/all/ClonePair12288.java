package all;

public class ClonePair12288 {

    boolean method1(String text){
      char ch;
      text=text.toUpperCase();
      boolean retVal=true;
      for (int i=0; i < text.length(); i++) {
        ch=text.charAt(i);
        if (!((ch >= 'A' && ch <= 'Z') || (ch == ' ' || ch == '.' || ch == ',')))     retVal=false;
      }
      return retVal;
    }

    boolean method2(String str){
      char chr[]=null;
      char current;
      if (str != null)   chr=str.toUpperCase().toCharArray();
      for (int i=0; i < chr.length; i++) {
        current=chr[i];
        if (!(current >= '0' && current <= '9') && !(current >= 'A' && current <= 'Z')) {
          return false;
        }
      }
      return true;
    }
}
