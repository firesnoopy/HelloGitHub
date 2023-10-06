package hw05;

public class GenAuthCode {
	
	public static void main(String[] args) {
		genAuthCode();
	}
	
	public static void genAuthCode() {
        int codeLength = 8;
        String code = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String result = "";
        
		for (int i = 0; i < 8; i++) {
			int r = (int) (Math.random() * code.length());
			char c = code.charAt(r);
			result += c;
		}
		System.out.println("本次產生隨機碼為:");
		System.out.println(result);
	}
	

}
