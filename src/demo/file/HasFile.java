package demo.file;

import java.io.File;

public class HasFile {

	public static void main(String[] args) {
		File file = new File("E:\\eclipse\\plugin\\www");
		File[] fileList = file.listFiles();
		for(File list : fileList){
			System.out.println(list);
		}

	}

}
