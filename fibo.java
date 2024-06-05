import java.util.*;
public class fibo{
public static int fi(int n){
if(n == 0|| n==1){
return n;
}
//int a = 0;
//int b = 1;
//System.out.println(a+" ");
//System.out.println(b+" ");
else{

//int c = a+b;
//System.out.println(c+" ");
return fi(n-1)+fi(n-2);
//a=b;
//b=c;
}
}

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

for (int i =0;i<=n;i++){
System.out.println(fi(i));
}


}
}