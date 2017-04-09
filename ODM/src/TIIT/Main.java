package TIIT;
import java.util.Scanner;

import static TIIT.Sets.i3;
import static TIIT.Sets.i5;


public class Main {
    public static void main(String[] args) {
        boolean sir = true, ris = true, ass = true;
        int nim, lol, kek, lal;
        Scanner num = new Scanner(System.in);

                    System.out.println("Выберите способ задания 1 множества :");
                    System.out.println(" 1 - вручную 2 - высказывания. ");
                    kek = num.nextInt();

                        switch (kek) {
                            case 1:

                                System.out.println("Введите 1 множесто(через запятую {1,2,3,4} )): ");
                                Scanner str = new Scanner(System.in);  //принимаем 1 множество
                                Sets.str1 = str.nextLine();
                                break;

                            case 2:
                                while (ris == true) {
                                    System.out.println("1 - числа от 1 до 20 \n 2 - только четные числа(1-20) \n 3 - числа кратные 3(1-20) \n 4 - перейти к следующему множеству ");
                                    lal = num.nextInt();
                                    switch (lal) {
                                        case 1:
                                            Sets.twenty(1);
                                            break;
                                        case 2:
                                            Sets.Chetn(1);
                                            break;
                                        case 3:
                                            Sets.kratn3(1);
                                            break;
                                        case 4:
                                            ris = false;
                                            break;
                                    }


                                }
                                break;
                        }


                    System.out.println("Выберите способ задания 2 множества :");
                    System.out.println("1 - вручную . 2 -высказывания ");
                    kek = num.nextInt();
                    switch (kek) {
                        case 1:

                            System.out.println("Введите 2 множесто(через запятую {1,2,3,4} )): ");
                            Scanner str = new Scanner(System.in);
                            Sets.str2 = str.nextLine();
                            break;

                        case 2:
                            while(ass == true) {
                                System.out.println("1 - числа от 1 до 20 \n 2 - только четные числа(1-20) \n 3 - числа кратные 3(1-20)  \n 4 - перейти к операциям на множествами");
                                lal = num.nextInt();
                                switch (lal) {
                                    case 1:
                                        Sets.twenty(2);
                                        break;
                                    case 2:
                                        Sets.Chetn(2);
                                        break;
                                    case 3:
                                        Sets.kratn3(2);
                                        break;
                                    case 4:
                                        ass = false;
                                        break;
                                }
                            }

                    }



        Sets.mas();
        while (sir == true) {
            System.out.println(" 1-Пересечение \n 2-Объединение \n 3-Декартово произведение  \n 4 - Разность \n 5 - Симметрическая разность \n 6 - дополнение \n 7-выход");
            nim = num.nextInt(); //спрашиваем что сделать
            switch (nim) {
                case 1:
                    Sets.Intersection(); //отправлием строки в класс Sets в функцию Intersection для пересечения
                    System.out.println("Результат пересечения: " + Sets.str3);
                    break;
                case 2:
                    Sets.Combining(); //отправлием строки в класс Sets в функцию Combining для объединения
                    System.out.println("Результат объединения: " + Sets.str3);
                    break;
                case 7:
                    sir = false; //выходи из (программы) цикла
                    break;
                case 4:
                    Sets.difference1();
                    System.out.println("Результат разности 1: " + Sets.str3);
                    Sets.difference2();
                    System.out.println("Результат разности 2: " + Sets.str3);
                    break;
                case 5:
                    Sets.simdif();
                    System.out.println("Результат симметрической разности: " + Sets.str3);
                    break;
                case 6:
                    Sets.dopolnenie();
                    break;
                case 3:
                    Sets.DekartovoProisv();
                    break;
                default:
                    System.out.println("Попробуйте еще раз");
                break;
            }
        }
    }
}



