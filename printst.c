#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>

main()
{
	printf("�Ƕ�̵� ������ �Է��ϼ��� : ");
	int floor = 0;
	scanf_s("%d", &floor);
	int star_count = 0;
	int blank = 0;

	for (int i = 0; i < floor; i++) {
		for (blank = i ; blank < floor; blank++) {
			printf(" ");
		}
		printf("*");
		for (int l = 0; l < star_count; l++) {
			printf("*");
		}
		star_count += 2;
		printf("\n"); //��
	}
}


//main(){
// printf("������");
//
// for (int i = 1; i < 10; i++) {
//	 printf("%d ��\n", i);
//	 for (int l = 1; l < 10; l++) {
//		 printf("%d * %d = %d\n", i,  l, i * l);
//	 }
// }
// printf("���ϴ� �� �Է� : \n");
// int su = 0;
//
// scanf_s("%d", &su);
//
// for (int y = 1; y < 10; y++)
// {
//	 printf("%d * %d = %d\n", su,  y, su * y);
// }
// return 0;
//}