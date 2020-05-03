
public class Main {

    public static void main(String[] args) {


        int  n, i, flag;
        flag = 1;
        i = 2;
        Scanner input;
        input = new Scanner (System.in);
        System.out.println("Enter a nuber: ");
        n =input.nextInt();

        while(i <= n/2)

        {

            if(n /  i == 0)
            {
                flag =0;
            }
            i = i+1; //++i;

        }

        if (flag == 0){
            System.out.println(n+ " n is not prime.");
        } else{
            System.out.println(n + " n is prime");}



    }
}
    }
}