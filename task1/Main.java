package task1;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFileFilter mFF = new MyFileFilter("jpg");
		File folder = new File(".");
		File newFolder = new File("example");
		File[] fileList = folder.listFiles(mFF);
		for (File file : fileList) {
			CopyFile.copy(file, newFolder.getPath());
		}
	}
}
