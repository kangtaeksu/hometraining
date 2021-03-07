package home.dos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileSystem {

	private File presentDirFile = new File("C:\\");

	public void fileListPrint() { //���ϸ���Ʈ ���
		File[] fileList = presentDirFile.listFiles();
		//����� ���ϵ��� �迭�� ����
		

		for (int i = 0; i < fileList.length; i++) {
			if (fileList[i].isDirectory()) {
				System.out.println(fileList[i].getName() + "\t<DIR>");
			} else {
				System.out.println(fileList[i].getName() + "\t<FILE>");
			}// ���丮�� �̸� ���  �����̾ �̸����.
		}
	}
/////////////////////
	public void moveDir(String dest) {//���丮 �̵� 
		File[] fileList = presentDirFile.listFiles(); //����Ʈ�ް�
		File destFile = new File(presentDirFile, dest);
		for (int i = 0; i < fileList.length; i++) {
			if (fileList[i].getPath().equals(destFile.getPath())) {
				presentDirFile = destFile;
				return; //���� ��θ� ���ϰ�� ��ġ��Ų��.
			}
		}
		System.out.println("�ش����� ��Ͽ� �������� ����");
	}
/////////////////
	public void moveSuperDir() {// �θ���丮�� �̵��Ѵ�

		String presentPath = presentDirFile.getPath();//������ �ļ�
		int presentNameSize = presentDirFile.getName().length();
		
		String superPath = presentPath.substring(0, 
				presentPath.length() - presentNameSize);
		//�θ��δ� �����ο��� ���ڿ� �ڸ��� ó������ (�����α��̿��� �ڱ��̸�������)
		//=�θ��θ� ���Ե�
		presentDirFile = new File(superPath);// 
	}
///////////////////
	public void makeDir(String newDirName) {//���ο� ���丮 ����
		File newDir = new File(presentDirFile, newDirName);
		File[] fileList = presentDirFile.listFiles();//����Ʈ�ܾ�ͼ�

		for (int i = 0; i < fileList.length; i++) {
			if (fileList[i].getPath().equals(newDir.getPath())) {
				System.out.println("�Ȱ��� �̸��� ������ ���� �մϴ�.");
				return;
			}
		}
		newDir.mkdir();
	}
//////////////////////////
	public void copy(String sorceStr) { //���� ���丮�� ��� ���� ����
		if (sorceStr.lastIndexOf("\\") == -1) {//-1�� �߰����������� �ǹ�
			return;
		}

		String destStr = sorceStr.substring(sorceStr.lastIndexOf("\\") + 1);
		File sourceFile = new File(presentDirFile, sorceStr);
		File dest = new File(presentDirFile, destStr);

		copyAllFile(sourceFile, dest); //�ؿ� �޼���ҷ�����
	}

	public void copyAllFile(File sourceFile, File dest) {
		if (sourceFile.isFile()) {
			File destFile = new File(dest, sourceFile.getName());
			copyFile(sourceFile, destFile); //�����̸� �ؿ� �޼��� �ҷ���
			return;
		}

		File[] fileList = sourceFile.listFiles();
		dest.mkdir();// �����޼���

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
//����κ��� ���ϵ����ͽ�Ʈ���� ���� ���� ������ ����ű�
	public void copyFile(File sourceFile, File dest) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(sourceFile); //���� �ҷ�����
			fos = new FileOutputStream(dest);//���� ��������

			byte[] arrByte = new byte[5000]; //��õ����Ʈ��

			while ((fis.read(arrByte)) != -1) { 
				//������������ ��, -1�ϋ�����
				fos.write(arrByte); //��� �᳻��
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("�ش� ������ �������� �ʽ��ϴ�");
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
