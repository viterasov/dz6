public class Main {
    private static String replaceSample;

    public static void main(String[] args) {
        // Задание 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName +' ' +  firstName + ' '  +  middleName ;
        System.out.println(fullName);

        // Задание 2

        fullName=fullName.toUpperCase();
        System.out.println(fullName);

        //Задание 3

        String fullName1 = lastName +';' +  firstName + ';'  +  middleName ;
        System.out.println(fullName1);

        //Задание 4
        String fullName2 = " Иванов Семён Семёнович ";
        fullName2 = fullName2.replace("ё","е");
        System.out.println(fullName2);


    }
}
