import java.util.*;

public class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AbonentList al = new AbonentList();
		MainFile mf = new MainFile();
		WorkFile wf = new WorkFile();
		while(true){
			System.out.println("1. �������� ��������");
			System.out.println("2. ������� ��������");
			System.out.println("3. ��������� �����");
			int menu = sc.nextInt();
			switch(menu){
			case 1:
				System.out.println("������� �����");
				String num = sc.nextLine();
				System.out.println("������� ���");
				String nam = sc.nextLine();
				System.out.println("������� �������");
				String sur = sc.nextLine();
				System.out.println("������� ��������");
				String otc = sc.nextLine();
				System.out.println("������� �����");
				String adr = sc.nextLine();
				System.out.println("������� ����");
				int deb = sc.nextInt();
				al.addAbon(num, nam, sur, otc, adr, deb);
				mf.inMainFile(al);
				break;
			case 2:
				System.out.println("������� ������");
				int ind = sc.nextInt();
				if((ind >= 0)&&(ind < al.getSize())){
					al.delAbon(ind);
				}
				else System.out.println("����� �� ����������");
				break;
			case 3:
				new StartForm(al, mf, wf);
				break;
			}
		}
	}

}
