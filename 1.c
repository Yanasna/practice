#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<time.h>


//���� ���� ���� ���Ǳ⸦ Ÿ�����ϸ� ������� �������� �����°�
//���߿� ���Ұ� ����.
//�׸��� �� �԰������ ���� �� ���� ����� ������ ���� �Լ����� Ƣ�������
void drink_rand() {
	srand(time(NULL));
	int drkrand = 0;
	drkrand = rand() %5 + 1;

	switch (drkrand) {
	case 1 : 
		printf("Ģ�� !!");
		break;

	case 2 : 
		printf("�ٳ���ű !!");
		break;
	case 3 : 
		printf("��īĨ !!");
		break;

	case 4 : 
		printf("����Ĩ !!");
		break;
	case 5 : 
		printf("���̾� ����");
	}
}


main(void)
{
	printf("���Ǳ⸦ �Է��ϸ� �������� ����� ���� >> ");
	char zapanki[15];
	fgets(zapanki, 15, stdin); //fgets(����, ��ŭ, stdin)
	zapanki[strcspn(zapanki, "\n")] = 0; //������ �Լ�[strcspn(������ ����, ������ ����)];

	if (strcmp(zapanki, "���Ǳ�") == 0) //strcmp(����, "���� ���ڿ�")== 0;  --> 0�� �Ǿ�� ���̴�.
	{ 
		drink_rand();
	}
	else {
		printf("�ʿ���ٸ� ���̹���");
	}
	return 0;
}