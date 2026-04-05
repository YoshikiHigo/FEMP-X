package all;

public class ClonePair8291 {

    String method1(long time){
      long millis=time % 1000;
      long timeInSec=time / 1000;
      long seconds=timeInSec % 60;
      long timeInMin=timeInSec / 60;
      long minutes=timeInMin % 60;
      long timeInHours=timeInMin / 60;
      StringBuffer result=new StringBuffer(16);
      result.append(timeInHours).append(':');
      if (minutes < 10)   result.append('0');
      result.append(minutes).append(':');
      if (seconds < 10)   result.append('0');
      result.append(seconds).append(".");
      if (millis < 10)   result.append("00");
     else   if (millis < 100)   result.append('0');
      result.append(millis);
      return result.toString();
    }

    String method2(long time){
      String result="";
      long hrs=(time / (1000 * 60 * 60));
      result=result + hrs + ":";
      long mins=(time % (1000 * 60 * 60)) / (1000 * 60);
      if (mins < 10)   result=result + "0" + mins+ ":";
     else   result=result + mins + ":";
      long seconds=(time % (1000 * 60 * 60)) % (1000 * 60) / 1000;
      if (seconds < 10)   result=result + "0" + seconds+ ".";
     else   result=result + seconds + ".";
      long ms=(time % (1000 * 60 * 60)) % (1000 * 60) % 1000;
      if (ms == 0)   result=result + "000";
     else   if (ms < 10)   result=result + "00" + ms;
     else   if (ms < 100)   result=result + "0" + ms;
     else   result=result + ms;
      return result;
    }
}
