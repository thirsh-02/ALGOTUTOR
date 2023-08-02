
bool isAnagram(char * s, char * t){
  if (strlen(s)!=strlen(t)){
      return false;
  }
int arr[26]={0};
    for(int i=0;i<strlen(s);i++){
       arr[s[i]-'a']++;
   }
for(int i=0;i<strlen(t);i++){
    int x=--arr[t[i]-'a'];
    if(x<0){
        return false;
    }
}
    return true;
}