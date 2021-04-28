package kopoland;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

public class KopoMain {
	
	public static void main(String[] args) throws ParseException, IOException {
		InputClass input;
		ProcessingClass pc;
		OutputClass out;
		ArrayList<String> orderList;
		int totalPrice;
		FileWriteClass fwc = new FileWriteClass();
		fwc.headerWrite();
		
		do {
			input = new InputClass();
			pc = new ProcessingClass();
			out = new OutputClass();
			orderList = new ArrayList<String>();
			totalPrice = 0;
			while (true) {

				input.inputAll();

				pc.calcAge(VariableValueClass.customerIDNumber);
				pc.calcAgeGroup(VariableValueClass.age);
				int calcPrice = pc.calcPriceProcess(VariableValueClass.ticketSelect, VariableValueClass.age);
				calcPrice = pc.calcDiscount(calcPrice, VariableValueClass.discountSelect);
				VariableValueClass.resultPrice = pc.calcResultPrice(calcPrice, VariableValueClass.ticketCount);
				
				fwc.dataWrite(out);
				
				totalPrice += VariableValueClass.resultPrice;
				pc.saveOrderList(orderList);
				input.inputOrderContinue();
				if (VariableValueClass.orderContinue == 2) {
					break;
				}
			}
			out.printResultReport(orderList, totalPrice);
			input.inputProgram();

		} while (VariableValueClass.programSelect != 2);
		fwc.fileClose();
	}
}