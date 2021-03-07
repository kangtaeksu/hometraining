package home.dos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileSystem {

	private File presentDirFile = new File("C:\\");

	public void fileListPrint() { //파일리스트 출력
		File[] fileList = presentDirFile.listFiles();
		//경로의 파일들을 배열로 리턴
		

		for (int i = 0; i < fileList.length; i++) {
			if (fileList[i].isDirectory()) {
				System.out.println(fileList[i].getName() + "\t<DIR>");
			} else {
				System.out.println(fileList[i].getName() + "\t<FILE>");
			}// 디렉토리면 이름 출력  파일이어도 이름출력.
		}
	}
/////////////////////
	public void moveDir(String dest) {//디렉토리 이동 
		File[] fileList = presentDirFile.listFiles(); //리스트받고
		File destFile = new File(presentDirFile, dest);
		for (int i = 0; i < fileList.length; i++) {
			if (fileList[i].getPath().equals(destFile.getPath())) {
				presentDirFile = destFile;
				return; //같은 경로면 파일경로 일치시킨다.
			}
		}
		System.out.println("해당파일 목록에 존재하지 않음");
	}
/////////////////
	public void moveSuperDir() {// 부모디렉토리로 이동한다

		String presentPath = presentDirFile.getPath();//현재경로 셍성
		int presentNameSize = presentDirFile.getName().length();
		
		String superPath = presentPath.substring(0, 
				presentPath.length() - presentNameSize);
		//부모경로는 현재경로에서 문자열 자르기 처음부터 (현재경로길이에서 자기이름만뺴기)
		//=부모경로만 남게됨
		presentDirFile = new File(superPath);// 
	}
///////////////////
	public void makeDir(String newDirName) {//새로운 디렉토리 생성
		File newDir = new File(presentDirFile, newDirName);
		File[] fileList = presentDirFile.listFiles();//리스트긁어와서

		for (int i = 0; i < fileList.length; i++) {
			if (fileList[i].getPath().equals(newDir.getPath())) {
				System.out.println("똑같은 이름의 파일이 존재 합니다.");
				return;
			}
		}
		newDir.mkdir();
	}
//////////////////////////
	public void copy(String sorceStr) { //현재 디렉토리에 모든 파일 복사
		if (sorceStr.lastIndexOf("\\") == -1) {//-1은 발견하지못함을 의미
			return;
		}

		String destStr = sorceStr.substring(sorceStr.lastIndexOf("\\") + 1);
		File sourceFile = new File(presentDirFile, sorceStr);
		File dest = new File(presentDirFile, destStr);

		copyAllFile(sourceFile, dest); //밑에 메서드불러오기
	}

	public void copyAllFile(File sourceFile, File dest) {
		if (sourceFile.isFile()) {
			File destFile = new File(dest, sourceFile.getName());
			copyFile(sourceFile, destFile); //파일이면 밑에 메서드 불러옴
			return;
		}

		File[] fileList = sourceFile.listFiles();
		dest.mkdir();// 생성메서드

		for (int i = 0; i < fileList.length; i++) {
			if (fileList[i].isDirectory()) {
				File destDir = new File(dest, fileList[i].getName());
				copyAllFile(fileList[i], destDir);
			} else {
				File destFile = new File(dest, fileList[i].getName());
				copyFile(fileList[i], destFile);
			}

		}
	}
//여기부분이 파일데이터스트림을 통한 파일 데이터 빨대꼽기
	public void copyFile(File sourceFile, File dest) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(sourceFile); //파일 불러오기
			fos = new FileOutputStream(dest);//파일 내보내기

			byte[] arrByte = new byte[5000]; //오천바이트씩

			while ((fis.read(arrByte)) != -1) { 
				//읽을수없으면 즉, -1일떄까지
				fos.write(arrByte); //계속 써내기
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("해당 파일이 존재하지 않습니다");
		} finally {
			try {
				if (fis != null) { 
					fis.close();
				}
				if (fos != null) {
					fos.close(); 
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
////////////get set
	public File getPresentDirFile() {
		return presentDirFile;
	}

	public void setPresentDirFile(File presentDirFile) {
		this.presentDirFile = presentDirFile;
	}

}
