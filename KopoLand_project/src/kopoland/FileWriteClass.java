package kopoland;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileWriteClass {
	private FileWriter fw;
	private boolean isFileExist;
	
	public FileWriteClass() {
		try {
			File file = new File(ConstValueClass.FILE_PATH);
			if(file.exists() == false) {
				isFileExist = false;
			} else {
				isFileExist = true;
			}
			fw = new FileWriter(ConstValueClass.FILE_PATH, true);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileClose() {
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void headerWrite() throws IOException {
		if(isFileExist == false) {
			String head = "날짜," + "권종," + "연령구분," + "수량," + "가격," + "우대사항" + "\n";
			fw.write(head);
		}		
	}
	
	public void dataWrite(OutputClass out, VariableValueClass value) throws IOException {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		
		String result = sdf.format(c.getTime()) + "," 
				+ out.printTicketSelect(value.ticketSelect) + ","
				+ out.printAgeGroup(value.age) + ","
				+ value.ticketCount + ","
				+ value.resultPrice + ","
				+ out.printDiscountType(value.discountSelect) + "\n";
						
		fw.write(result);
	}	
}
