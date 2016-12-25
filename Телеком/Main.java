import java.util.*;

public class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AbonentList al = new AbonentList();
		MainFile mf = new MainFile();
		WorkFile wf = new WorkFile();
		while(true){
			System.out.println("1. Äîáàâèòü àáîíåíòà");
			System.out.println("2. Óäàëèòü àáîíåíòà");
			System.out.println("3. Çàïóñòèòü ôîğìó");
			int menu = sc.nextInt();
			switch(menu){
			case 1:
				System.out.println("Ââåäèòå íîìåğ");
				String num = sc.nextLine();
				System.out.println("Ââåäèòå èìÿ");
				String nam = sc.nextLine();
				System.out.println("Ââåäèòå ôàìèëèş");
				String sur = sc.nextLine();
				System.out.println("Ââåäèòå îò÷åñòâî");
				String otc = sc.nextLine();
				System.out.println("Ââåäèòå àäğåñ");
				String adr = sc.nextLine();
				System.out.println("Ââåäèòå äîëã");
				int deb = sc.nextInt();
				al.addAbon(num, nam, sur, otc, adr, deb);
				mf.inMainFile(al);
				break;
			case 2:
				System.out.println("Ââåäèòå èíäåêñ");
				int ind = sc.nextInt();
				if((ind >= 0)&&(ind < al.getSize())){
					al.delAbon(ind);
				}
				else System.out.println("Íîìåğ íå ñóùåñòâóåò");
				break;
			case 3:
				new StartForm(al, mf, wf);
				break;
			}
		}
	}

}
