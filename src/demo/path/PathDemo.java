package demo.path;

public class PathDemo {

	public static void main(String[] args) {
		
		PathDemo pathDemo = new PathDemo();
		pathDemo.testV1();
	}
	
	public void test(){
		String rootPath = getClass().getResource("/").getFile().toString();
		System.out.println(rootPath);
	}
	
	public void testV1(){
		String relativelyPath = System.getProperty("user.dir");
		System.out.println(relativelyPath);
	}

}
