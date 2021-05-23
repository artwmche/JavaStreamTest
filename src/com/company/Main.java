package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");
*/
        ArrayList<String> source = new ArrayList<String>();

        for ( int i = 0 ; i < 120 ; i++){
            source.add(""+i);
        }
/*
        boolean b = source.parallelStream()


                .filter(s -> {
                    System.out.println(s + "filter1:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter2:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter3:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter4:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter5:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter6:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter7:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter8:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter9:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter10:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter11:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter12:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter13:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter14:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter15:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter16:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter17:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter18:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter19:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter20:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter21:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter22:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter23:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter24:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter25:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter26:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter27:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter28:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter29:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter30:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter31:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter32:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter33:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter34:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter35:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter36:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter37:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter38:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter39:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter40:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter41:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter42:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter43:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter44:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter45:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter46:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter47:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter48:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter49:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter50:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter51:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter52:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter53:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter54:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter55:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter56:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter57:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter58:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter59:" + s);
                    return true;
                })
                .filter(s -> {
                    System.out.println(s + "filter60:" + s);
                    return true;
                })
                .allMatch(s -> s.contains(":35"));
        //.forEach(System.out::println);
*/

        source
                .parallelStream()

                .filter(s -> {
                    System.out.println(s+"filter1:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map1: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter2:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map2: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter3:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map3: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter4:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map4: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter5:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map5: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter6:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map6: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter7:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map7: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter8:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map8: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter9:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map9: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter10:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map10: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter11:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map11: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter12:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map12: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter13:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map13: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter14:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map14: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter15:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map15: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter16:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map16: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter17:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map17: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter18:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map18: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter19:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map19: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter20:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map20: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter21:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map21: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter22:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map22: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter23:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map23: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter24:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map24: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter25:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map25: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter26:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map26: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter27:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map27: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter28:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map28: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter29:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map29: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter30:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map30: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter31:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map31: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter32:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map32: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter33:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map33: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter34:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map34: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter35:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map35: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter36:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map36: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter37:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map37: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter38:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map38: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter39:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map39: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter40:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map40: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter41:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map41: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter42:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map42: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter43:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map43: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter44:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map44: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter45:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map45: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter46:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map46: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter47:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map47: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter48:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map48: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter49:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map49: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter50:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map50: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter51:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map51: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter52:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map52: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter53:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map53: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter54:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map54: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter55:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map55: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter56:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map56: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter57:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map57: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter58:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map58: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter59:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map59: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter60:"+s);
                    return true;
                })

                .map(s -> {
                    System.out.println("map60: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter61:"+s);
                    return true;
                })

                .map(s -> {
                    System.out.println("map61: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter62:"+s);
                    return true;
                })

                .map(s -> {
                    System.out.println("map62: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter63:"+s);
                    return true;
                })

                .map(s -> {
                    System.out.println("map63: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter64:"+s);
                    return true;
                })

                .map(s -> {
                    System.out.println("map64: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter65:"+s);
                    return true;
                })

                .map(s -> {
                    System.out.println("map65: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter66:"+s);
                    return true;
                })

                .map(s -> {
                    System.out.println("map66: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter67:"+s);
                    return true;
                })

                .map(s -> {
                    System.out.println("map67: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter68:"+s);
                    return true;
                })

                .map(s -> {
                    System.out.println("map68: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter69:"+s);
                    return true;
                })

                .map(s -> {
                    System.out.println("map69: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter70:"+s);
                    return true;
                })

                .map(s -> {
                    System.out.println("map70: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter71:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map71: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter72:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map72: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter73:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map73: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter74:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map74: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter75:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map75: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter76:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map76: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter77:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map77: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter78:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map78: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter79:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map79: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter80:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map80: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter81:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map81: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter82:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map82: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter83:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map83: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter84:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map84: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter85:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map85: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter86:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map86: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter87:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map87: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter88:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map88: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter89:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map89: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter90:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map90: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter91:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map91: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter92:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map92: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter93:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map93: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter94:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map94: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter95:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map95: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter96:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map96: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter97:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map97: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter98:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map98: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter99:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map99: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter100:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map100: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter101:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map101: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter102:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map102: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter103:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map103: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter104:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map104: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter105:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map105: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter106:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map106: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter107:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map107: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter108:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map108: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter109:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map109: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter110:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map110: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter111:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map111: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter112:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map112: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter113:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map113: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter114:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map114: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter115:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map115: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter116:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map116: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter117:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map117: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter118:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map118: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter119:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map119: " + s);
                    return s;
                })
                .filter(s -> {
                    System.out.println(s+"filter120:"+s);
                    return true;
                })
                .map(s -> {
                    System.out.println("map120: " + s);
                    return s;
                })
                .sorted()

               .forEach(System.out::println);
    }
}
