 import java.util.Scanner;  
   
public class AtmInterface 
{  
    public static void main(String args[] )  
    {   
        int balance = 100000, withdraw, deposit;  
  
        Scanner scanner = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("******ATM Machine******");  
            System.out.println("1. For Withdraw your money");  
            System.out.println("2. For Deposit your money");  
            System.out.println("3. For Check Balance of your account");  
            System.out.println("4. For EXIT");  
            System.out.print("Choose the operation you want to perform:");  
              
            //get choice from user  
            int choice = scanner.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Enter money to be withdrawn:");  
        withdraw = scanner.nextInt();  

        if(balance >= withdraw)  
        {   
            balance = balance - withdraw;  
            System.out.println("Please collect your money");  
        }  
        else  
        {  
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("Enter money to be deposited:");   
        deposit = scanner.nextInt();  
                       
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        System.out.println("");  
        break;  
   
                case 3:  
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
   
                case 4:   
        System.exit(0);  
            }  
        }  
    }  
}  