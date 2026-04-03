package equivalent;

public class ClonePair9316 {
    String method1(int mes) {
        String strMes = null;
        final int i = 1;
        if (mes == 0) {
            strMes = "Janeiro";
        } else if (mes == 1) {
            strMes = "Fevereiro";
        } else if (mes == 2) {
            strMes = "Março";
        } else if (mes == 3) {
            strMes = "Abril";
        } else if (mes == 4) {
            strMes = "Maio";
        } else if (mes == 5) {
            strMes = "Junho";
        } else if (mes == 6) {
            strMes = "Julho";
        } else if (mes == 7) {
            strMes = "Agosto";
        } else if (mes == 8) {
            strMes = "Setembro";
        } else if (mes == 9) {
            strMes = "Outubro";
        } else if (mes == 10) {
            strMes = "Novembro";
        } else if (mes == 11) {
            strMes = "Dezembro";
        }
        return strMes;
    }

    String method2(int monthIndex) {
        switch (monthIndex) {
            case 0: {
                return "Janeiro";
            }
            case 1: {
                return "Fevereiro";
            }
            case 2: {
                return "Março";
            }
            case 3: {
                return "Abril";
            }
            case 4: {
                return "Maio";
            }
            case 5: {
                return "Junho";
            }
            case 6: {
                return "Julho";
            }
            case 7: {
                return "Agosto";
            }
            case 8: {
                return "Setembro";
            }
            case 9: {
                return "Outubro";
            }
            case 10: {
                return "Novembro";
            }
            case 11: {
                return "Dezembro";
            }
            default:
                return null;
        }
    }
}
