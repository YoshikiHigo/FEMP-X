package all;

public class ClonePair6120 {

    int method1(int diff,int tileSize){
      int tiles=diff / tileSize;
      if ((diff % tileSize) != 0)   ++tiles;
      return tiles;
    }

    int method2(int totalRows,int rowsDisplayed){
      int a;
      if (totalRows % rowsDisplayed == 0)   a=totalRows / rowsDisplayed;
     else   a=totalRows / rowsDisplayed + 1;
      return a;
    }
}
