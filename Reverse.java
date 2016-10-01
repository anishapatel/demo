import java.util.Scanner;
class Reverse{
public static void main(String[] args){
Scanner sc=new Scanner (System.in);
int no,rev=0;
no=sc.nextInt();
while(no!=0){
rev=rev%10;
rev=rev/10;
no=no/10;
}
 System.out.println("Reverse of entered number is "+rev);
}
}
