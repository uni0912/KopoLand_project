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
		System.out.println("������ �����ϼ���");
		System.out.println("1.�ְ���");
		System.out.println("2.�߰���");
		try {
			ticketSelect = scanner.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ticketSelect;
	}
	
	public int inputCustomerIDNumber() {
		int customerIDNumber = 0;
		System.out.println("��������� �Է��ϼ���");
		try {
			customerIDNumber = scanner.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return customerIDNumber;
	}
}
