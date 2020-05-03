public class Main {

    public static void main(String[] args) {




        int first_term,second_term,temp;
        first_term = 0;
        second_term = 1;
        System.out.println(first_term);
        System.out.println(second_term);
        for (first_term = 0; second_term <= 1000;){
            temp = second_term;
            second_term = second_term + first_term;
            first_term = temp;
            System.out.println(second_term);
        }











    }
    }