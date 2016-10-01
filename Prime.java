class Prime{
public static void main(String[] args){
int a=0,i,j;
System.out.println("prime nos");
for(i=0;i<20;i++)
for(j=2;j<=i;++j){
if(i%j==0)
a=j;
break;
}
if(a==0){
System.out.println(i);
}
}
}