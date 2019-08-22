import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {
public static void main(String[] args)throws IOException {
	File inputFile=new File("Farah.txt");
	File outputFile=new File("outagain.txt");
	FileInputStream in=new FileInputStream(inputFile);
	FileOutputStream out=new FileOutputStream(outputFile);
	int c;
	while((c=in.read())!= -1) {
		System.out.println(c);
		out.write(c);
	}
	System.out.println("FileInputStream");
	in.close();
	out.close();
}
}
