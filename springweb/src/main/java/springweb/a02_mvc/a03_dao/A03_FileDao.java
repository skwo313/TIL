package springweb.a02_mvc.a03_dao;

import java.util.ArrayList;

import springweb.vo.FileInfo;

public interface A03_FileDao {
	public void insertFileInfo(FileInfo ins);
	public ArrayList<FileInfo> getFileList();
}
