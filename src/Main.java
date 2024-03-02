import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullname = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф.И.О. сотрудника - " + fullname);


        System.out.println();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullname.toUpperCase());


        System.out.println();
        fullname = "Иванов Семён Семёнович";
//        char[] fullNameArr = fullname.toCharArray();
//        for (int i=0; i < fullNameArr.length; i++) {
//            if (fullNameArr[i] == 'ё') {
//                fullNameArr[i] = 'е';
//            }
//        }
//        System.out.println("Данные Ф.И.О. сотрудника - " + String.valueOf(fullNameArr));
        System.out.println("Данные Ф.И.О. сотрудника - " + fullname.replace('ё', 'е'));
    }
}