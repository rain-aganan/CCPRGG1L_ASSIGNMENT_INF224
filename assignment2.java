public class assignment2 {
    public static void main(String[] args) throws Exception {

        //1.Use a while loop to print your FIRSTNAME three times.
        System.out.println("1.Use a while loop to print your FIRSTNAME three times.");
        System.out.println("==START==");
        int count1 = 1;
        while (count1 != 4) {
            System.out.println(count1 + " RAINIER GERON");
            count1++;
        }
        System.out.println("==END==");

        //2.Use a do-while loop to print your MIDDLENAME four times.
        System.out.println("2.Use a do-while loop to print your MIDDLENAME four times.");
        System.out.println("==START==");
        int count2 = 1;
        do { 
            System.out.println(count2 + " PASCUAL");
            count2++;
        } while (count2 != 5);
        System.out.println("==END==");

        //3.Use a for loop to print your SURNAME five times.
        System.out.println("3.Use a for loop to print your SURNAME five times.");
        System.out.println("==START==");
        for ( int count3 = 1; count3 != 6; count3++){
            System.out.println(count3 + " AGANAN");
        }
        System.out.println("==END==");

        //4.Create a char array that consists all of the characters of your FIRSTNAME and use a for loop to print each character of your FIRSTNAME. (example: ELIZER)
        System.out.println("4.Create a char array that consists all of the characters of your FIRSTNAME and use a for loop to print each character of your FIRSTNAME. (example: ELIZER)");
        System.out.println("==START==");
        String [] MyFirstName = {"R", "A", "I", "N", "I", "E", "R", "G", "E", "R", "O", "N" };

        for (int count4 = 0; count4 < MyFirstName.length; count4++) {
            System.out.println(MyFirstName[count4]);
        }
        System.out.println("==END==");

        //5.Use a for loop to print the char array of your FIRSTNAME in REVERSE order (example: REZILE)
        System.out.println("5.Use a for loop to print the char array of your FIRSTNAME in REVERSE order (example: REZILE)");
        System.out.println("==START==");
        String [] MyFirstNameReverse = {"R", "A", "I", "N", "I", "E", "R", "G", "E", "R", "O", "N" };

        for (int count5 = MyFirstNameReverse.length-1; count5 >= 0; count5--) {
            System.out.println(MyFirstNameReverse[count5]);
        }
        System.out.println("==END==");
    }      
}
