
#include <iostream>

using namespace std;
//https://www.acmicpc.net/problem/2753
//ÇØ°á 
int main()
{
    int year;
    cin >> year;
    int result = 0;

    if (year % 4 == 0) {
        
        if (year % 100 != 0 || year % 400 == 0) {
            result = 1;
        }
    }

    cout << result;
}
