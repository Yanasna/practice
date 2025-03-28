#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>
#include<windows.h>


void gameStart() {
	printf("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
	printf("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
	printf("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
	printf("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
	printf("■■■■Space 키를 누르면 게임시작■■■■■■■■■\n");
	printf("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
	printf("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
	printf("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
	printf("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");

	char passed_key;
	passed_key = _getch();
		if (passed_key == 32) {
			system("cls");
			return username();
		}
		else {
			system("cls");
			printf("!!! 다른키를 눌러주세요 !!!\n");
			return gameStart();
		}
}

void username() {
	char user_name[18];
	printf("%-20.s\n환영합니다!");
	printf("모험가님, 당신의 이름은 무엇인가요?(6글자 이내로 입력해주세요~");
	scanf_s("%c");
}


main() {
	gameStart();

}
