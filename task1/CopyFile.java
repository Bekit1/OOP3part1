package task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void copy(File file, String directory) {
		try (FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream(directory + "/copy" + file.getName())) {
			byte[] buffer = new byte[1024];
			int byteread = 0;
			for (; (byteread = fis.read(buffer)) > 0;) {
				fos.write(buffer, 0, byteread);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
