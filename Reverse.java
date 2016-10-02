import java.util.Scanner;
class Reverse{
public static void main(String[] args){
Scanner sc=new Scanner (System.in);
int m=0,no,rev=0;
no=sc.nextInt();
while(no!=0){
m=no%10;
rev=rev*10+m;
no=no/10;
}
 System.out.println("Reverse of entered number is "+rev);
}
}
