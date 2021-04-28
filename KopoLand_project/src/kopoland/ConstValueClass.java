package kopoland;

public class ConstValueClass {
	//�ְ���/�߰��ǿ� ���� ���̺� ����
	final static int BABY_PRICE = 0;
	final static int ADULT_DAY_PRICE = 56000, ADULT_NIGHT_PRICE = 46000;
	final static int TEEN_DAY_PRICE = 47000, TEEN_NIGHT_PRICE = 40000;
	final static int CHILD_DAY_PRICE = 44000, CHILD_NIGHT_PRICE = 37000;
	final static int OLD_DAY_PRICE = 44000, OLD_NIGHT_PRICE = 37000;
	//���̿� ���� �׷�
	final static int BABY = 1, CHILD = 2, TEEN = 3, ADULT = 4, OLD = 5;
	//���̿� ���� ����
	final static int MAX_BABY = 2;
	final static int MAX_CHILD = 12;
	final static int MAX_TEEN = 18;
	final static int MAX_ADULT = 64;

	//�����׿� ���� ������
	final static double DISABLE_DISCOUNT_RATE = 0.6, MERIT_DISCOUNT_RATE = 0.5,
			MULTICHILD_DISCOUNT_RATE = 0.8, PREGNANT_DISCOUNT_RATE = 0.85;
	
	final static String FILE_PATH = "KopoLand.csv";
}