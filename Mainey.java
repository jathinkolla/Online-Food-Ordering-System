import java.util.*;
public class Mainey
{
 public static void main (String args[])
 {
 Scanner sc = new Scanner (System.in);
 System.out.println ("Enter your oder: \n1. Burger\n2.Pizza\n3.French Fries\n4.Mojito\n5.Chicken Mandi\n6.Fruit Juice\n7.Cocktail\n8.Mocktail\n9.Bucket Chicken\n10.Chicken Wings\n11.Pani Puri\n12.Emoo\n13.Chicken Biryani\n14.Chicken Kabab\n15.Panner Tikka\n16.Panner butter masala\n17.kurbani ka mita\n18.pav bhaji\n19.wada Pav\n20.Nuggets\n21.Kofta\n22.veg Fried Rice");
 int item = sc.nextInt ();
 switch (item)
 {
 case 1:
System.out.println ("you have ordered Burger ");
System.out.println ("please the quantity requried");
int q = sc.nextInt ();
int price = 200;
int st;
 st = q * price;
 System.out.println ("the total amount to be paid is " + st);
 break;
case 2:
 System.out.println ("you have ordered Pizza ");
 System.out.println ("please the quantity requried");
int a = sc.nextInt ();
int qu = 300;
int st1;
 st1 = a * qu;
 System.out.println ("the total amount to be paid is " + st1);
 break;
case 3:
 System.out.println ("you have ordered French Fries ");
 System.out.println ("please the quantity requried");
int b = sc.nextInt ();
int wh = 400;
int st2;
 st2 = b * wh;
 System.out.println ("the total amount to be paid is " + st2);
 break;
case 4:
 System.out.println ("you have ordered Mojito ");
 System.out.println ("please the quantity requried");
int c = sc.nextInt ();
int ex = 500;
int st3;
 st3 = c * ex;
 System.out.println ("the total amount to be paid is " + st3);
 break;
case 5:
 System.out.println ("you have ordered Chicken Mandi ");
 System.out.println ("please the quantity requried");
int d = sc.nextInt ();
int rh = 600;
int st4;
 st4 = d * rh;
 System.out.println ("the total amount to be paid is " + st4);
 break;
case 6:
 System.out.println ("you have ordered Fruit Juice ");
 System.out.println ("please the quantity requried");
int e = sc.nextInt ();
int ts = 700;
int st5;
 st5 = e * ts;
 System.out.println ("the total amount to be paid is " + st5);
 break;
case 7:
 System.out.println ("you have ordered Cocktail ");
 System.out.println ("please the quantity requried");
int f = sc.nextInt ();
int yk = 800;
int st6;
 st6 = f * yk;
 System.out.println ("the total amount to be paid is " + st6);
 break;
case 8:
 System.out.println ("you have ordered Mocktail ");
 System.out.println ("please the quantity requried");
int g = sc.nextInt ();
int us = 900;
int st7;
 st7 = g * us;
 System.out.println ("the total amount to be paid is " + st7);
 break;
case 9:
 System.out.println ("you have ordered bucket chicken ");
 System.out.println ("please the quantity requried");
int h = sc.nextInt ();
int ik = 800;
int st8;
 st8 = h * ik;
 System.out.println ("the total amount to be paid is " + st8);
 break;
case 10:
 System.out.println ("you have ordered chicken wings ");
 System.out.println ("please the quantity requried");
int i = sc.nextInt ();
int oy = 700;
int st9;
 st9 = i * oy;
 System.out.println ("the total amount to be paid is " + st9);
 break;
case 11:
 System.out.println ("you have ordered Pani Puri ");
 System.out.println ("please the quantity requried");
int j = sc.nextInt ();
int ps = 600;
int st10;
 st10 = j * ps;
 System.out.println ("the total amount to be paid is " + st10);
 break;
case 12:
 System.out.println ("you have ordered Emoo ");
 System.out.println ("please the quantity requried");
int k = sc.nextInt ();
int aj = 500;
int st11;
 st11 = k * aj;
 System.out.println ("the total amount to be paid is " + st11);
 break;
case 13:
 System.out.println ("you have ordered Chicken Biryani ");
 System.out.println ("please the quantity requried");
int l = sc.nextInt ();
int su = 400;
int st12;
 st12 = l * su;
 System.out.println ("the total amount to be paid is " + st12);
 break;
case 14:
 System.out.println ("you have ordered Chicken Kabab ");
 System.out.println ("please the quantity requried");
int m = sc.nextInt ();
int da = 300;
int st13;
 st13 = m * da;
 System.out.println ("the total amount to be paid is " + st13);
 break;
case 15:
 System.out.println ("you have ordered Panner Tikka ");
 System.out.println ("please the quantity requried");
int n = sc.nextInt ();
int fu = 200;
int st14;
 st14 = n * fu;
 System.out.println ("the total amount to be paid is " + st14);
 break;
case 16:
 System.out.println ("you have ordered Panner butter masala ");
 System.out.println ("please the quantity requried");
int o = sc.nextInt ();
int ga = 100;
int st15;
 st15 = o * ga;
 System.out.println ("the total amount to be paid is " + st15);
 break;
case 17:
 System.out.println ("you have ordered kurbani ka mita ");
 System.out.println ("please the quantity requried");
int p = sc.nextInt ();
int hr = 200;
int st16;
 st16 = p * hr;
 System.out.println ("the total amount to be paid is " + st16);
 break;
case 18:
 System.out.println ("you have ordered pav bhaji ");
 System.out.println ("please the quantity requried");
int r = sc.nextInt ();
int ja = 300;
int st17;
 st17 = r * ja;
 System.out.println ("the total amount to be paid is " + st17);
 break;
case 19:
 System.out.println ("you have ordered vada Pav ");
 System.out.println ("please the quantity requried");
int s = sc.nextInt ();
int kv = 400;
int st18;
 st18 = s * kv;
 System.out.println ("the total amount to be paid is " + st18);
 break;
case 20:
 System.out.println ("you have ordered Nuggets ");
 System.out.println ("please the quantity requried");
int t = sc.nextInt ();
int lc = 500;
int st19;
 st19 = t * lc;
 System.out.println ("the total amount to be paid is " + st19);
 break;
case 21:
 System.out.println ("you have ordered Kofta ");
 System.out.println ("please the quantity requried");
int u = sc.nextInt ();
int zx = 600;
int st20;
 st20 = u * zx;
 System.out.println ("the total amount to be paid is " + st20);
 break;
case 22:
 System.out.println ("you have ordered veg Fried Rice ");
 System.out.println ("please the quantity requried");
int v = sc.nextInt ();
int xy = 700;
int st21;
 st21 = v * xy;
 System.out.println ("the total amount to be paid is " + st21);
 break;
 }
 int num;
 {
 System.out.println("Enter your phone number");
 }
 Scanner user=new Scanner(System.in);
 num=user.nextInt();
 String name,address;
 {
 System.out.println("Enter your Name and Address");
 }
 name=user.nextLine();
 address =user.nextLine();
 }
}
