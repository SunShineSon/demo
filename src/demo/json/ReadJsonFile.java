package demo.json;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJsonFile {

	public static void main(String[] args) {
		String strJson = readJson("E:\\plugin.json");
		System.out.println(strJson.replaceAll("\"", ""));
	}

	// �Ӹ���λ�ö�ȡJson�ļ�
	public static String readJson(String path) {
		// �Ӹ���λ�û�ȡ�ļ�
		File file = new File(path);
		BufferedReader reader = null;
		// ����ֵ,ʹ��StringBuffer
		StringBuffer data = new StringBuffer();
		//
		try {
			reader = new BufferedReader(new FileReader(file));
			// ÿ�ζ�ȡ�ļ��Ļ���
			String temp = null;
			while ((temp = reader.readLine()) != null) {
				data.append(temp);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// �ر��ļ���
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return data.toString();
	}
}
