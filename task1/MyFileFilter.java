package task1;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {
	private String[] arr;

	public MyFileFilter(String... arr) {
		super();
		this.arr = arr;
	}

	private boolean check(String text) {
		for (String stringText : arr) {
			if (stringText.equals(text)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		int pointerIndex = pathname.getName().lastIndexOf(".");
		if (pointerIndex == -1) {
			return false;
		}
		String text = pathname.getName().substring(pointerIndex + 1);
		return check(text);
	}

}
