package info;

import java.time.LocalDateTime;

public class SimpleBuildInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Loading required Info :: ");
		
		String javaVersion = Runtime.version().toString();
		String time = LocalDateTime.now().toString();
		System.out.println(String.format("********\n Build Time: %s \n Java Version: %s \n********", time, javaVersion));
		System.out.println("Webhooks Yayy !!!");

	}

}
