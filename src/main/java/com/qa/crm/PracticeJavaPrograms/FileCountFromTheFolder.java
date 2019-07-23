package com.qa.crm.PracticeJavaPrograms;

import java.io.File;

class FileCountFromTheFolder {
	
	public static void fileCount() {
		
		
		File file = new File("C:\\Users\\dgubend\\Desktop\\Dhina\\EOD report");
		
		int fileCount = file.listFiles().length;
		System.out.println("Files count of the given folder: " + fileCount);
		
	}
	public static void main(String[] args) {
		fileCount();
	}

}
