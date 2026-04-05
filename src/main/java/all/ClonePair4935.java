package all;

public class ClonePair4935 {

    boolean method1(int ano){
      boolean bisiesto;
      if (ano % 4 != 0) {
        bisiesto=false;
      }
     else   if (ano % 400 == 0) {
        bisiesto=true;
      }
     else   if (ano % 100 == 0) {
        bisiesto=false;
      }
     else {
        bisiesto=true;
      }
      return bisiesto;
    }

    boolean method2(int yyyy){
      if ((yyyy % 4) != 0) {
        return false;
      }
     else   if ((yyyy % 400) == 0) {
        return true;
      }
     else   if ((yyyy % 100) == 0) {
        return false;
      }
     else {
        return true;
      }
    }
}
