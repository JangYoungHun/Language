#include<iostream>
#include<vector>
#include<algorithm>
#include<cmath>

//https://www.acmicpc.net/problem/14501
//ÇØ°á 
using namespace std;

void solution(vector<pair<int, int>>& v, int start, int n, int left, int money, int& result ) {

	if (left == 0 || start == n) {
		result = max(result, money);
		return;
	}

	for (int i = start; i < n; ++i) {
		if (v[i].first <= left) {
			solution(v, i + v[i].first, n, left - v[i].first, money + v[i].second, result);
	
		}
		else
			result = max(result, money);	

		left--;
	}

}

 

int main() {

	int n;
	cin >> n;
	vector<pair<int, int>> v;
	int result = 0;

	for (int i = 0; i < n; ++i) {
		int day, money;
		cin >> day >> money;
		v.push_back(pair<int, int>(day, money));

	}

	solution(v, 0, n, n, 0, result);
	cout << result;


}
