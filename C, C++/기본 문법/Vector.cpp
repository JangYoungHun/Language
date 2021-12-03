
#include<vector>
#include <iostream>

using namespace std;

void printVector(vector<int>& v) {

	for (vector<int>::iterator it = v.begin(); it != v.end(); ++it) {
		cout << *it << " ";
	}

}

//참조자 사용 O
void insertTest1(vector<int>& v) {

	v.push_back(10);
	v.insert(v.begin(), -1);
}
// 참조자 사용 X
void insertTest2(vector<int> v) {

	v.push_back(10);
	v.insert(v.begin(), -1);
}


int main() {

	vector<int> v = { 1,2,3,4,5,6,7,8,9 };

	v.push_back(10);
	v.insert(v.begin()+3, 15);
	v.erase(v.begin() + 3);
//	v.erase(v.end());    // 에러 발생  맨뒤 삭제시  end()-1
	v.erase(v.end()-1);  

	insertTest1(v);  // 참조자 사용 O  함수에서 값 변경 반영 O
//	insertTest2(v);  // 참조자 사용 X  함수에서 값 변경 반영 X
	printVector(v);

	vector<int>().swap(v);

}

