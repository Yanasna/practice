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

using namespace std;

void gamefirst(bool firstTime, string p_name);
string nameSet();

void gamefirst(bool firstTime, string p_name) {
	p_name = nameSet();
	cout << p_name << "님 환영합니다!";

	firstTime = false;
}

string nameSet() {
	cout << "당신의 이름은 무엇입니까?";
	cout << endl;

	string name;
	int nameInt;

	cin >> name;
	cout << "당신의 이름은 " << name << "!" << endl;
	cout << "예 -> 1 아니오 -> 2" << endl;
	cin >> nameInt;

	if (nameInt == 2) {
		return nameSet();
	}

	else if (nameInt == 1) {
		return name;
	}
	else {
		cout << "다시입력해주세요!" << endl;
		return nameSet();
	}
}
int main(void){
		static bool firstTime = true;
		string p_name;

    	cout << "게임스타트 !!" << endl;
		
		gamefirst(firstTime, p_name);


    return 0;
}
