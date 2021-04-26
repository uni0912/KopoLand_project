package kopoland;

import java.util.Scanner;

public class InputClass {
	Scanner scanner = null;
	
	InputClass() {
		scanner = new Scanner(System.in);
	}
	
	protected void finalize() {
		scanner.close();
	}

	public int inputTicketSelect() {
		int ticketSelect = 0;
		System.out.println("권종을 선택하세요");
		System.out.println("1.주간권");
		System.out.println("2.야간권");
		try {
			ticketSelect = scanner.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ticketSelect;
	}
	
	public int inputCustomerIDNumber() {
		int customerIDNumber = 0;
		System.out.println("생년월일을 입력하세요");
		try {
			customerIDNumber = scanner.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return customerIDNumber;
	}
}
