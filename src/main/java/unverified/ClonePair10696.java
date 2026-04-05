package unverified;

public class ClonePair10696 {

    boolean method1(char c){
      if ((c >= 'a') && (c <= 'z'))   return true;
      if ((c >= 'A') && (c <= 'Z'))   return true;
      return false;
    }

    boolean method2(char character){
      boolean check=false;
      if (character >= 'A' && character <= 'Z')   check=true;
     else   if (character >= 'a' && character <= 'z')   check=true;
      return check;
    }
}
