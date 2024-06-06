import java.util.*;
public class palindrome{
public static void main(String[] args){
int rem =0;
int rev =0;

Scanner sc =new Scanner(System.in);;
int n = sc.nextInt();
int temp = n;
while(n>0){
rem = n%10;
rev = (rev*10)+rem;
n = n/10;
}
if(temp==rev){
System.out.println("palindrome");
}
else{
System.out.println("not an palindrome");
}
}
}