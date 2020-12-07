package Frontend;

import java.util.List;

import Utils.FileManager;

public class File {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		question1();
//		question2();
//		question4();
//		question5();
		question6();
	}










	private static void question1() {
		// TODO Auto-generated method stub
		System.out.println(FileManager.isFileExists("D:\\File\\file_test.txt"));
	}

	private static void question2() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(FileManager.createNewFile("D:\\File", "file_test2.txt"));
	}

	private static void question4() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(FileManager.deleteFile("D:\\File\\file_test2.txt"));
	}

	private static void question5() {
		// TODO Auto-generated method stub
		System.out.println(FileManager.isFolder("D:\\File\\"));
	}

	private static void question6() throws Exception {
		// TODO Auto-generated method stub
		List<String> str = FileManager.getAllFileName("D:\\File\\");
		System.out.println(str);
	}

	
	

}
