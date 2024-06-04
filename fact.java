import java.util.*;
public class fact{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
//try{
int n = sc.nextInt();
int fact = 1;
for(int i = 2;i<=n;i++){
fact = fact*i;
}
System.out.println(fact);

//}
//catch(Exception e){
//System.out.println(e);
//}
}
}