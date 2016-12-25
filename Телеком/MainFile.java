import java.util.*;
import java.io.*;

public class MainFile {
	
	private File mfile;
	
	public MainFile(){
		mfile = new File("D:\\MainFile.txt");
	}
	
	public MainFile(String str){
		mfile = new File(str);
	}
	
	
	public void inMainFile(AbonentList al){
		try(FileWriter mwriter = new FileWriter(mfile, false)){
			for (int i = 0; i < al.getSize(); i++){
				Abonent tmp = (Abonent) al.getAbon(i);
				mwriter.write(tmp.getNumber()+", "+tmp.getName()+", "+tmp.getSurname()+", "+tmp.getOtch()+", "+tmp.getAdress()+", "+tmp.getDebt());
				mwriter.write("\r\n");
			}
			mwriter.close();
		}
		catch(IOException ex){}
	}
	
	public void fromMainFile(AbonentList al){
		String [] words;
		Scanner sc;
		int i = 0;
		al.clear();
		try{
			sc = new Scanner(mfile);
			while(sc.hasNext()){
				String line = sc.nextLine();
				words = line.split(", ");
				al.addAbon(words[0], words[1], words[2], words[3], words[4], new Integer(words[5]));
				//al.getAbon(i).setNumber(new Integer(words[0]));
				//al.getAbon(i).setName(words[1]);
				//al.getAbon(i).setSurname(words[2]);
				//al.getAbon(i).setOtch(words[3]);
				//al.getAbon(i).setAdress(words[4]);
				//al.getAbon(i).setDebt(new Integer(words[5]));
				//i++;
			}
			//for (int j = al.getSize()-1; j > i; i--){
				//al.delAbon(j);
			//}
		}
		catch(FileNotFoundException ex){}
	}
	
}