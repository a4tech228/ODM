package TIIT;
import java.lang.String;
import java.util.Random;

public class Sets {
    public static int i1, i2, i3, i5;
    public static String str1 = "", str2 = "", str3 = "", str4 = "", str5 = "";
    public static int[] lol3;
    public static int[] lol4;
    public static int[] lol1;
    public static int[] lol2;
    public static int height1;
    public static int shet1 = 0, shet2 = 0;
    public static int shit1 = 0, shit2 = 0, shit3 = 0, shit4 = 0, lil = 0;

    public static void mas() {
        shet1 = 0;
        shet2 = 0;
        for (int i = 0; i < height1; i++) {
            if (str1.charAt(i) == ',') //считаем количество чисел в 1 множестве
                shet1++;
        }
        for (int i = 0; i < height1; i++) {
            if (str2.charAt(i) == ',') //считаем количество чисел в 1 множестве
                shet2++;
        }
        shet1++;
        shet2++;
        lol1 = new int[shet1];
        lol2 = new int[shet2];
    }

    public static int[] Trans(String str123) {
        shet1 = 0;
        shit3 = 0;
        int[] lol123;
        height1 = str123.length();
        for (int i = 0; i < height1; i++) {
            if (str123.charAt(i) == ',') //считаем количество чисел в 1 множестве
                shet1++;
        }
        shet1++;
        lol123 = new int[shet1];
        for (int i = 1; i < shet1 + 1; i++) {//ищем запятые и вырезаем числа между ними
            if (i == 1) {
                str4 = "";
                for (int g = 0; g < height1; g++) {
                    if (str123.charAt(g) == ',') {
                        i1 = g;
                        break;
                    }
                }
                str4 += str123.substring(1, i1);
                lol123[shit3] = Integer.parseInt(str4);
                shit3++;
            }
            if (i != 1 && i != shet1) {
                for (int g = i1 + 1; g < height1; g++) {
                    if (str123.charAt(g) == ',') {
                        i2 = i1;
                        i1 = g;
                        break;
                    }
                }
                str4 = "";
                str4 += str123.substring(i2 + 1, i1);
                lol123[shit3] = Integer.parseInt(str4);
                shit3++;
            }
            if (i == shet1) {
                str4 = "";
                for (int g = height1 - 1; g > 0; g--) {
                    if (str123.charAt(g) == ',') {
                        i1 = g + 1;
                        break;
                    }
                }
                str4 += str123.substring(i1, height1 - 1);
                lol123[shit3] = Integer.parseInt(str4);
                shit3++;
            }
        }
        return lol123;
    }// перевод из стринг в инт

    public static void Intersection() {
        if (str1 != null && str2 != null) {//если строки пусты ничего не делаем
            lol1 = Trans(str1);
            shit1 = shit3;
            lol2 = Trans(str2);
            shit2 = shit3;
            lil = 0;
            str3 = "{";
            for (int i = 0; i < shit1; i++) {
                for (int g = 0; g < shit2; g++) { //сравниваем  числа 1 и 2 множества, если совпадают то записываем в 3 множество
                    if (lol1[i] == lol2[g]) {
                        if (lil != 0)
                            str3 += ",";
                        str3 += str4.valueOf(lol1[i]);
                        lil++;
                        break;
                    }
                }
            }
            str3 += "}";
        }
    }

    public static void Combining() {
        lol1 = Trans(str1);
        shit1 = shit3;
        lol2 = Trans(str2);
        shit2 = shit3;
        if (str1 != null && str2 != null) //если строки пусты ничего не делаем
        {
            str3 = "{";
            for (int i = 0; i < shit1; i++) //цикл по 1 множеству
            {
                if (i == 0) {
                    str3 += str4.valueOf(lol1[i]);
                } else//переписываем 1 множество в в 3 множество
                {
                    str3 += ",";
                    str3 += str4.valueOf(lol1[i]);
                }
            }
            for (int i = 0; i < shit2; i++) {
                shet1 = 0;
                for (int g = 0; g < shit1; g++) {
                    if (lol2[i] != lol1[g])
                        shet1++; //сравниваем числа 2 множества и 3 и такого числа нет в 3 множестве записываем его
                }
                if (shet1 == shit1) {
                    str3 += ",";
                    str3 += str4.valueOf(lol2[i]);
                    ;
                }
            }
            str3 += "}";
        }
    }

    public static void difference1() {
        lol1 = Trans(str1);
        shit1 = shit3;
        lol2 = Trans(str2);
        shit2 = shit3;
        str3 = "{";
        shet2 = 0;
        for (int i = 0; i < shit1; i++) {
            shet1 = 0;
            for (int j = 0; j < shit2; j++) {
                if (lol1[i] != lol2[j]) shet1++;
            }
            if (shet1 == shit2) {
                if (shet2 == 0) {
                    str3 += str4.valueOf(lol1[i]);
                    shet2++;
                } else {
                    str3 += ",";
                    str3 += str4.valueOf(lol1[i]);
                }
            }
        }
        str3 += "}";
    }

