#include <iostream>
using namespace std;
const int N=100010;
//因为是前缀和，数还是比较大的
long long  a[N];
//这里cnt[]最差情况也就所有数的余数相同（最大也就100000），不需要long long
int cnt[N];
int main()
{
  int n,m;
  cin>>n>>m;
 cnt[0]=1;
  long long res=0;

  for(int i=1;i<=n;i++){
    cin>>a[i];
    a[i]+=a[i-1];
    res=res+cnt[a[i]%m];
    cnt[a[i]%m]++;

  }
  cout<<res;
  
  return 0;
}
