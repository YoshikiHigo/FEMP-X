package all;

public class ClonePair5501 {

    boolean method1(int year){
      final int modFour=year & 0x0003, modHundred=year % 100;
      if (((0 == modFour) && (modHundred != 0)) || ((0 == modHundred) && (0 == (modHundred & 0x0003))))   return true;
     else   return false;
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
