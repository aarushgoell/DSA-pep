#include<bits/stdc++.h>
using namespace std;

    void hello(int n){
        if(n == 0)return;
        cout<<n<<" ";
        hello(n-1);
    }


int main(){

    hello(5);
    return 0;
}