import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleEncryption {
	
	static int count=0;
void encrypt(String source,String dest,int a2) {
	BufferedReader reader;
	BufferedWriter writer;
	try {
		reader=new BufferedReader(new FileReader(source));
		writer=new BufferedWriter(new FileWriter(dest));
		String line=reader.readLine();
		int data;
		int vow=0;
		while(line !=null) {
			for(int i=0;i<line.length();i++) {
				data=(int) line.charAt(i)+a2;
				 vow=Vowels(line.charAt(i));
				writer.write(data);
			}
			writer.write(","+vow);
			count=0;
			writer.write((int)'\n');
			line=reader.readLine();
		}
		reader.close();
		writer.close();
		} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
public SimpleEncryption() {
	super();
}
public void viewFileContent(String filename) throws FileNotFoundException {
	BufferedReader reader;
	try {
		reader =new BufferedReader(new FileReader(filename));
		String line=reader.readLine();
		while(line!=null) {
			System.out.println(line);
			line=reader.readLine();
		}
		reader.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public int Vowels(char data) {
	if(data=='a' || data=='e' || data=='i'||data=='o'||data=='u') {
		count++;
	}
	return count;
	
}
}
