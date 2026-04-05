package unverified;

public class ClonePair13262 {

    int method1(String si){
      if (si == null || si.length() == 0) {
        return 0;
      }
     else {
        return Integer.parseInt(si,10);
      }
    }

    int method2(String string){
      if (string == null)   return 0;
      string=string.replace("\"","");
      if (string.trim().equals(""))   return 0;
     else   return Integer.valueOf(string);
    }
}
