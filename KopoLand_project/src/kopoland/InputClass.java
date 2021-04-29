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

	public int inputTicketSelect() { //���� ����
		System.out.println("������ �����ϼ���");
		System.out.println("1. �ְ���");
		System.out.println("2. �߰���");
		while (true) {
			VariableValueClass.ticketSelect = scanner.nextInt();
			if (VariableValueClass.ticketSelect == 1 || VariableValueClass.ticketSelect == 2) {
				return VariableValueClass.ticketSelect;
			} else {
				System.out.printf("�ùٸ� ���� �Է��ϼ���\n");
			}
		}
	}
	
	public String inputCustomerIDNumber() { //�������Է�
		System.out.println("��������� �Է��ϼ���");
		while (true) {
			VariableValueClass.customerIDNumber = scanner.next();
			if (VariableValueClass.customerIDNumber.length() == 6) {
				return VariableValueClass.customerIDNumber;
			} else {
				System.out.printf("����, ��, �� ������� 6�ڸ� ���ڸ� �Է��ϼ���\n");
			}
		}		
	}
	
	public int inputTicketCount() { //�ֹ������Է�
		System.out.println("��� �ֹ��Ͻðڽ��ϱ�?(�ִ�10��)");
		while (true) {
			VariableValueClass.ticketCount = scanner.nextInt();
			if (VariableValueClass.ticketCount >= 1 && VariableValueClass.ticketCount <= 10) {
				return VariableValueClass.ticketCount;
			} else {
				System.out.printf("1�̻� 10������ ���� �Է��ϼ���\n");
			}
		}
	}
	
	public int inputDiscountSlect() { //������ �Է�
		System.out.println("�������� �����ϼ���.");
		System.out.println("1. ����(���� ���� �ڵ�ó��)");
		System.out.println("2. �����");
		System.out.println("3. ����������");
		System.out.println("4. ���ڳ�");
		System.out.println("5. �ӻ��");
		while (true) {
			VariableValueClass.discountSelect = scanner.nextInt();
			if (VariableValueClass.discountSelect >= 1 && VariableValueClass.discountSelect <= 5) {
				return VariableValueClass.discountSelect;
			} else {
				System.out.printf("�ùٸ� ���� �Է��ϼ���\n");
			}
		}
	}
	
	public int inputOrderContinue() {
		System.out.println("��� �߱� �Ͻðڽ��ϱ�?");
		System.out.println("1. Ƽ�� �߱�");
		System.out.println("2. ����");
		while (true) {
			VariableValueClass.orderContinue = scanner.nextInt();
			if (VariableValueClass.orderContinue == 1 || VariableValueClass.orderContinue == 2) {
				return VariableValueClass.orderContinue;
			} else {
				System.out.printf("�ùٸ� ���� �Է��ϼ���\n");
			}
		}	
	}
	
	public int inputProgram() {
		System.out.print("������� (1: ���ο��ֹ�, 2: ���α׷� ����) :");
		while (true) {
			VariableValueClass.programSelect = scanner.nextInt();
			if (VariableValueClass.programSelect == 1 || VariableValueClass.programSelect == 2) {
				return VariableValueClass.programSelect;
			} else {
				System.out.printf("�ùٸ� ���� �Է��ϼ���\n");
			}
		}		
	}
	
	public void inputAll() {
		inputTicketSelect();
		inputCustomerIDNumber();
		inputTicketCount();
		inputDiscountSlect();
	}
}
