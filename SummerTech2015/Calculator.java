import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean killswitch=true;
		
Scanner scan=new Scanner(System.in);

while (killswitch==true){

System.out.println("Imput a number.");
int firstnum=scan.nextInt();

System.out.println("Imput another number.");
int secondnum=scan.nextInt();

System.out.println("Which opperation would you like to perform?");
String Opperation=scan.next();

if (Opperation.equals("+")){
	System.out.println(firstnum+secondnum);
	killswitch=false;
}

else if (Opperation.equals("-")){
	System.out.println(firstnum-secondnum);
	killswitch=false;
}

else if (Opperation.equals("*")){
	System.out.println(firstnum*secondnum);
	killswitch=false;
}

else if (Opperation.equals("/")){
	System.out.println(firstnum/secondnum);
	killswitch=false;
}

else{
	System.out.println("You've made an error.");
}

}
	}

}
