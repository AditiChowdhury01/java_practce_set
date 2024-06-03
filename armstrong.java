import java.util.*;
public class armstrong{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

int rem = 0;
int temp = n;
int count =0;
double arm =0;
while(temp>0){
temp= temp/10;
count = count+1;
}
temp =n;
while(temp>0){
rem = temp%10;
arm = arm+(Math.pow(rem,count));

temp = temp/10;
}



if (n == arm){
System.out.println("armstrong");
}
else{
System.out.println("not an armstrong");
}
}
}
