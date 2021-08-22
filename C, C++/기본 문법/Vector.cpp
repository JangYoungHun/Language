
#include<vector>
#include <iostream>

using namespace std;

void printVector(vector<int>& v) {

	for (vector<int>::iterator it = v.begin(); it != v.end(); ++it) {
		cout << *it << " ";
	}

}

//������ ��� O
void insertTest1(vector<int>& v) {

	v.push_back(10);
	v.insert(v.begin(), -1);
}
// ������ ��� X
void insertTest2(vector<int> v) {

	v.push_back(10);
	v.insert(v.begin(), -1);
}


int main() {

	vector<int> v = { 1,2,3,4,5,6,7,8,9 };

	v.push_back(10);
	v.insert(v.begin()+3, 15);
	v.erase(v.begin() + 3);
//	v.erase(v.end());    // ���� �߻�  �ǵ� ������  end()-1
	v.erase(v.end()-1);  

	insertTest1(v);  // ������ ��� O  �Լ����� �� ���� �ݿ� O
//	insertTest2(v);  // ������ ��� X  �Լ����� �� ���� �ݿ� X
	printVector(v);

	vector<int>().swap(v);

}

