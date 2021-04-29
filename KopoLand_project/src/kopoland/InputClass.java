package kopoland;

import java.util.Scanner;

public class InputClass {
	Scanner scanner = null;
	
	InputClass() { //������ �Է�
		scanner = new Scanner(System.in);
	}
	
	protected void finalize() {
		scanner.close();
	}

	public int inputTicketSelect(VariableValueClass value) { //���� ����
		System.out.println("������ �����ϼ���");
		System.out.println("1. �ְ���");
		System.out.println("2. �߰���");
		while (true) {
			value.ticketSelect = scanner.nextInt();
			if (value.ticketSelect == 1 || value.ticketSelect == 2) {
				return value.ticketSelect;
			} else {
				System.out.printf("�ùٸ� ���� �Է��ϼ���\n");
			}
		}
	}
	
	public String inputCustomerIDNumber(VariableValueClass value) { //�������Է�
		System.out.println("��������� �Է��ϼ���");
		while (true) {
			value.customerIDNumber = scanner.next();
			if (value.customerIDNumber.length() == 6) {
				return value.customerIDNumber;
			} else {
				System.out.printf("����, ��, �� ������� 6�ڸ� ���ڸ� �Է��ϼ���\n");
			}
		}		
	}
	
	public int inputTicketCount(VariableValueClass value) { //�ֹ������Է�
		System.out.println("��� �ֹ��Ͻðڽ��ϱ�?(�ִ�10��)");
		while (true) {
			value.ticketCount = scanner.nextInt();
			if (value.ticketCount >= 1 && value.ticketCount <= 10) {
				return value.ticketCount;
			} else {
				System.out.printf("1�̻� 10������ ���� �Է��ϼ���\n");
			}
		}
	}
	
	public int inputDiscountSlect(VariableValueClass value) { //������ �Է�
		System.out.println("�������� �����ϼ���.");
		System.out.println("1. ����(���� ���� �ڵ�ó��)");
		System.out.println("2. �����");
		System.out.println("3. ����������");
		System.out.println("4. ���ڳ�");
		System.out.println("5. �ӻ��");
		while (true) {
			value.discountSelect = scanner.nextInt();
			if (value.discountSelect >= 1 && value.discountSelect <= 5) {
				return value.discountSelect;
			} else {
				System.out.printf("�ùٸ� ���� �Է��ϼ���\n");
			}
		}
	}
	
	public int inputOrderContinue(VariableValueClass value) {
		System.out.println("��� �߱� �Ͻðڽ��ϱ�?");
		System.out.println("1. Ƽ�� �߱�");
		System.out.println("2. ����");
		while (true) {
			value.orderContinue = scanner.nextInt();
			if (value.orderContinue == 1 || value.orderContinue == 2) {
				return value.orderContinue;
			} else {
				System.out.printf("�ùٸ� ���� �Է��ϼ���\n");
			}
		}	
	}
	
	public int inputProgram(VariableValueClass value) {
		System.out.print("������� (1: ���ο��ֹ�, 2: ���α׷� ����) :");
		while (true) {
			value.programSelect = scanner.nextInt();
			if (value.programSelect == 1 || value.programSelect == 2) {
				return value.programSelect;
			} else {
				System.out.printf("�ùٸ� ���� �Է��ϼ���\n");
			}
		}		
	}
	
	public void inputAll(VariableValueClass value) {
		inputTicketSelect(value);
		inputCustomerIDNumber(value);
		inputTicketCount(value);
		inputDiscountSlect(value);
	}
}
