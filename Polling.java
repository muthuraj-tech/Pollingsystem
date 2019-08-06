import java.util.*;


public class Polling {
	
	int[] vid = {111,222,333,444,555};
	Scanner sc=new Scanner(System.in);
	
	public void checkid(int id) {
		boolean found = false;
		for(int i=0;i<vid.length;i++) {
			if(id==(vid[i]))
			{
			found = true;
			}
			
		}
			if(found)
			{
				System.out.println("You can vote");
			}
		
		else {
			System.out.println("You can't vote");
			
		}
		}
	public void ward(int w) {
		Polling p=new Polling();
		System.out.println("Select the Canditate");
		switch(w) {
		
		case 1:
			p.Thirunelveli();
			break;
		case 2:
			p.Tuticorin();
			break;
		case 3:
			p.Sivakasi();
			break;
		case 4:
			p.Madurai();
			break;
		case 5:
			p.Chennai();
			break;
		default:
			System.out.println("Wrong selection");
			break;
		}
	}
	
	public void Thirunelveli() {
		Polling p=new Polling();
		int i;
		System.out.println(" 1.AAA \n 2.BBB \n 3.CCC");
		i=sc.nextInt();
		p.Thirunelvelicanditate(i);
		}
	
	public void Tuticorin() {
		Polling p=new Polling();
		int i;
		System.out.println(" 1.DDD \n 2.EEE \n 3.FFF");
		i=sc.nextInt();
		p.Tuticorincanditate(i);
		
	}
	public void Sivakasi() {
		Polling p=new Polling();
		int i;
		System.out.println(" 1.GGG \n 2.HHH \n 3.III");
		i=sc.nextInt();
		p.Sivakasicanditate(i);
		
	}
	public void Madurai(){
		Polling p=new Polling();
		int i;
		System.out.println(" 1.JJJ \n 2.KKK \n 3.LLL");
		i=sc.nextInt();
		p.Maduraicanditate(i);
		
	}
	public void Chennai() {
		Polling p=new Polling();
		int i;
		System.out.println(" 1.AAA \n 2.BBB \n 3.CCC");
		i=sc.nextInt();
		p.Chennaicanditate(i);
		
	}
	
	public void Thirunelvelicanditate(int i) {
		switch(i) {
		
			case 1:
				System.out.println("You voted for AAA");
				break;
			case 2:
				System.out.println("You voted for BBB");
				break;
			case 3:
				System.out.println("You voted for CCC");
				break;
			default:
				System.out.println("Worng option... Try again...");
				break;
		}
		
	}
	public void Tuticorincanditate(int i) {
		switch(i) {
		
			case 1:
				System.out.println("You voted for DDD");
				break;
			case 2:
				System.out.println("You voted for EEE");
				break;
			case 3:
				System.out.println("You voted for FFF");
				break;
			default:
				System.out.println("Worng option... Try again...");
				break;
		}
		
	}
	public void Sivakasicanditate(int i) {
		switch(i) {
		
			case 1:
				System.out.println("You voted for GGG");
				break;
			case 2:
				System.out.println("You voted for HHH");
				break;
			case 3:
				System.out.println("You voted for III");
				break;
			default:
				System.out.println("Worng option... Try again...");
				break;
		}
		
	}
	public void Maduraicanditate(int i) {
		switch(i) {
		
			case 1:
				System.out.println("You voted for JJJ");
				break;
			case 2:
				System.out.println("You voted for KKK");
				break;
			case 3:
				System.out.println("You voted for LLL");
				break;
			default:
				System.out.println("Worng option... Try again...");
				break;
		}
		
	}
	public void Chennaicanditate(int i) {
		switch(i) {
		
			case 1:
				System.out.println("You voted for");
				break;
			case 2:
				System.out.println("You voted for");
				break;
			case 3:
				System.out.println("You voted for");
				break;
			default:
				System.out.println("Worng option... Try again...");
				break;
		}
		
	}

	
	
	public static void main(String args[]) {
		int a,b;
		Polling p=new Polling();
		System.out.println("Enter your voter ID");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		p.checkid(a);
		System.out.println("Select the ward ");
		System.out.println(" 1.Thirunelveli \n 2.Tuticorin \n 3.Sivakasi \n 4.Madurai \n 5.Chennai");
		b=sc.nextInt();
		p.ward(b);
		sc.close();
	}
		}
	
