import java.util.*;
public class primebound {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int l = sc.nextInt();
int h = sc.nextInt();
for(int i=l;i<=h;i++){
int flag =0;
/*if(i==0||i==1){
System.out.println(" not prime");

}*/
if(i==2){
flag =0;
}
else{
for (int j=2;j<=h/2;i++){
if(i%j==0){
//System.out.println(i);

flag =1;

continue;

}
}


if(flag ==0){
System.out.println(i);}
}
}
}
}