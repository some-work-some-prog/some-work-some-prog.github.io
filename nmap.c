#include<stdio.h>
#include<stdlib.h>

int main() {
char a;
printf("Scan network for hosts? Y/n: ");
scanf("%c", &a);
if (a == 'Y') {
system("nmap -sP _gateway/24");
}
else {
}
return 0;
}
