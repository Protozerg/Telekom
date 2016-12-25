import java.io.*;

public class WorkFile {
	
	private File wfile;
	
	public WorkFile(){
		wfile = new File("D:\\WorkFile.txt");
	}
	
	public WorkFile(String str){
		wfile = new File(str);
	}
	
	public void inWorkFile(String num, int sum){
		try(FileWriter wwriter = new FileWriter(wfile, true)){
			wwriter.write(num+", "+sum);
			wwriter.write("\r\n");
			wwriter.close();
		}
		catch(IOException ex){}
	}
	
	public File getFile(){
		return wfile;
	}

}
