//#include<iostream>
//
//int main() {
//	using namespace std;
//	cout << "C++의 세계로~";
//	cout << endl;
//	cout << "후회하지 않을겁니다!" << endl;
//	return 0;
//}
//#include <SDL3/SDL.h>
//
//int main(int argc, char* argv[]) {
//    if (SDL_Init(SDL_INIT_VIDEO) != 0) {
//        SDL_Log("SDL 초기화 실패: %s", SDL_GetError());
//        return 1;
//    }
//
//    SDL_Window* window = SDL_CreateWindow("SDL3 Game Window",
//        800, 600,
//        0); 
//
//    if (!window) {
//        SDL_Log("윈도우 생성 실패: %s", SDL_GetError());
//        SDL_Quit();
//        return 1;
//    }
//
//    SDL_Delay(3000);
//    SDL_DestroyWindow(window);
//    SDL_Quit();
//    return 0;
//}

#include<iostream>
#include <windows.h>
#include<string>

int main(void)	 {
    std::string message = "HELLO WORLD";

    // 콘솔 핸들 가져오기
    HANDLE hConsole = GetStdHandle(STD_OUTPUT_HANDLE);
    CONSOLE_SCREEN_BUFFER_INFO csbi;

    // 콘솔 정보 가져오기
    if (GetConsoleScreenBufferInfo(hConsole, &csbi)) {
        int consoleWidth = csbi.srWindow.Right - csbi.srWindow.Left + 1;

        // 가운데 정렬을 위한 시작 위치 계산
        int startX = (consoleWidth - message.length()) / 2;

        // 커서 위치 이동
        COORD coord;
        coord.X = startX;
        coord.Y = csbi.dwCursorPosition.Y; // 현재 줄 유지
        SetConsoleCursorPosition(hConsole, coord);

        // 메시지 출력
        std::cout << message << std::endl;
    }
    else {
        std::cerr << "콘솔 정보 가져오기 실패!" << std::endl;
    }

    return 0;
}