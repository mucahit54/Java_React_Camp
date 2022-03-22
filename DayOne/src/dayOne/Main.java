package dayOne;

public class Main {

	public static void main(String[] args) {
		
		//camelCase olarak isim verilir
		String internetSubeButonu = "Ýnternet Þubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu=true;
		
		System.out.println(internetSubeButonu);
		
		if (dolarBugun < dolarDun) {
			System.out.println("Dolar Düþtü Resmi");
	
		}else if (dolarBugun > dolarDun) {
			System.out.println("Dolar Çýktý Resmi");
		
		}else {
			System.out.println("Dolar Deðiþmedi Resmi");
		}
		
		System.out.println("------------------------------------------------------------------------------------");
		
		String [] krediler = {
				
				"Hýzlý kredi",
				"metlu kredi ",
				"konut kredi",
				"meb kredi",
				"çiftçi kredi",
				"msb kredi"
		};
		// foreach
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		
		int sayi1=10;
        int sayi2=20;
        sayi1=sayi2;
        sayi2=100;
        System.out.println(sayi1);
        
        int [] sayilar1={1,2,3,4,5};
        int [] sayilar2={10,20,30,40,50};
        sayilar1 = sayilar2;
        sayilar2[0]=100;
        System.out.println(sayilar1[0]);
        
        String Sehir1="Ankara";
        String Sehir2="Ýstanbul";
        Sehir1=Sehir2;
        Sehir2="Ýzmir";
        System.out.println(Sehir1);
        
        int number = 10;
        String message = "Öðrenci Sayýsý: ";
        System.out.println(message + number);
        
        double num = 12.5;
        int intnum = -129;
        char ch = 'A';
        System.out.println(num);
        System.out.println(intnum);
        System.out.println(ch);

        int number1 = 25;
        if (number1 > 50) {
            System.out.println("Sayý 50'den büyüktür");
        } else if (number1 == 20) {
            System.out.println("Sayý 50'ye eþittir.");
        } else {
            System.out.println("Sayý 50'den küçüktür");
        }

        int sayi3 = 56;
        int sayi4 = 25;
        int sayi5 = 79;
        int biggest = sayi1;

        if (biggest < sayi2) {
            biggest = sayi2;
        } else if (biggest < sayi3) {
            biggest = sayi3;
        }
        System.out.println("En büyük : " + biggest);

        

        
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);

        }
        System.out.println("LOOP DONE");
        System.out.println("Tek Sayýlar");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);

        }
        System.out.println("While Loop");
        int a = 0;
        while (a < 10) {
            System.out.println(a);
            a++;
        }
        System.out.println("Do-While Loop");
        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);

        String[] students = new String[]{"Ali", "Veli", "Muhammed", "Sinem", "Özlem"};
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("Foreach");
        for (String student : students) {
            System.out.println(student);
        }
        
        
        double[] myList = {1, 2.5, 4.6, 3.7, 7};
        double total = 0;
        double max = myList[0];
        for (double sayi : myList) {
            if (max < sayi) {
                max = sayi;
            }
            total = total + sayi;
            System.out.println(sayi);
        }
        System.out.println("TOTAL: " + total);
        System.out.println("Max : " + max);
        
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        
        String[][] cities = new String[3][3];
        cities[0][0] = "Ýstanbul";
        cities[0][1] = "Bursa";
        cities[0][2] = "Bilecik";
        cities[1][0] = "Ankara";
        cities[1][1] = "Konya";
        cities[1][2] = "Kayseri";
        cities[2][0] = "Diyarbakýr";
        cities[2][1] = "Þanlýurfa";
        cities[2][2] = "Gaziantep";
        for (int i = 0; i < 3; i++) {
            System.out.println("*********************");
            for (int k = 0; k < 3; k++) {
                System.out.println(cities[i][k]);
            }
        }
        

        int nmbr = 1458846;
        boolean flag = false;
        for (int i = 2; i < nmbr; ++i) {
            if (nmbr % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(nmbr + " asal sayýdýr.");
        else
            System.out.println(nmbr + " asal sayý deðildir.");
	}

}

