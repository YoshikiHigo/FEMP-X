package unverified;

public class ClonePair11302 {

    boolean method1(int width2,int height2){
      int wCheck=(int)Math.sqrt(width2);
      int hCheck=(int)Math.sqrt(height2);
      if ((wCheck * wCheck) != width2)   return false;
      if ((hCheck * hCheck) != height2)   return false;
      return true;
    }

    boolean method2(int row,int column){
      if (row >= 0 && row < 15 && column >= 0 && column < 15)   return true;
      return false;
    }
}
