import java.util.*;

public class armboundfunc{

static void arms(int l,int h){

for(int i = l;i<=h;i++){
int rem = 0;
int temp = i;
int count =0;
double arm =0;
while(temp>0){
temp= temp/10;
count = count+1;
}
temp =i;
while(temp>0){
rem = temp%10;
arm = arm+(Math.pow(rem,count));

temp = temp/10;
}



if (i == arm){
System.out.println(i);
}
/*else{
System.out.println("not an armstrong");
}*/
}}
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int l = sc.nextInt();
int h = sc.nextInt();
arms(l,h);
}
}

