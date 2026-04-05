package all;

public class ClonePair5583 {

    boolean method1(String value,boolean deflt){
      if (value == null)   return deflt;
      if (value.equals("true"))   return true;
     else   if (value.equals("yes"))   return true;
     else   if (value.equals("y"))   return true;
     else   if (value.equals("on"))   return true;
     else   if (value.equals("false"))   return false;
     else   if (value.equals("no"))   return false;
     else   if (value.equals("n"))   return false;
     else   if (value.equals("off"))   return false;
      return deflt;
    }

    boolean method2(String str,boolean bDefValue){
      if (str == null) {
        return bDefValue;
      }
     else {
        str=str.trim().toLowerCase();
        if (str.equals("true") || str.equals("yes") || str.equals("checked")|| str.equals("on")|| str.startsWith("1")) {
          return true;
        }
     else     if (str.equals("false") || str.equals("no") || str.equals("off")|| str.equals("0")) {
          return false;
        }
     else {
          return bDefValue;
        }
      }
    }
}
