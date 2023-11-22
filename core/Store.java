package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Store {

    public static HashMap<String, String> DATA_AC_NV = new HashMap<>();
    public static HashMap<String, String> DATA_AC_QT = new HashMap<>();
    public static HashMap<String, String> DATA_AC_NS = new HashMap<>();
    public static HashMap<String, String> DATA_AC_TC = new HashMap<>();
    public static HashMap<String, String> DATA_AC_NL = new HashMap<>();
    public static HashMap<String, String> DATA_AC_TB = new HashMap<>();
    public static HashMap<String, String> UNDEFINE = new HashMap<>();
    public static List<String> listTemplate = new ArrayList<>();

    public Store() {
        DATA_AC_NL.put("nhan luc 1", "1");
        DATA_AC_NL.put("nhan luc 2", "2");
        DATA_AC_NL.put("nhan luc 3", "3");
        DATA_AC_QT.put("quan tri 1", "1");
        DATA_AC_QT.put("quan tri 2", "2");
        DATA_AC_QT.put("quan tri 3", "3");
        DATA_AC_NS.put("nhan su 1", "1");
        DATA_AC_TC.put("tai chinh 1", "1");
        DATA_AC_TB.put("truong ban 1", "1");
        DATA_AC_NV.put("nhan vien 1", "1");
        listTemplate.add("NV001,QT,PQT,Nguyen Van A,Nam,TpHCM,01-12-2004,0485593758,Kinh,Phat Giao,12/12");
    }

}