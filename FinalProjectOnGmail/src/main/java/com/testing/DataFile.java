package com.testing;

public interface DataFile {
	
	Xls_Reader d = new Xls_Reader("D:\\DEV_IT_TRAINING\\DIT_Selenium\\FinalProjectOnGmail\\ProjectData\\Gmail_Credentials.xlsx");
	public String URL = d.getCellData("URL", 1, 1);

	public String validUser = d.getCellData("Sheet1", 0, 2);
	public String validPwd = d.getCellData("Sheet1", 1, 2);
	
	//invalid credentials
	public String invalidUser = d.getCellData("Sheet1", 0, 3);
	public String invalidPwd = d.getCellData("Sheet1", 1, 3);
	
		
	
	
}
