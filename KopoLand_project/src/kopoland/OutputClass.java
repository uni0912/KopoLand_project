package kopoland;

import java.util.ArrayList;

public class OutputClass {

	public void printResultPrice(int resultPrice) {
		System.out.printf("������ %d ���Դϴ�.\n", resultPrice);
		System.out.printf("�����մϴ�.\n");
	}
	
	public String printTicketSelect(int ticketSelect) {
		String ticket = "";
		if (ticketSelect == 1) {
			ticket = "�ְ���";
		} else {
			ticket = "�߰���";
		}
		return ticket;
	}
	
	public String printAgeGroup(int age) {
		ProcessingClass pc = new ProcessingClass();
		String ageGroup = "";
		switch (pc.calcAgeGroup(age)) {
		case 1:
			ageGroup = "����(����)";
			break;
		case 2:
			ageGroup = "����";
			break;
		case 3:
			ageGroup = "û�ҳ�";
			break;
		case 4:
			ageGroup = "�";
			break;
		case 5:
			ageGroup = "���";
			break;
		}
		return ageGroup;
	}
	
	public String printDiscountType(int discountselect) {
		String discountType = "";
		switch(discountselect) {
		case 1 : 
			discountType = "*������� ����";
			break;
		case 2 : 
			discountType = "*����� �������";
			break;
		case 3 : 
			discountType = "*���������� �������";
			break;
		case 4 : 
			discountType = "*���ڳ� �������";
			break;
		case 5 : 
			discountType = "*�ӻ�� �������";
			break;
		}
		return discountType;
	}
	
	public void printResultReport(ArrayList<String> orderList, int totalPrice) {
		System.out.printf("Ƽ�� �߱��� �����մϴ�. �����մϴ�.\n\n");
		System.out.printf("======================KOPOLAND====================\n");
		for (int i = 0; i < orderList.size()-4; i+=5) {
			System.out.printf("%s %s  %s\t%s��\t%s\n\n", orderList.get(i), orderList.get(i+1),
					orderList.get(i+2), orderList.get(i+3), orderList.get(i+4));
		}
		System.out.printf("����� �Ѿ��� %d�� �Դϴ�\n", totalPrice);
		System.out.printf("==================================================\n\n");
	}
}
