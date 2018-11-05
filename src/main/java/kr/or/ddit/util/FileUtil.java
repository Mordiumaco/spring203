package kr.or.ddit.util;

public class FileUtil {
	
	/**
	* Method : getFileExt
	* 작성자 : pc20
	* 변경이력 :
	* @param fileName
	* @return
	* Method 설명 : 파일 확장자 추출
	*/
	public String getFileExt(String fileName) {
		int position = fileName.lastIndexOf(".");
		if(position == -1) {
			return "";
		}
		String Ext = fileName.substring(position);
		return Ext;
	}
}
