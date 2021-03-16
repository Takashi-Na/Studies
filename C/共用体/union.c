#include <stdio.h>

union book
{
  char name[16];
  int price;
};

int main(void)
{
  union book bk = {"桃太郎"};           /*宣言と初期化*/
  printf("本の名前は%sです\n", bk.name);

  union book *p;                      /*共用体*/
  p = &bk;                            /*ポインタにunion型の変数のアドレスを代入*/
  p->price = 500;                     /*ポインタを使って別メンバへの値の代入*/
  printf("本の価格は%dです\n", p->price);
  
  return 0;
}
