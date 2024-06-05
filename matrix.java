import java.util.*;
public class matrix{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int [][] arr= new int[n][n];
for(int i = 0;i<arr.length;i++){
for(int j = 0;j<arr.length;j++){

arr[i][j] = sc.nextInt();
}
}
for(int i = 0;i<n;i++){
for(int j = 0;j<n;j++){

System.out.print(arr[i][j] +" ");


}
System.out.println();

}

int sum1=0;
int sum2=0;

for(int i = 0;i<n;i++){
for(int j = 0;j<n;j++){


if(i==j){
sum1 = sum1+arr[i][j];
}
if(i+j==(n-1)){
sum2 = sum2+arr[i][j];
}
}}

System.out.println(sum1);
System.out.println(sum2);


}
}