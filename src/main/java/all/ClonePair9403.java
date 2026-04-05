package all;

public class ClonePair9403 {

    int method1(int[] cmd){
      boolean isTeamHome=true;
      int num=cmd[1];
      if (num > 128) {
        isTeamHome=false;
        num-=128;
      }
      System.out.println("JBB.handle_SelectPlayer> num=" + num + " isTeamHome="+ isTeamHome);
      return 0;
    }

    int method2(int[] arrayInt){
      int min;
      int index=0;
      int length=arrayInt.length;
      for (int i=1; i < length; i++)   if (arrayInt[i] < arrayInt[index])   index=i;
      min=arrayInt[index];
      for (int i=min; i > 0; i--) {
        boolean isFound=true;
        for (int j=0; j < arrayInt.length; j++) {
          if ((arrayInt[j] % i) != 0) {
            isFound=false;
            break;
          }
        }
        if (isFound)     return i;
      }
      return 0;
    }
}
