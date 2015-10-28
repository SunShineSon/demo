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

	// ��ʾĿ¼�ķ���
	public static void tree(File f) {
		// �жϴ�������Ƿ�Ϊһ���ļ��ж���
		if (!f.isDirectory()) {
			System.out.println("������Ĳ���һ���ļ��У�����·���Ƿ����󣡣�");
		} else {
			File[] t = f.listFiles();
			for (int i = 0; i < t.length; i++) {
				// �ж��ļ��б��еĶ����Ƿ�Ϊ�ļ��ж����������ִ��tree�ݹ飬ֱ���Ѵ��ļ����������ļ����Ϊֹ
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