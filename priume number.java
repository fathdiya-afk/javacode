import java.util.scanner;
public class Prime numbers{
public static void main(string[]args){
Scanner sc=new scanner(System.in);
System.out.print("Enter the limit:");
int limit=sc.nextint();
System.out.println("Prime numbers up to "+limit+"are:");

for(int i=1;i<=num;i++){
if(num%i==0){
count++;
}
}
if(count==2){
System.out.print(num+"");
}
}
sc.close();
}
 