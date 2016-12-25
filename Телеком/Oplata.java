public class Oplata {
	
public void oplatit(int sum, Abonent ab, AbonentList al, MainFile mf, WorkFile wf){
	//mf.fromMainFile(al);
	ab.setDebt(ab.getDebt()-sum);
	wf.inWorkFile(ab.getNumber(), sum);
	//mf.inMainFile(al);
}
}
	//for(int i =0; i< al.getSize(); i++){
		//if (al.seekAb1on(Long.valueOf(num)) != -1){
			//int index = al.seekAbon(new Integer(num));
			//al.getAbon(index).setDebt(al.getAbon(index).getDebt()-sum);
		//}
	//}

