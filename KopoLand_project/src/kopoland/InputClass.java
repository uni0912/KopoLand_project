package kopoland;

import java.util.Scanner;

public class InputClass {
	Scanner scanner = null;
	
	InputClass() { //생성자 입력
		scanner = new Scanner(System.in);
	}
	
	protected void finalize() {
		scanner.close();
	}

	public int inputTicketSelect(VariableValueClass value) { //권종 선택
		System.out.println("권종을 선택하세요");
		System.out.println("1. 주간권");
		System.out.println("2. 야간권");
		while (true) {
			value.ticketSelect = scanner.nextInt();
			if (value.ticketSelect == 1 || value.ticketSelect == 2) {
				return value.ticketSelect;
			} else {
				System.out.printf("올바른 값을 입력하세요\n");
			}
		}
	}
	
	public String inputCustomerIDNumber(VariableValueClass value) { //고객정보입력
		System.out.println("생년월일을 입력하세요");
		while (true) {
			value.customerIDNumber = scanner.next();
			if (value.customerIDNumber.length() == 6) {
				return value.customerIDNumber;
			} else {
				System.out.printf("연도, 월, 일 순서대로 6자리 숫자를 입력하세요\n");
			}
		}		
	}
	
	public int inputTicketCount(VariableValueClass value) { //주문개수입력
		System.out.println("몇개를 주문하시겠습니까?(최대10개)");
		while (true) {
			value.ticketCount = scanner.nextInt();
			if (value.ticketCount >= 1 && value.ticketCount <= 10) {
				return value.ticketCount;
			} else {
				System.out.printf("1이상 10이하의 갑을 입력하세요\n");
			}
		}
	}
	
	public int inputDiscountSlect(VariableValueClass value) { //우대사항 입력
		System.out.println("우대사항을 선택하세요.");
		System.out.println("1. 없음(나이 우대는 자동처리)");
		System.out.println("2. 장애인");
		System.out.println("3. 국가유공자");
		System.out.println("4. 다자녀");
		System.out.println("5. 임산부");
		while (true) {
			value.discountSelect = scanner.nextInt();
			if (value.discountSelect >= 1 && value.discountSelect <= 5) {
				return value.discountSelect;
			} else {
				System.out.printf("올바른 값을 입력하세요\n");
			}
		}
	}
	
	public int inputOrderContinue(VariableValueClass value) {
		System.out.println("계속 발권 하시겠습니까?");
		System.out.println("1. 티켓 발권");
		System.out.println("2. 종료");
		while (true) {
			value.orderContinue = scanner.nextInt();
			if (value.orderContinue == 1 || value.orderContinue == 2) {
				return value.orderContinue;
			} else {
				System.out.printf("올바른 값을 입력하세요\n");
			}
		}	
	}
	
	public int inputProgram(VariableValueClass value) {
		System.out.print("계속진행 (1: 새로운주문, 2: 프로그램 종료) :");
		while (true) {
			value.programSelect = scanner.nextInt();
			if (value.programSelect == 1 || value.programSelect == 2) {
				return value.programSelect;
			} else {
				System.out.printf("올바른 값을 입력하세요\n");
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
