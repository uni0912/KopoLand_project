package kopoland;

import java.util.ArrayList;

public class OutputClass {

	public void printResultPrice(int resultPrice) {
		System.out.printf("가격은 %d 원입니다.\n", resultPrice);
		System.out.printf("감사합니다.\n");
	}
	
	public String printTicketSelect(int ticketSelect) {
		String ticket = "";
		if (ticketSelect == 1) {
			ticket = "주간권";
		} else {
			ticket = "야간권";
		}
		return ticket;
	}
	
	public String printAgeGroup(int age) {
		ProcessingClass pc = new ProcessingClass();
		String ageGroup = "";
		switch (pc.calcAgeGroup(age)) {
		case 1:
			ageGroup = "유아(무료)";
			break;
		case 2:
			ageGroup = "소인";
			break;
		case 3:
			ageGroup = "청소년";
			break;
		case 4:
			ageGroup = "어른";
			break;
		case 5:
			ageGroup = "경로";
			break;
		}
		return ageGroup;
	}
	
	public String printDiscountType(int discountselect) {
		String discountType = "";
		switch(discountselect) {
		case 1 : 
			discountType = "*우대적용 없음";
			break;
		case 2 : 
			discountType = "*장애인 우대적용";
			break;
		case 3 : 
			discountType = "*국가유공자 우대적용";
			break;
		case 4 : 
			discountType = "*다자녀 우대적용";
			break;
		case 5 : 
			discountType = "*임산부 우대적용";
			break;
		}
		return discountType;
	}
	
	public void printResultReport(ArrayList<String> orderList, int totalPrice) {
		System.out.printf("티켓 발권을 종료합니다. 감사합니다.\n\n");
		System.out.printf("======================KOPOLAND====================\n");
		for (int i = 0; i < orderList.size()-4; i+=5) {
			System.out.printf("%s %s  %s\t%s원\t%s\n\n", orderList.get(i), orderList.get(i+1),
					orderList.get(i+2), orderList.get(i+3), orderList.get(i+4));
		}
		System.out.printf("입장료 총액은 %d원 입니다\n", totalPrice);
		System.out.printf("==================================================\n\n");
	}
}
