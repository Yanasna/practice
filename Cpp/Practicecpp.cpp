//#include<iostream>
//
//int main() {
//	using namespace std;
//	cout << "C++의 세계로~";
//	cout << endl;
//	cout << "후회하지 않을겁니다!" << endl;
//	return 0;
//}
#include <SDL3/SDL.h>

int main(int argc, char* argv[]) {
    if (SDL_Init(SDL_INIT_VIDEO) != 0) {
        SDL_Log("SDL 초기화 실패: %s", SDL_GetError());
        return 1;
    }

    SDL_Window* window = SDL_CreateWindow("SDL3 Game Window",
        800, 600,
        0); 

    if (!window) {
        SDL_Log("윈도우 생성 실패: %s", SDL_GetError());
        SDL_Quit();
        return 1;
    }

    SDL_Delay(3000);
    SDL_DestroyWindow(window);
    SDL_Quit();
    return 0;
}