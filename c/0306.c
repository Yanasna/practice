#include <stdio.h>
#include <windows.h>
#include <time.h>
#include "Screen.h"


typedef struct _BAR {
	int nX[3];
	int nY;
	clock_t OldTime;
	clock_t MoveTime;
} BAR;

BAR g_sBar;

void Init()
{
	g_sBar.nY = 20;
	g_sBar.nX[0] = 30;
	g_sBar.nX[1] = 32;
	g_sBar.nX[2] = 34;
	g_sBar.MoveTime = 100;
	g_sBar.OldTime = clock();
}

void Updata()
{

}

void Render() {
	int i;
	ScreenClear();

	for (i = 0; i < 3;)
	{
		ScreenPrint(g_sBar.nX[i], g_sBar.nY, "")
	}
}
