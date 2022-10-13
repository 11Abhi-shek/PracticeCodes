//Stl standerd templete library

#include<iostream>
using namespace std;
#include<algorithm>
#include<vector>

int main()
{
	cout<<"using vector"<<endl;
	
	vector <int> v;
//	for(int i=0,i<5;i++)
//	{
//		push_back(i);
//	}
v.push_back(2);
v.push_back(7);
v.push_back(1);
v.push_back(3);
v.push_back(29);
//cout<<"search 7="<<binary_search(v.begin(),v.end(),7)<<endl;
sort(v.begin(),v.end());
for(const auto &i:v)
{
	cout<< i <<" "<<endl;
}

	return 0;
}

