package day05;

public class Orang {

	int id;
	String nama;
	String alamat;
	String jk;
	String noTlp;

	public Orang(int a, String b, String c, String d, String e) {
		id = a;
		nama = b;
		alamat = c;
		jk = d;
		noTlp = e;
	}

	public void cetakData()

	{
		System.out.println("ID: " + id);
		System.out.println("Nama: " + nama);
		System.out.println("Alamat: " + alamat);
		System.out.println("Jenis Kelamin" + jk);
		System.out.println("No Telp: " + noTlp);

		System.out.println();
	}
	

	}

