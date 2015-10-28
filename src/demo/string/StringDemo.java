package demo.string;



public class StringDemo {

	public static void main(String[] args){
		StringDemo demo = new StringDemo();
		demo.indexOfEmpty();
		
	}

	private static void subReplace() {
		String str = "com.foss.user.plugin.jnet.MyPlugin";
		System.out.println(str.replace(".", "\\"));
	}

	private static void stringSub() {
		String str = "a=2323; auth={name:'guo', mail:'ggl1314ggl@163.com'}";
		
		if(-1 != str.indexOf("auth")){
			System.out.println(str.substring(str.indexOf("auth=")+5));
		}
	}
	
	public static void test(String token){
		System.out.println(token.equals("3"));
		System.out.println(token=="3");
	}
	
	public void stringSubA(){
		String str = "com.fgd.fvgs.AA";
		String newStr = str.substring(str.lastIndexOf(".")+1);
		System.out.println(newStr);
	}
	
	public void stringSubB(){
		String str = "[{\"type\":\"permission\",\"name\":\"com.foreveross.chameleon.permission.JPUSH_MESSAGE\",\"protectionLevel\":\"signature\"},{\"type\":\"uses-permission\",\"name\":\"android.permission.BROADCAST_STICKY\"},{\"type\":\"uses-permission\",\"name\":\"android.permission.RECEIVE_USER_PRESENT\"},{\"type\":\"activity\",\"name\":\"com.foreveross.MainActivity\",\"launchMode\":\"singleTask\",\"childNodes\":[{\"type\":\"intent-filter\",\"childNodes\":[{\"type\":\"action\",\"name\":\"android.intent.action.MAIN\"},{\"type\":\"category\",\"name\":\"android.intent.category.LAUNCHER\"}]}]},{\"type\":\"receiver\",\"name\":\"com.foreveross.push.socket.ReceiverNetwork\",\"childNodes\":[{\"type\":\"intent-filter\",\"childNodes\":[{\"type\":\"action\",\"name\":\"android.net.conn.CONNECTIVITY_CHANGE\"}]}]}]";
	}
	
	
	public void spiaceString(){
		String str = "@\\";
		System.out.println(str);
	}
	
	public void indexOfEmpty(){
		String str = "Android and ios";
		System.out.println(str.indexOf(" "));
	}
	
	
	
	
	
}
