package unverified;

public class ClonePair5322 {

    int method1(int items,int itemsPerPage){
      int mod=items % itemsPerPage;
      int div=items / itemsPerPage;
      if (mod == 0)   return div;
      return div + 1;
    }

    int method2(int totalRows,int rowsDisplayed){
      int a;
      if (totalRows % rowsDisplayed == 0)   a=totalRows / rowsDisplayed;
     else   a=totalRows / rowsDisplayed + 1;
      return a;
    }
}
