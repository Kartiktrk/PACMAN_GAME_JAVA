#include <iostream>

using namespace std;

int solve(){

	int n;
	cin >> n;

	string s;

	cin >> s;

	stack<int> st;
	int cnt = 0;
	for(int i = 0 ; i < s.length() ; i++){
		if(s[i] == '1') cnt++;
	}

	if(cnt % 2 == 0) cout << "0" << "\n";
	else cout << "1" << "\n";

	return 0;
}

int main(){
	
	int t;
	while(t--){
		solve();
	}

	return 0;
}
