#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<time.h>


//오늘 만들어볼 것은 자판기를 타이핑하면 음료수가 랜덤으로 나오는것
//나중에 더할거 과자.
//그리고 뭘 먹고싶은지 선택 후 과자 음료수 선택후 랜덤 함수에서 튀어나오도록
void drink_rand() {
	srand(time(NULL));
	int drkrand = 0;
	drkrand = rand() %5 + 1;

	switch (drkrand) {
	case 1 : 
		printf("칙촉 !!");
		break;

	case 2 : 
		printf("바나나킥 !!");
		break;
	case 3 : 
		printf("포카칩 !!");
		break;

	case 4 : 
		printf("스윙칩 !!");
		break;
	case 5 : 
		printf("꽝이야 ㅋㅋ");
	}
}


main(void)
{
	printf("자판기를 입력하면 랜덤으로 음료수 증정 >> ");
	char zapanki[15];
	fgets(zapanki, 15, stdin); //fgets(변수, 얼만큼, stdin)
	zapanki[strcspn(zapanki, "\n")] = 0; //제거할 함수[strcspn(제거할 변수, 제거할 문자)];

	if (strcmp(zapanki, "자판기") == 0) //strcmp(변수, "비교할 문자열")== 0;  --> 0이 되어야 참이다.
	{ 
		drink_rand();
	}
	else {
		printf("필요없다면 바이바이");
	}
	return 0;
}