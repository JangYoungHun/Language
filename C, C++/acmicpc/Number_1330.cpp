
#include <iostream>

//https://www.acmicpc.net/problem/1330
//ÇØ°á 

using namespace std;

int main() 
{
    int a, b;
    cin >> a >> b;
    string str;
    if (a == b)
        str = "==";
    else
        str = (a > b) ? ">" : "<";
    std::cout << str;
}

