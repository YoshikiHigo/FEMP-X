package inequivalent;

public class ClonePair10738 {

    String method1(String input, String oldParameter, String newParameter) {
        if (input == null || "".equals(input)) {
            return "";
        }
        boolean shouldKeep = newParameter != null && !newParameter.equals("");
        String[] allParameters = input.split(",");
        StringBuffer answer = new StringBuffer();
        for (int i = 0; i < allParameters.length; i++) {
            String currentParameter = allParameters[i].trim();
            String nextParameter = null;
            if (!oldParameter.equals(currentParameter)) {
                nextParameter = currentParameter;
            } else if (shouldKeep) {
                nextParameter = newParameter;
            }
            if (nextParameter == null) {
                continue;
            }
            if (answer.length() > 0) {
                answer.append(", ");
            }
            answer.append(nextParameter);
        }
        return answer.toString();
    }

    String method2(String str, String what, String withWhat) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        String result = "";
        while (str.indexOf(what) != -1) {
            int v1 = str.indexOf(what);
            result += str.substring(0, v1) + withWhat;
            str = str.substring(v1 + what.length());
        }
        return result + str;
    }
}
