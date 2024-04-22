import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Task 01
        System.out.println("Task 01");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("Ф. И. О. сотрудника - %s\n", fullName);

        //Task 02
        System.out.println("Task 02");
        System.out.printf("Данные Ф. И. О. сотрудника для заполнения отчета - %s\n",
                fullName.toUpperCase(Locale.ROOT));

        //Task 03 (version 1)
        System.out.println("Task 03 (version 1)");
        fullName = "Иванов Семён Семёнович";
        char[] fullNameLetters = fullName.toCharArray();
        fullName = "";
        for (int i = 0; i < fullNameLetters.length; i++) {
            if (fullNameLetters[i] == 'ё') {
                fullNameLetters[i] = 'е';
            } else if (fullNameLetters[i] == 'Ё') {
                fullNameLetters[i] = 'Е';
            }
            fullName += fullNameLetters[i];
        }
        System.out.printf("Данные Ф. И. О. сотрудника - %s\n", fullName);

        //Task 03 (version 2)
        System.out.println("Task 03 (version 2)");
        fullName = "Иванов Семён Семёнович";
        System.out.printf("Данные Ф. И. О. сотрудника - %s\n", fullName.replace('ё', 'е'));
    }
}
