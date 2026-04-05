package all;

import java.util.*;

public class ClonePair4956 {

    String method1(Hashtable hs){
      String limitsQuery="";
      try {
        Vector language=(Vector)hs.get("Language");
        String operator=(String)hs.get("Operator");
        String date1=(String)hs.get("Date1");
        String date2=(String)hs.get("Date2");
        Vector bibliographicLevelId=(Vector)hs.get("BibliographicLevelId");
        Vector materialTypeId=(Vector)hs.get("MaterialTypeId");
        Vector libraryId=(Vector)hs.get("LibraryId");
        Vector catalogueSubLocations=(Vector)hs.get("CatalogueSubLocations");
        String openArchives=(String)hs.get("OpenArchives");
        String langStr="";
        String opStr="";
        String bibIdStr="";
        String matIdStr="";
        String libIdStr="";
        String catSubLocIdStr="";
        if (operator != null) {
          if (operator.equalsIgnoreCase("=") && date1 != null) {
            opStr+="(publishDate:" + date1 + ")";
          }
     else       if (operator.equalsIgnoreCase("<") && date1 != null) {
            opStr+="(publishDate:[* TO " + date1 + "])";
          }
     else       if (operator.equalsIgnoreCase(">") && date1 != null) {
            opStr+="(publishDate:[" + date1 + " TO *])";
          }
     else       if (operator.equalsIgnoreCase("range") && date1 != null && date2 != null) {
            opStr+="(publishDate:[" + date1 + " TO "+ date2+ "])";
          }
        }
        if (opStr.trim().length() >= 1 && language != null || bibliographicLevelId != null || materialTypeId != null || libraryId != null || catalogueSubLocations.size() >= 1 || openArchives != null) {
          limitsQuery=opStr + " AND ";
        }
     else {
          limitsQuery=opStr;
        }
        if (language != null && language.size() >= 1) {
          langStr="(";
          for (int l=0; l < language.size(); l++) {
            if (l == (language.size() - 1)) {
              langStr+="langcode:" + language.get(l);
            }
     else {
              langStr+="langcode:" + language.get(l) + " OR ";
            }
          }
          langStr+=")";
        }
        if (langStr.trim().length() >= 1) {
          limitsQuery+=langStr + " AND ";
        }
        if (bibliographicLevelId != null && bibliographicLevelId.size() >= 1) {
          bibIdStr="(";
          for (int l=0; l < bibliographicLevelId.size(); l++) {
            if (l == (bibliographicLevelId.size() - 1)) {
              bibIdStr+="BibliographicLevelID:" + bibliographicLevelId.get(l);
            }
     else {
              bibIdStr+="BibliographicLevelID:" + bibliographicLevelId.get(l) + " OR ";
            }
          }
          bibIdStr+=")";
        }
        if (bibIdStr.trim().length() >= 1) {
          limitsQuery+=bibIdStr + " AND ";
        }
        if (materialTypeId != null && materialTypeId.size() >= 1) {
          matIdStr="(";
          for (int l=0; l < materialTypeId.size(); l++) {
            if (l == (materialTypeId.size() - 1)) {
              String oneele=materialTypeId.get(l).toString();
              if (oneele.startsWith("008")) {
                if (oneele.startsWith("008-24")) {
                  String code=oneele.substring(7);
                  matIdStr+=" NatureOfContents:" + code;
                }
     else             if (oneele.startsWith("008-29")) {
                  matIdStr+=" ConferencePublication:1";
                }
              }
     else {
                matIdStr+="MaterialTypeID:" + materialTypeId.get(l);
              }
            }
     else {
              String oneele=materialTypeId.get(l).toString();
              if (oneele.startsWith("008")) {
                if (oneele.startsWith("008-24")) {
                  String code=oneele.substring(7);
                  matIdStr+=" NatureOfContents:" + code + " OR ";
                }
     else             if (oneele.startsWith("008-29")) {
                  matIdStr+=" ConferencePublication:1" + " OR ";
                }
              }
     else {
                matIdStr+="MaterialTypeID:" + materialTypeId.get(l) + " OR ";
              }
            }
          }
          matIdStr+=")";
        }
        if (matIdStr.trim().length() >= 1) {
          limitsQuery+=matIdStr + " AND ";
        }
        if (libraryId != null && libraryId.size() >= 1) {
          libIdStr="(";
          for (int l=0; l < libraryId.size(); l++) {
            if (l == (libraryId.size() - 1)) {
              libIdStr+="HoldingsLibraryID:" + libraryId.get(l);
            }
     else {
              libIdStr+="HoldingsLibraryID:" + libraryId.get(l) + " OR ";
            }
          }
          libIdStr+=")";
        }
        if (libIdStr.trim().length() >= 1) {
          limitsQuery+=libIdStr + " AND ";
        }
        if (catalogueSubLocations != null && catalogueSubLocations.size() >= 1) {
          catSubLocIdStr="(";
          for (int l=0; l < catalogueSubLocations.size(); l++) {
            if (l == (catalogueSubLocations.size() - 1)) {
              catSubLocIdStr+="SubLocationID:" + catalogueSubLocations.get(l);
            }
     else {
              catSubLocIdStr+="SubLocationID:" + catalogueSubLocations.get(l) + " OR ";
            }
          }
          catSubLocIdStr+=")";
        }
        if (catSubLocIdStr.trim().length() >= 1) {
          limitsQuery+=catSubLocIdStr + " AND ";
        }
        if (openArchives != null) {
          if (openArchives.equalsIgnoreCase("YES")) {
            limitsQuery+="(OpenArchive:A)";
          }
        }
      }
     catch (  Exception e) {
        e.printStackTrace();
      }
      return limitsQuery;
    }

