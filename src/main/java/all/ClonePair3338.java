package all;

public class ClonePair3338 {

    int method1(Object o1,Object o2){
      String key1=(String)o1;
      String key2=(String)o2;
      String[] tokens1=key1.split(",");
      String[] tokens2=key2.split(",");
      String reqNumber1=tokens1[0];
      String itemNumber1=tokens1[1];
      String reqNumber2=tokens2[0];
      String itemNumber2=tokens2[1];
      String number1=null;
      String[] itemNumberTokens1=itemNumber1.split("X");
      number1=itemNumberTokens1[itemNumberTokens1.length - 1];
      String number2=null;
      String[] itemNumberTokens2=itemNumber2.split("X");
      number2=itemNumberTokens2[itemNumberTokens2.length - 1];
      if (reqNumber1.equals(reqNumber2)) {
        return new Integer(number1).compareTo(new Integer(number2));
      }
     else {
        return reqNumber1.compareTo(reqNumber2);
      }
    }

    int method2(Object o1,Object o2){
      String key1=(String)o1;
      String key2=(String)o2;
      String[] tokens1=key1.split(",");
      String[] tokens2=key2.split(",");
      String reqNumber1=tokens1[0];
      String itemNumber1=tokens1[1];
      String reqNumber2=tokens2[0];
      String itemNumber2=tokens2[1];
      String[] itemNumberTokens1=itemNumber1.split("X");
      String number1=itemNumberTokens1[itemNumberTokens1.length - 1];
      String[] itemNumberTokens2=itemNumber2.split("X");
      String number2=itemNumberTokens2[itemNumberTokens2.length - 1];
      if (reqNumber1.equals(reqNumber2)) {
        return new Integer(number1).compareTo(new Integer(number2));
      }
     else {
        return reqNumber1.compareTo(reqNumber2);
      }
    }
}
