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
		VariableValueClass value = new VariableValueClass();
		FileWriteClass fwc = new FileWriteClass();
		fwc.headerWrite();
		
		do {
			input = new InputClass();
			pc = new ProcessingClass();
			out = new OutputClass();
			orderList = new ArrayList<String>();
			totalPrice = 0;
			while (true) {

				input.inputAll(value);

				pc.calcAge(value.customerIDNumber, value);
				pc.calcAgeGroup(value.age);
				int calcPrice = pc.calcPriceProcess(value.ticketSelect, value.age);
				calcPrice = pc.calcDiscount(calcPrice, value.discountSelect);
				value.resultPrice = pc.calcResultPrice(value, calcPrice, value.ticketCount);
				
				fwc.dataWrite(out, value);
				
				totalPrice += value.resultPrice;
				pc.saveOrderList(value, orderList);
				input.inputOrderContinue(value);
				if (value.orderContinue == 2) {
					break;
				}
			}
			out.printResultReport(orderList, totalPrice);
			input.inputProgram(value);

		} while (value.programSelect != 2);
		fwc.fileClose();
	}
}