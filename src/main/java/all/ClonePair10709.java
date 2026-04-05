package all;

public class ClonePair10709 {

    boolean method1(char ch){
      int asci=(int)ch;
      if (((asci >= 48) && (asci <= 57)) || ((asci >= 65) && (asci <= 90)) || ((asci >= 97) && (asci <= 122))) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(char character){
      boolean check=false;
      if (character >= '0' && character <= '9')   check=true;
     else   if (character >= 'A' && character <= 'Z')   check=true;
     else   if (character >= 'a' && character <= 'z')   check=true;
      return check;
    }
}