    String method2(Hashtable hs){
      String limitsQuery="";
      try {
        Vector language=(Vector)hs.get("Language");
        String operator=(String)hs.get("Operator");
        String date1=(String)hs.get("Date1");
        String date2=(String)hs.get("Date2");
        Vector bibliographicLevelId=(Vector)hs.get("BibliographicLevelId");
        Vector materialTypeId=(Vector)hs.get("MaterialTypeId");
        Vector libraryId=(Vector)hs.get("LibraryId");
        Vector catalogueSubLocations=(Vector)hs.get("CatalogueSubLocations");
        String openArchives=(String)hs.get("OpenArchives");
        String langStr="";
        String opStr="";
        String bibIdStr="";
        String matIdStr="";
        String libIdStr="";
        String catSubLocIdStr="";
        if (operator != null) {
          if (operator.equalsIgnoreCase("=") && date1 != null) {
            opStr+="(Year:" + date1 + ")";
          }
     else       if (operator.equalsIgnoreCase("<") && date1 != null) {
            opStr+="(Year:[* TO " + date1 + "])";
          }
     else       if (operator.equalsIgnoreCase(">") && date1 != null) {
            opStr+="(Year:[" + date1 + " TO *])";
          }
     else       if (operator.equalsIgnoreCase("range") && date1 != null && date2 != null) {
            opStr+="(Year:[" + date1 + " TO "+ date2+ "])";
          }
        }
        if (opStr.trim().length() >= 1 && language != null || bibliographicLevelId != null || materialTypeId != null || libraryId != null || catalogueSubLocations.size() >= 1 || openArchives != null) {
          limitsQuery=opStr + " AND ";
        }
     else {
          limitsQuery=opStr;
        }
        if (language != null && language.size() >= 1) {
          langStr="(";
          for (int l=0; l < language.size(); l++) {
            if (l == (language.size() - 1)) {
              langStr+="langcode:" + language.get(l);
            }
     else {
              langStr+="langcode:" + language.get(l) + " OR ";
            }
          }
          langStr+=")";
        }
        if (langStr.trim().length() >= 1) {
          limitsQuery+=langStr + " AND ";
        }
        if (bibliographicLevelId != null && bibliographicLevelId.size() >= 1) {
          bibIdStr="(";
          for (int l=0; l < bibliographicLevelId.size(); l++) {
            if (l == (bibliographicLevelId.size() - 1)) {
              bibIdStr+="BibliographicLevelID:" + bibliographicLevelId.get(l);
            }
     else {
              bibIdStr+="BibliographicLevelID:" + bibliographicLevelId.get(l) + " OR ";
            }
          }
          bibIdStr+=")";
        }
        if (bibIdStr.trim().length() >= 1) {
          limitsQuery+=bibIdStr + " AND ";
        }
        if (materialTypeId != null && materialTypeId.size() >= 1) {
          matIdStr="(";
          for (int l=0; l < materialTypeId.size(); l++) {
            if (l == (materialTypeId.size() - 1)) {
              String oneele=materialTypeId.get(l).toString();
              if (oneele.startsWith("008")) {
                if (oneele.startsWith("008-24")) {
                  if (oneele.equals("008-24-m")) {
                    matIdStr+=" NatureOfContents:m OR MaterialTypeID:16 ";
                  }
     else {
                    String code=oneele.substring(7);
                    matIdStr+=" NatureOfContents:" + code;
                  }
                }
     else             if (oneele.startsWith("008-29")) {
                  matIdStr+=" ConferencePublication:1";
                }
              }
     else {
                matIdStr+="MaterialTypeID:" + materialTypeId.get(l);
              }
            }
     else {
              String oneele=materialTypeId.get(l).toString();
              if (oneele.startsWith("008")) {
                if (oneele.startsWith("008-24")) {
                  String code=oneele.substring(7);
                  matIdStr+=" NatureOfContents:" + code + " OR ";
                }
     else             if (oneele.startsWith("008-29")) {
                  matIdStr+=" ConferencePublication:1" + " OR ";
                }
              }
     else {
                matIdStr+="MaterialTypeID:" + materialTypeId.get(l) + " OR ";
              }
            }
          }
          matIdStr+=")";
        }
        if (matIdStr.trim().length() >= 1) {
          limitsQuery+=matIdStr + " AND ";
        }
        if (libraryId != null && libraryId.size() >= 1) {
          libIdStr="(";
          for (int l=0; l < libraryId.size(); l++) {
            if (l == (libraryId.size() - 1)) {
              libIdStr+="HoldingsLibraryID:" + libraryId.get(l);
            }
     else {
              libIdStr+="HoldingsLibraryID:" + libraryId.get(l) + " OR ";
            }
          }
          libIdStr+=")";
        }
        if (libIdStr.trim().length() >= 1) {
          limitsQuery+=libIdStr + " AND ";
        }
        if (catalogueSubLocations != null && catalogueSubLocations.size() >= 1) {
          catSubLocIdStr="(";
          for (int l=0; l < catalogueSubLocations.size(); l++) {
            if (l == (catalogueSubLocations.size() - 1)) {
              catSubLocIdStr+="SubLocationID:" + catalogueSubLocations.get(l);
            }
     else {
              catSubLocIdStr+="SubLocationID:" + catalogueSubLocations.get(l) + " OR ";
            }
          }
          catSubLocIdStr+=")";
        }
        if (catSubLocIdStr.trim().length() >= 1) {
          limitsQuery+=catSubLocIdStr + " AND ";
        }
        if (openArchives != null) {
          if (openArchives.equalsIgnoreCase("YES")) {
            limitsQuery+="(OpenArchive:A)";
          }
        }
      }
     catch (  Exception e) {
        e.printStackTrace();
      }
      return limitsQuery;
    }
}
