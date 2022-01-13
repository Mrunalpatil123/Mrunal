import java.util.Scanner;

public class Registration {

public static void main(String[] args) { 
	Scanner sc=new Scanner(System.in);

while (true)

{
   System.out.println("Please Enter Username.."); String str=sc.next();

char [] charArray=str.toCharArray(); if(charArray.length>=8) 
{

System.out.println("true"); System.out.println(str+"_job");
break;


} else {



System.out.println("false");



}
}

}
}


