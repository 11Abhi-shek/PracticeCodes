#include<iostream>
using namespace std;

int main()
{
	int n=5;
	int *p=&n;
	cout<<p<<endl;
	//*p=*p+1;
	//cout<<*p+1<<endl; //vaule of *p changes only in this line
	cout<<*p<<endl;
	int *q=p;
	cout<<*q;
}
