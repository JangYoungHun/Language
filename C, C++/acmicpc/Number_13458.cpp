
#include <iostream>
#include<vector>

using namespace std;


//https://www.acmicpc.net/problem/13458
// 해결
int main()
{
    long result = 0;
    int N,A,B,C;
    cin >> N;
    vector<int> v;
    for(int i = 0; i < N; ++i) {
        cin >> A;
        v.push_back(A);
    }

    cin >> B >> C;

    while (!v.empty()) {
        int num = v.back();
        v.pop_back();

        num -= B;
        result++;

        if (num > 0) {
        int div = num / C;
        if (num % C == 0) {
            result += div;
        }
        else
            result = result + div + 1;
    }
    }

    cout << result;

}

