package thema7.oop.verschachtelungen;

public class PasswordCheckerProgram {

	public static void main(String[] args) {
		String[] passwords = {"Pass1234", 
				"12345", 
				"StrongPass1", 
				"weakpass", 
				"Another1"};
		
		for (int i = 0; i < passwords.length; i++) {
			String password = passwords[i];
			if(isStrong(password)) {
				System.out.println(password + " is strong");
			} else {
				System.out.println(password + " is weak");
			}
		}
	}


	public static boolean isStrong(String password) {
		
		if(password.length() < 8) {
			return false;
		}
		
		boolean hasLetter = false;
		boolean hasNumber = false;
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			
			if(Character.isLetter(c)) {
				hasLetter = true;
			}
			
			if(Character.isDigit(c)) {
				hasNumber = true;
			}
		}
		
		return hasLetter && hasNumber;
	}

}
