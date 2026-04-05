package unverified;

public class ClonePair4952 {

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

    boolean method2(int yearNum){
      boolean isLeep=false;
      if ((yearNum % 4 == 0) && (yearNum % 100 != 0)) {
        isLeep=true;
      }
     else   if (yearNum % 400 == 0) {
        isLeep=true;
      }
     else {
        isLeep=false;
      }
      return isLeep;
    }
}
