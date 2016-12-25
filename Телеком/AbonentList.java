import java.util.*;

public class AbonentList {
	
	private ArrayList<Abonent> list = new ArrayList<Abonent>();
	
	public void addAbon(String num, String nam, String sur, String otc, String adr, int deb){
		list.add(new Abonent(num, nam, sur, otc, adr, deb));
	}
	
	public void delAbon(int index){
		list.remove(index);
	}
	
	public int getSize(){
		return list.size();
	}
	
	public Abonent getAbon(int index){
		return list.get(index);
	}
	
	public void clear(){
		list.clear();
	}
	
	public int seekAbon(String num){
		int ind = -1;
		for (int i = 0; i < list.size(); i++){
			if(list.get(i).getNumber().equals(num)){
				ind = i;
			}
		}
		return ind;
	}
	
}