package Assigned;
import java.util.*;
public class Email {
	public static void main(String[] args) {
		String k;
		boolean g=false;
		String[] array =new String[4];
		array[0]="mathi021120000@gmail.com";
		array[1]="krishnadevi002@gmail.com";
		array[2]="mbelectronlife@gmail.com";
		array[3]="rohini19745685@gmail.com";
		array[4]="balakrishnan52@gmail.com";
		array[5]="krithikapors56@gmail.com";
		array[6]="ponnihridya458@gmail.com";
		array[7]="kathiravanhyp7@gmail.com";
		array[8]="arunsankarfri4@gmail.com";
		array[9]="vladimieputin0@gmail.com";
		array[10]="kailashsater4@gmail.com";
		array[11]="monikamitrf12@gmail.com";
		array[12]="jukiloaft6789@gmail.com";
		System.out.println("Enter the mail id to be searched");
		Scanner o =new Scanner(System.in);
		k=o.nextLine();
		for(int i=0;i<4;i++)
		{
		g=array[i].equals(k);
		if(g==true)
		{
			System.out.println("The searched mail-id is found in the array ");
			break;
		}
		}
		if(g==false)
		{
			System.out.println("The given mail-id is not found");
		}
	}

}
