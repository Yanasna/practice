#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>
#include<windows.h>


void gameStart() {
	printf("������������������������������������\n");
	printf("������������������������������������\n");
	printf("������������������������������������\n");
	printf("������������������������������������\n");
	printf("�����Space Ű�� ������ ���ӽ��ۡ���������\n");
	printf("������������������������������������\n");
	printf("������������������������������������\n");
	printf("������������������������������������\n");
	printf("������������������������������������\n");

	char passed_key;
	passed_key = _getch();
		if (passed_key == 32) {
			system("cls");
			return username();
		}
		else {
			system("cls");
			printf("!!! �ٸ�Ű�� �����ּ��� !!!\n");
			return gameStart();
		}
}

void username() {
	char user_name[18];
	printf("%-20.s\nȯ���մϴ�!");
	printf("���谡��, ����� �̸��� �����ΰ���?(6���� �̳��� �Է����ּ���~");
	scanf_s("%c");
}


main() {
	gameStart();

}
