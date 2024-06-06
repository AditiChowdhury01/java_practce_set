import java.util.*;
public class prime{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int flag =0;
if(n==0||n==1){
System.out.println(" not prime");

}
//else if(n==2){
//flag =0;
//}
else{
for (int i=2;i<=n/2;i++){
if(n%i==0){
System.out.println(" not prime");

flag =1;

break;

}
}


if(flag ==0){
System.out.println("prime");}
}
}
}