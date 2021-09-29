
#include <iostream>
#include<vector>
#include<algorithm>
#include<cmath>
using namespace std;
//https://www.acmicpc.net/problem/1427
// ÇØ°á 


bool compare(int num1, int num2) {
    return num1 > num2;
}

int main()
{
    string str;
    cin >> str;

    vector<long> v;

    for (int i = 0; i < str.length(); ++i ) {   
        v.push_back((int)(str.at(i)-'0'));        
    }   

    sort(v.begin(), v.end(), compare);

    for (int i = 0; i < v.size(); ++i) {
        cout << v[i];
           
    }
    sort(v.begin(), v.end(), compare);


    v.clear();
    vector<long>().swap(v);
}
