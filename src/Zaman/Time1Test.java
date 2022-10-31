package Zaman;

public class Time1Test 
{
   public static void main(String[] args)
   {
	   /*
	   Time1 saat = new Time1();
	   saat.setTime(12,45,50); // tanımlama için kullandık
	   System.out.println(saat.saat());
	   saat.setTime(30, 60, 100);
	   System.out.println("Set sayisi : "+ Time1.getCount());
	   */
	   Time2 saat2 = new Time2(9,30);
	   saat2.setSaatDakika(9, 30);
	   System.out.println(saat2.saat());
	   Time2 saat3 = new Time2(15,45,50);
	   saat2.setSaatDakikaSaniye(15, 45, 50);
	   System.out.println(saat3.saat());
    }


}
