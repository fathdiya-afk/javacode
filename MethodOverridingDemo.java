class Department{
void work(){
System.out.println("Department is working ");
}
}
class bca extends Department{
void work(){
System.out.println("bca Department is working");
}
}
public class 
MethodOverridingDemo{
public static void main(String[]args){
Department d=new Department();
d.work();
bca b=new bca ();
b.work();
department obj=new bca ();
obj.work();
}
}