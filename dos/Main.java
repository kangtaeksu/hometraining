package home.dos;

import java.util.Scanner;

public class Main {
//메인에서 기본명령어 선언(정규표현식활용)
	//서브스트링을 활용한 

	public static void main(String[] args) {

		FileSystem fileSystem = new FileSystem();
		Scanner scanner = new Scanner(System.in);
		String moveSuperReg = "^cd(\\p{Space})?\\.\\.$";
		String moveDirReg = "^cd\\p{Space}.+$";
		String mkdirReg = "^mkdir\\p{Space}.+$";
		String cpReg = "^cp\\p{Space}.+$";

		while (true) {
			System.out.print(fileSystem.getPresentDirFile().getPath());
			System.out.print(">");
			String command = scanner.nextLine().trim();

			if (command.equals("ls")) {
				fileSystem.fileListPrint();//matches 정규표현식 이퀄스
			} else if (command.matches(moveSuperReg)) {
				fileSystem.moveSuperDir();
			} else if (command.matches(moveDirReg)) {
				String modifyCommand = command.substring(3);
				fileSystem.moveDir(modifyCommand);
			} else if (command.matches(mkdirReg)) {
				String modifyCommand = command.substring(6);
				fileSystem.makeDir(modifyCommand);
			}
			
			else if (command.matches(cpReg)) {
				String modifyCommand = command.substring(3);
				fileSystem.copy(modifyCommand);
				
				
				
			} else if (command.equals("exit")) {
				scanner.close();
				System.exit(0);
			}

			System.out.println();
		}

	}

}
