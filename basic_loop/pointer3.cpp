#include<iostream>
using namespace std;

int main()
{
	int n1,n2,n3;
	cin>>n1>>n2>>n3;
	int *p1=&n1;
	int *p2=&n2;
	int *p3=&n3;
	
	// only for greatest
//	if(*p1>*p2 && *p1>*p3)
//	{
//		cout<<"n1 is greater and value="<<*p1<<endl;
//	}
//	else if(*p2>*p1 && *p2>*p3)
//	{
//		cout<<"n2 is greater and value="<<*p2<<endl;
//	}
//	else{
//			cout<<"n3 is greater and value="<<*p3<<endl;
//	}
  
  //greatest and smallest both
  
  if(*p1>*p2 && *p2>*p3)
  {
  	cout<<"n1 is greater and value="<<*p1<<endl;
  	cout<<"n3 is smallest and value="<<*p3<<endl;
  }
  else if(*p1<*p2 && *p2<*p3)
  {
  	cout<<"n3 is greater and value="<<*p3<<endl;
  	cout<<"n1 is smallest and value="<<*p1<<endl;
  }
   else if(*p2>*p1 && *p1>*p3)
   {
   	cout<<"n2 is greater and value="<<*p2<<endl;
  	cout<<"n3 is smallest and value="<<*p3<<endl;
   }
   else{
   	cout<<"n2 is greater and value="<<*p2<<endl;
  	cout<<"n1 is smallest and value="<<*p1
	  <<endl;
   }
  
	return 0;
	
}
