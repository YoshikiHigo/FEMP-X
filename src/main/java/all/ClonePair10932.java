package all;

public class ClonePair10932 {

    boolean method1(int size,int handicap){
    switch (size) {
    case 9:    return handicap >= 0 && handicap < 6;
    case 13:  return handicap >= 0 && handicap < 10;
    case 19:return handicap >= 0 && handicap < 10;
    default:return handicap == 0;
    }
    }

    boolean method2(int row,int column){
    switch (column) {
    case 0:    return true;
    case 1:  return false;
    case 2:case 3:case 4:case 5:return false;
    default:return false;
    }
    }
}
