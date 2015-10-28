package demo.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AllFile {

	public static void main(String[] args) {
		File f = new File("E:\\plugin");
		//getFileList("E:\\plugin");
		showAllFiles(f);
	}

	public static void getFileList(String path) {
		List list = new ArrayList();
		try {
			File file = new File(path);
			String[] filelist = file.list();
			for (int i = 0; i < filelist.length; i++) {
				System.out.println(path + "\\" + filelist[i]);
				getFileList(path + "\\" + filelist[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 显示目录的方法
	public static void tree(File f) {
		// 判断传入对象是否为一个文件夹对象
		if (!f.isDirectory()) {
			System.out.println("你输入的不是一个文件夹，请检查路径是否有误！！");
		} else {
			File[] t = f.listFiles();
			for (int i = 0; i < t.length; i++) {
				// 判断文件列表中的对象是否为文件夹对象，如果是则执行tree递归，直到把此文件夹中所有文件输出为止
				if (t[i].isDirectory()) {
					System.out.println(t[i].getName() + "\tttdir");
					tree(t[i]);
				} else {
					System.out.println(t[i].getName() + "tFile");
				}
			}
		}
	}

	public static void showAllFiles(File dir) {
		File[] fs = dir.listFiles();
		for (int i = 0; i < fs.length; i++) {
			System.out.println(fs[i].getAbsolutePath());
			if (fs[i].isDirectory()) {
				try {
					showAllFiles(fs[i]);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}