    public static void difference2() {
        lol1 = Trans(str1);
        shit1 = shit3;
        lol2 = Trans(str2);
        shit2 = shit3;
        str3 = "{";
        shet2 = 0;
        for (int i = 0; i < shit2; i++) {
            shet1 = 0;
            for (int j = 0; j < shit1; j++) {
                if (lol2[i] != lol1[j]) shet1++;
            }
            if (shet1 == shit1) {
                if (shet2 == 0) {
                    str3 += str4.valueOf(lol2[i]);
                    shet2++;
                } else {
                    str3 += ",";
                    str3 += str4.valueOf(lol2[i]);
                }
            }
        }
        str3 += "}";
    }

    public static void simdif() {
        difference1();
        str5 = str3;
        shet1 = str5.length();
        str5 = str5.substring(1, shet1);
        difference2();
        shet1 = str3.length();
        str3 = str3.substring(0, shet1 - 1);
        shet1 = str3.length();
        if (str3.charAt(shet1 - 1) == '{') {
            str3 += str5;
        } else {
            str3 += ",";
            str3 += str5;
        }
    }

    public static void twenty(int x) {
        if (x == 1) {
            str1 = "{";
            for (int i = 0; i < 20; i++) {
                if (i == 19) {
                    str1 += i;
                } else {
                    str1 += i;
                    str1 += ",";
                }
            }
            str1 += "}";
            System.out.println(str1);

        } else {

            str2 = "{";
            for (int i = 0; i < 20; i++) {
                if (i == 19) {
                    str2 += i;
                } else {
                    str2 += i;
                    str2 += ",";
                }
            }
            str2 += "}";
            System.out.println(str2);

        }
    }

    public static void Chetn(int x) {


        if (x == 1) {
            str1 = "{";


            for (int i = 1; i < 20; i++) {
                if (i % 2 == 0) {
                    if (i == 18) {
                        str1 += i;
                    } else {
                        str1 += i;
                        str1 += ",";
                    }
                }
            }
            str1 += "}";
            System.out.println(str1);

        } else {

            str2 = "{";

            for (int i = 1; i < 20; i++) {
                if (i % 2 == 0) {
                    if (i == 18) {
                        str2 += i;
                    } else {
                        str2 += i;
                        str2 += ",";
                    }
                }
            }
            str2 += "}";
            System.out.println(str2);
        }
    }

    public static void kratn3(int x) {
        if (x == 1) {
            str1 = "{";


            for (int i = 2; i < 20; i++) {
                if (i % 3 == 0) {
                    if (i == 18) {
                        str1 += i;
                    } else {
                        str1 += i;
                        str1 += ",";
                    }
                }
            }
            str1 += "}";
            System.out.println(str1);

        } else {

            str2 = "{";

            for (int i = 2; i < 20; i++) {
                if (i % 3 == 0) {
                    if (i == 18) {
                        str2 += i;
                    } else {
                        str2 += i;
                        str2 += ",";
                    }
                }
            }
            str2 += "}";
            System.out.println(str2);
        }
    }

    public static void dopolnenie() {
        Combining();
        int zik=0;
        int xr;
        Random li=new Random();
        lol3 = Trans(str3);
        shit4 = shit3;
        lol4=lol3;
        lol3=new int[shit4+5];
        for (int i=0;i<shit4;i++)
        {
            lol3[i]=lol4[i];
        }
        while (zik!=5)
        {
            shet2=0;
            xr=li.nextInt(1000);
            for (int i=0;i<shit4;i++)
            {
                if (lol3[i]!=xr) shet2++;
            }
            if (shet2==shit4)
            {
                lol3[shit4]=xr;
                shit4++;
                zik++;
            }
        }
        str3 = "{";
        shet2 = 0;
        for (int i = 0; i < shit4; i++) {
            shet1 = 0;
            for (int j = 0; j < shit1; j++) {
                if (lol3[i] != lol1[j]) shet1++;
            }
            if (shet1 == shit1) {
                if (shet2 == 0) {
                    str3 += str4.valueOf(lol3[i]);
                    shet2++;
                } else {
                    str3 += ",";
                    str3 += str4.valueOf(lol3[i]);
                }
            }
        }
        str3 += "}";
        System.out.println("1 дополнение: "+str3);
        str3 = "{";
        shet2 = 0;
        for (int i = 0; i < shit4; i++) {
            shet1 = 0;
            for (int j = 0; j < shit2; j++) {
                if (lol3[i] != lol2[j]) shet1++;
            }
            if (shet1 == shit2) {
                if (shet2 == 0) {
                    str3 += str4.valueOf(lol3[i]);
                    shet2++;
                } else {
                    str3 += ",";
                    str3 += str4.valueOf(lol3[i]);
                }
            }
        }
        str3 += "}";
        System.out.println("2 дополнение: "+str3);
    }

    public static void DekartovoProisv() {
        lol1 = Trans(str1);
        shit1 = shit3;
        lol2 = Trans(str2);
        shit2 = shit3;
        str3 = "{";
        for (int i = 0; i < shit1; i++) {
            for (int j = 0; j < shit2; j++) {

                str3 += "<";
                str3 += lol1[i];
                str3 += ";";
                str3 += lol2[j];
                str3 += ">";
                str3 += ",";

            }
        }

            str3=str3.substring(0, str3.length()-1);
            str3 += "}";
            System.out.println(str3);
        }
    }
